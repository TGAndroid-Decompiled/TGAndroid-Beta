package org.telegram.messenger.utils;

import android.util.SparseIntArray;
import androidx.collection.LongSparseArray;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.BaseController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;

public class EphemeralMessagesHelper extends BaseController {
    private static volatile EphemeralMessagesHelper[] Instance = new EphemeralMessagesHelper[4];

    public static TL_ephemeral.EphemeralMessage convertFakeDefaultToEphemeral(TLRPC.Message message, int i) {
        TL_ephemeral.TL_ephemeralMessage tL_ephemeralMessage = new TL_ephemeral.TL_ephemeralMessage();
        tL_ephemeralMessage.out = message.out;
        tL_ephemeralMessage.invert_media = message.invert_media;
        tL_ephemeralMessage.noforwards = message.noforwards;
        tL_ephemeralMessage.id = MessageObject.ephemeralMessageIdUnpack(message.id);
        tL_ephemeralMessage.from_id = message.from_id;
        tL_ephemeralMessage.peer_id = message.peer_id;
        tL_ephemeralMessage.receiver_id = message.ephemeralReceiverBotId;
        if (i != 0) {
            tL_ephemeralMessage.top_msg_id = i;
            tL_ephemeralMessage.flags |= 2;
        }
        tL_ephemeralMessage.date = message.date;
        tL_ephemeralMessage.message = message.message;
        tL_ephemeralMessage.entities = message.entities;
        tL_ephemeralMessage.media = message.media;
        tL_ephemeralMessage.reply_markup = message.reply_markup;
        tL_ephemeralMessage.reply_to = message.reply_to;
        tL_ephemeralMessage.rich_message = message.rich_message;
        tL_ephemeralMessage.via_bot_id = message.via_bot_id;
        tL_ephemeralMessage.anchor_msg_id = message.ephemeralAnchorMsgId;
        return tL_ephemeralMessage;
    }

    public static TLRPC.TL_message convertEphemeralToFakeDefault(TL_ephemeral.EphemeralMessage ephemeralMessage) {
        int i;
        int i2;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = ephemeralMessage.out;
        tL_message.id = MessageObject.ephemeralMessageIdPack(ephemeralMessage.id);
        TLRPC.Peer peer = ephemeralMessage.from_id;
        if (peer != null) {
            tL_message.from_id = peer;
            tL_message.flags |= 256;
        }
        tL_message.peer_id = ephemeralMessage.peer_id;
        int i3 = ephemeralMessage.anchor_msg_id;
        tL_message.ephemeralAnchorMsgId = i3;
        if (ephemeralMessage.welcome || i3 != 0) {
            tL_message.ephemeralReceiverBotId = -1L;
        } else {
            tL_message.ephemeralReceiverBotId = ephemeralMessage.receiver_id;
        }
        tL_message.date = ephemeralMessage.date;
        tL_message.message = ephemeralMessage.message;
        if (ephemeralMessage.noforwards) {
            tL_message.noforwards = true;
            tL_message.flags |= 67108864;
        }
        if (ephemeralMessage.invert_media) {
            tL_message.invert_media = true;
            tL_message.flags |= 134217728;
        }
        TL_iv.RichMessage richMessage = ephemeralMessage.rich_message;
        if (richMessage != null) {
            tL_message.rich_message = richMessage;
            tL_message.flags2 |= 8192;
        }
        ArrayList<TLRPC.MessageEntity> arrayList = ephemeralMessage.entities;
        if (arrayList != null && !arrayList.isEmpty()) {
            tL_message.entities = ephemeralMessage.entities;
            tL_message.flags |= 128;
        }
        TLRPC.MessageMedia messageMedia = ephemeralMessage.media;
        if (messageMedia != null && ephemeralMessage.rich_message == null) {
            tL_message.media = messageMedia;
            tL_message.flags |= 512;
        }
        TLRPC.ReplyMarkup replyMarkup = ephemeralMessage.reply_markup;
        if (replyMarkup != null) {
            tL_message.reply_markup = replyMarkup;
            tL_message.flags |= 64;
        }
        long j = ephemeralMessage.via_bot_id;
        if (j != 0) {
            tL_message.via_bot_id = j;
            tL_message.flags |= 2048;
        }
        TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage.reply_to;
        if (messageReplyHeader != null) {
            TLRPC.MessageReplyHeader messageReplyHeader2 = (TLRPC.MessageReplyHeader) TLObject.deepCopy(messageReplyHeader, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData, int i4, boolean z) {
                    return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i4, z);
                }
            });
            tL_message.reply_to = messageReplyHeader2;
            if (ephemeralMessage.reply_to.reply_to_ephemeral && (i2 = messageReplyHeader2.reply_to_msg_id) != 0) {
                messageReplyHeader2.reply_to_msg_id = MessageObject.ephemeralMessageIdPack(i2);
                tL_message.reply_to.reply_to_msg_id |= 16;
            }
            TLRPC.MessageReplyHeader messageReplyHeader3 = tL_message.reply_to;
            if (messageReplyHeader3.reply_to_top_id == 0 && (i = ephemeralMessage.top_msg_id) != 0) {
                messageReplyHeader3.reply_to_top_id = i;
                messageReplyHeader3.forum_topic = true;
                messageReplyHeader3.flags |= 2;
            }
            tL_message.flags |= 8;
        } else if (ephemeralMessage.top_msg_id != 0) {
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_message.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.reply_to_top_id = ephemeralMessage.top_msg_id;
            tL_messageReplyHeader.forum_topic = true;
            tL_messageReplyHeader.flags |= 2;
            tL_message.flags |= 8;
        }
        MessageObject.getDialogId(tL_message);
        return tL_message;
    }

    public boolean beforeSendingFinalRequest(TLObject tLObject, MessageObject messageObject, Utilities.Callback callback) {
        return beforeSendingFinalRequest(tLObject, Collections.singletonList(messageObject), callback);
    }

    public boolean beforeSendingFinalRequest(TLObject tLObject, List list, Utilities.Callback callback) {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        if (list == null || list.isEmpty() || (tLObject instanceof TL_ephemeral.TL_sendMessage)) {
            return true;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
            TLRPC.TL_messages_sendMessage tL_messages_sendMessage = (TLRPC.TL_messages_sendMessage) tLObject;
            if (tL_messages_sendMessage.ephemeralReceiverBotId != 0) {
                TL_ephemeral.TL_sendMessage tL_sendMessage = new TL_ephemeral.TL_sendMessage();
                tL_sendMessage.peer = tL_messages_sendMessage.peer;
                if (tL_messages_sendMessage.ephemeralReceiverBotId == -1) {
                    tL_sendMessage.receiver_id = new TLRPC.TL_inputUserEmpty();
                    tL_sendMessage.welcome = true;
                } else {
                    tL_sendMessage.receiver_id = getMessagesController().getInputUser(tL_messages_sendMessage.ephemeralReceiverBotId);
                }
                tL_sendMessage.query_id = 0L;
                tL_sendMessage.message = tL_messages_sendMessage.message;
                tL_sendMessage.entities = tL_messages_sendMessage.entities;
                tL_sendMessage.media = null;
                tL_sendMessage.reply_markup = tL_messages_sendMessage.reply_markup;
                tL_sendMessage.rich_message = tL_messages_sendMessage.rich_message;
                tL_sendMessage.random_id = tL_messages_sendMessage.random_id;
                tL_sendMessage.reply_to = applyReplyTo(tL_messages_sendMessage.reply_to);
                tL_sendMessage.rich_message = tL_messages_sendMessage.rich_message;
                tL_sendMessage.invert_media = tL_messages_sendMessage.invert_media;
                callback.run(tL_sendMessage);
                return false;
            }
            long peerDialogId = DialogObject.getPeerDialogId(tL_messages_sendMessage.peer);
            if (peerDialogId < 0 && (chatFull2 = getMessagesController().getChatFull(-peerDialogId)) != null) {
                long ephemeralCommandBotId = getEphemeralCommandBotId(tL_messages_sendMessage.message, chatFull2.bot_info);
                if (ephemeralCommandBotId != 0) {
                    tL_messages_sendMessage.ephemeralReceiverBotId = ephemeralCommandBotId;
                    return beforeSendingFinalRequest(tLObject, list, callback);
                }
            }
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            if (tL_messages_sendMedia.ephemeralReceiverBotId != 0) {
                TL_ephemeral.TL_sendMessage tL_sendMessage2 = new TL_ephemeral.TL_sendMessage();
                tL_sendMessage2.peer = tL_messages_sendMedia.peer;
                if (tL_messages_sendMedia.ephemeralReceiverBotId == -1) {
                    tL_sendMessage2.receiver_id = new TLRPC.TL_inputUserEmpty();
                    tL_sendMessage2.welcome = true;
                } else {
                    tL_sendMessage2.receiver_id = getMessagesController().getInputUser(tL_messages_sendMedia.ephemeralReceiverBotId);
                }
                tL_sendMessage2.query_id = 0L;
                tL_sendMessage2.message = tL_messages_sendMedia.message;
                tL_sendMessage2.entities = tL_messages_sendMedia.entities;
                tL_sendMessage2.media = tL_messages_sendMedia.media;
                tL_sendMessage2.reply_markup = tL_messages_sendMedia.reply_markup;
                tL_sendMessage2.rich_message = null;
                tL_sendMessage2.random_id = tL_messages_sendMedia.random_id;
                tL_sendMessage2.reply_to = applyReplyTo(tL_messages_sendMedia.reply_to);
                tL_sendMessage2.invert_media = tL_messages_sendMedia.invert_media;
                callback.run(tL_sendMessage2);
                return false;
            }
            long peerDialogId2 = DialogObject.getPeerDialogId(tL_messages_sendMedia.peer);
            if (peerDialogId2 < 0 && (chatFull = getMessagesController().getChatFull(-peerDialogId2)) != null) {
                long ephemeralCommandBotId2 = getEphemeralCommandBotId(tL_messages_sendMedia.message, chatFull.bot_info);
                if (ephemeralCommandBotId2 != 0) {
                    tL_messages_sendMedia.ephemeralReceiverBotId = ephemeralCommandBotId2;
                    return beforeSendingFinalRequest(tLObject, list, callback);
                }
            }
        }
        return true;
    }

    private static TLRPC.InputReplyTo applyReplyTo(TLRPC.InputReplyTo inputReplyTo) {
        if (!(inputReplyTo instanceof TLRPC.TL_inputReplyToMessage)) {
            return inputReplyTo;
        }
        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = (TLRPC.TL_inputReplyToMessage) inputReplyTo;
        if (!MessageObject.isEphemeralMessageId(tL_inputReplyToMessage.reply_to_msg_id)) {
            return inputReplyTo;
        }
        TLRPC.TL_inputReplyToEphemeralMessage tL_inputReplyToEphemeralMessage = new TLRPC.TL_inputReplyToEphemeralMessage();
        tL_inputReplyToEphemeralMessage.id = MessageObject.ephemeralMessageIdUnpack(tL_inputReplyToMessage.reply_to_msg_id);
        return tL_inputReplyToEphemeralMessage;
    }

    public boolean isEphemeralCommand(String str, LongSparseArray longSparseArray) {
        return getEphemeralCommandBotId(str, longSparseArray) > 0;
    }

    public long getEphemeralCommandBotId(String str, long j) {
        TLRPC.ChatFull chatFull;
        if (j >= 0 || (chatFull = getMessagesController().getChatFull(-j)) == null) {
            return 0L;
        }
        return getEphemeralCommandBotId(str, chatFull.bot_info);
    }

    public long getEphemeralCommandBotId(String str, List list) {
        if (str == null || list == null || list.isEmpty() || !str.startsWith("/") || str.length() < 2) {
            return 0L;
        }
        LongSparseArray longSparseArray = new LongSparseArray(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) it.next();
            longSparseArray.put(botInfo.user_id, botInfo);
        }
        return getEphemeralCommandBotId(str, longSparseArray);
    }

    public long getEphemeralCommandBotId(String str, LongSparseArray longSparseArray) {
        String strSubstring;
        String strSubstring2;
        if (str == null || longSparseArray == null || longSparseArray.isEmpty() || !str.startsWith("/") || str.length() < 2) {
            return 0L;
        }
        int iIndexOf = str.indexOf(32);
        if (iIndexOf != -1) {
            strSubstring = str.substring(1, iIndexOf);
        } else {
            strSubstring = str.substring(1);
        }
        int iIndexOf2 = strSubstring.indexOf(64);
        int i = 0;
        if (iIndexOf2 != -1) {
            String strSubstring3 = strSubstring.substring(0, iIndexOf2);
            strSubstring2 = strSubstring.substring(iIndexOf2 + 1);
            strSubstring = strSubstring3;
        } else {
            strSubstring2 = null;
        }
        if (strSubstring.isEmpty()) {
            return 0L;
        }
        if (strSubstring2 != null) {
            while (i < longSparseArray.size()) {
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) longSparseArray.valueAt(i);
                if (UserObject.hasPublicUsername(getMessagesController().getUser(Long.valueOf(botInfo.user_id)), strSubstring2)) {
                    Iterator<TLRPC.BotCommand> it = botInfo.commands.iterator();
                    while (it.hasNext()) {
                        TLRPC.BotCommand next = it.next();
                        if (next.command.equalsIgnoreCase(strSubstring)) {
                            if (next.ephemeral) {
                                return botInfo.user_id;
                            }
                            return 0L;
                        }
                    }
                }
                i++;
            }
            return 0L;
        }
        long j = 0;
        boolean z = false;
        while (i < longSparseArray.size()) {
            TL_bots.BotInfo botInfo2 = (TL_bots.BotInfo) longSparseArray.valueAt(i);
            Iterator<TLRPC.BotCommand> it2 = botInfo2.commands.iterator();
            while (it2.hasNext()) {
                TLRPC.BotCommand next2 = it2.next();
                if (next2.command.equalsIgnoreCase(strSubstring)) {
                    if (j != 0) {
                        return 0L;
                    }
                    j = botInfo2.user_id;
                    z = next2.ephemeral;
                }
            }
            i++;
        }
        if (z) {
            return j;
        }
        return 0L;
    }

    public static class EphemeralUpdates {
        public final Struct welcomeMessagesToAdd = new Struct();
        public final Struct welcomeMessagesToEdit = new Struct();
        public final StructBuilder ephemeralMessagesToAdd = new StructBuilder();
        public final StructBuilder ephemeralMessagesToEdit = new StructBuilder();
        public final StructBuilder welcomeMessagesAnchor = new StructBuilder();

        public static class StructBuilder extends Struct {
            public void put(TL_ephemeral.EphemeralMessage ephemeralMessage) {
                this.messages.add(ephemeralMessage);
            }

            public void build(int i, AbstractMap abstractMap, AbstractMap abstractMap2, int i2) {
                Iterator it = this.messages.iterator();
                while (it.hasNext()) {
                    TLRPC.TL_message tL_messageConvertEphemeralToFakeDefault = EphemeralMessagesHelper.convertEphemeralToFakeDefault((TL_ephemeral.EphemeralMessage) it.next());
                    MessageObject messageObject = new MessageObject(i, (TLRPC.Message) tL_messageConvertEphemeralToFakeDefault, (AbstractMap<Long, TLRPC.User>) abstractMap, (AbstractMap<Long, TLRPC.Chat>) abstractMap2, true, true);
                    long dialogId = MessageObject.getDialogId(tL_messageConvertEphemeralToFakeDefault);
                    if (i2 != 0) {
                        tL_messageConvertEphemeralToFakeDefault.edit_date = i2;
                        tL_messageConvertEphemeralToFakeDefault.flags |= 32768;
                    }
                    TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) this.convertedByDialog.get(dialogId);
                    if (tL_messages_messages == null) {
                        tL_messages_messages = new TLRPC.TL_messages_messages();
                        this.convertedByDialog.put(dialogId, tL_messages_messages);
                    }
                    tL_messages_messages.messages.add(tL_messageConvertEphemeralToFakeDefault);
                    ArrayList arrayList = (ArrayList) this.objectsByDialog.get(dialogId);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.objectsByDialog.put(dialogId, arrayList);
                    }
                    arrayList.add(messageObject);
                }
            }

            public boolean isEmpty() {
                return this.messages.isEmpty();
            }
        }

        public static class Struct {
            public final ArrayList messages = new ArrayList();
            public final LongSparseArray convertedByDialog = new LongSparseArray();
            public final LongSparseArray objectsByDialog = new LongSparseArray();

            public void put(TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.Message message, MessageObject messageObject) {
                long dialogId = MessageObject.getDialogId(message);
                this.messages.add(ephemeralMessage);
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) this.convertedByDialog.get(dialogId);
                if (tL_messages_messages == null) {
                    tL_messages_messages = new TLRPC.TL_messages_messages();
                    this.convertedByDialog.put(dialogId, tL_messages_messages);
                }
                tL_messages_messages.messages.add(message);
                ArrayList arrayList = (ArrayList) this.objectsByDialog.get(dialogId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.objectsByDialog.put(dialogId, arrayList);
                }
                arrayList.add(messageObject);
            }
        }

        public void apply(TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage, int i, AbstractMap abstractMap, AbstractMap abstractMap2) {
            TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateNewEphemeralMessage.message;
            if (ephemeralMessage.anchor_msg_id != 0) {
                this.welcomeMessagesAnchor.put(ephemeralMessage);
            } else {
                if (ephemeralMessage.welcome) {
                    TLRPC.TL_message tL_messageConvertEphemeralToFakeDefault = EphemeralMessagesHelper.convertEphemeralToFakeDefault(ephemeralMessage);
                    this.welcomeMessagesToAdd.put(ephemeralMessage, tL_messageConvertEphemeralToFakeDefault, new MessageObject(i, (TLRPC.Message) tL_messageConvertEphemeralToFakeDefault, (AbstractMap<Long, TLRPC.User>) abstractMap, (AbstractMap<Long, TLRPC.Chat>) abstractMap2, true, true));
                    return;
                }
                this.ephemeralMessagesToAdd.put(ephemeralMessage);
            }
        }

        public void apply(TL_update.TL_updateEditEphemeralMessage tL_updateEditEphemeralMessage, int i, AbstractMap abstractMap, AbstractMap abstractMap2) {
            TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateEditEphemeralMessage.message;
            if (ephemeralMessage.anchor_msg_id != 0) {
                this.welcomeMessagesAnchor.put(ephemeralMessage);
                return;
            }
            if (ephemeralMessage.welcome) {
                TLRPC.TL_message tL_messageConvertEphemeralToFakeDefault = EphemeralMessagesHelper.convertEphemeralToFakeDefault(ephemeralMessage);
                MessageObject messageObject = new MessageObject(i, (TLRPC.Message) tL_messageConvertEphemeralToFakeDefault, (AbstractMap<Long, TLRPC.User>) abstractMap, (AbstractMap<Long, TLRPC.Chat>) abstractMap2, true, true);
                tL_messageConvertEphemeralToFakeDefault.edit_date = ConnectionsManager.getInstance(i).getCurrentTime();
                tL_messageConvertEphemeralToFakeDefault.flags |= 32768;
                this.welcomeMessagesToEdit.put(ephemeralMessage, tL_messageConvertEphemeralToFakeDefault, messageObject);
                return;
            }
            this.ephemeralMessagesToEdit.put(ephemeralMessage);
        }

        public void apply(TL_update.TL_updateDeleteEphemeralMessages tL_updateDeleteEphemeralMessages) {
            DialogObject.getPeerDialogId(tL_updateDeleteEphemeralMessages.peer);
        }
    }

    public static class WelcomeAnchorsState {
        private final LongSparseArray state = new LongSparseArray();

        public void put(long j, int i, int i2) {
            SparseIntArray sparseIntArray = (SparseIntArray) this.state.get(j);
            if (sparseIntArray == null) {
                sparseIntArray = new SparseIntArray();
                this.state.put(j, sparseIntArray);
            }
            sparseIntArray.put(i, i2);
        }

        public void remove(long j, int i, int i2) {
            SparseIntArray sparseIntArray = (SparseIntArray) this.state.get(j);
            if (sparseIntArray != null && sparseIntArray.get(i, -1) == i2) {
                sparseIntArray.delete(i);
                if (sparseIntArray.size() == 0) {
                    this.state.remove(j);
                }
            }
        }

        public SparseIntArray getAnchorBindings(long j) {
            return (SparseIntArray) this.state.get(j);
        }
    }

    private EphemeralMessagesHelper(int i) {
        super(i);
    }

    public static EphemeralMessagesHelper getInstance(int i) {
        EphemeralMessagesHelper ephemeralMessagesHelper = Instance[i];
        if (ephemeralMessagesHelper == null) {
            synchronized (EphemeralMessagesHelper.class) {
                try {
                    ephemeralMessagesHelper = Instance[i];
                    if (ephemeralMessagesHelper == null) {
                        EphemeralMessagesHelper[] ephemeralMessagesHelperArr = Instance;
                        EphemeralMessagesHelper ephemeralMessagesHelper2 = new EphemeralMessagesHelper(i);
                        ephemeralMessagesHelperArr[i] = ephemeralMessagesHelper2;
                        ephemeralMessagesHelper = ephemeralMessagesHelper2;
                    }
                } finally {
                }
            }
        }
        return ephemeralMessagesHelper;
    }
}
