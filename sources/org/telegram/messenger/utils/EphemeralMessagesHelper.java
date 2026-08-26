package org.telegram.messenger.utils;

import android.util.SparseIntArray;
import androidx.collection.LongSparseArray;
import com.google.firebase.messaging.FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.BaseController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;

public final class EphemeralMessagesHelper extends BaseController {
    public static volatile EphemeralMessagesHelper[] Instance = new EphemeralMessagesHelper[4];

    public final class WelcomeAnchorsState {
        public final LongSparseArray state = new LongSparseArray();

        public final SparseIntArray getAnchorBindings(long j) {
            return (SparseIntArray) this.state.get(j);
        }
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
            TLRPC.MessageReplyHeader messageReplyHeader2 = (TLRPC.MessageReplyHeader) TLObject.deepCopy(messageReplyHeader, new FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0(15));
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

    public static TL_ephemeral.TL_ephemeralMessage convertFakeDefaultToEphemeral(TLRPC.Message message, int i) {
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

    public static EphemeralMessagesHelper getInstance(int i) {
        EphemeralMessagesHelper ephemeralMessagesHelper;
        EphemeralMessagesHelper ephemeralMessagesHelper2 = Instance[i];
        if (ephemeralMessagesHelper2 != null) {
            return ephemeralMessagesHelper2;
        }
        synchronized (EphemeralMessagesHelper.class) {
            try {
                ephemeralMessagesHelper = Instance[i];
                if (ephemeralMessagesHelper == null) {
                    EphemeralMessagesHelper[] ephemeralMessagesHelperArr = Instance;
                    EphemeralMessagesHelper ephemeralMessagesHelper3 = new EphemeralMessagesHelper(i);
                    ephemeralMessagesHelperArr[i] = ephemeralMessagesHelper3;
                    ephemeralMessagesHelper = ephemeralMessagesHelper3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ephemeralMessagesHelper;
    }

    public final boolean beforeSendingFinalRequest(TLObject tLObject, List list, Utilities.Callback callback) {
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
                TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMessage.reply_to;
                boolean z = inputReplyTo instanceof TLRPC.TL_inputReplyToMessage;
                TLRPC.InputReplyTo inputReplyTo2 = inputReplyTo;
                if (z) {
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = (TLRPC.TL_inputReplyToMessage) inputReplyTo;
                    if (MessageObject.isEphemeralMessageId(tL_inputReplyToMessage.reply_to_msg_id)) {
                        inputReplyTo2 = inputReplyTo;
                        TLRPC.TL_inputReplyToEphemeralMessage tL_inputReplyToEphemeralMessage = new TLRPC.TL_inputReplyToEphemeralMessage();
                        tL_inputReplyToEphemeralMessage.id = MessageObject.ephemeralMessageIdUnpack(tL_inputReplyToMessage.reply_to_msg_id);
                        inputReplyTo2 = tL_inputReplyToEphemeralMessage;
                    }
                }
                inputReplyTo2 = inputReplyTo;
                tL_sendMessage.reply_to = inputReplyTo2;
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
                TLRPC.InputReplyTo inputReplyTo3 = tL_messages_sendMedia.reply_to;
                boolean z2 = inputReplyTo3 instanceof TLRPC.TL_inputReplyToMessage;
                TLRPC.InputReplyTo inputReplyTo4 = inputReplyTo3;
                if (z2) {
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage2 = (TLRPC.TL_inputReplyToMessage) inputReplyTo3;
                    if (MessageObject.isEphemeralMessageId(tL_inputReplyToMessage2.reply_to_msg_id)) {
                        inputReplyTo4 = inputReplyTo3;
                        TLRPC.TL_inputReplyToEphemeralMessage tL_inputReplyToEphemeralMessage2 = new TLRPC.TL_inputReplyToEphemeralMessage();
                        tL_inputReplyToEphemeralMessage2.id = MessageObject.ephemeralMessageIdUnpack(tL_inputReplyToMessage2.reply_to_msg_id);
                        inputReplyTo4 = tL_inputReplyToEphemeralMessage2;
                    }
                }
                inputReplyTo4 = inputReplyTo3;
                tL_sendMessage2.reply_to = inputReplyTo4;
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

    public final long getEphemeralCommandBotId(long j, String str) {
        TLRPC.ChatFull chatFull;
        if (j >= 0 || (chatFull = getMessagesController().getChatFull(-j)) == null) {
            return 0L;
        }
        return getEphemeralCommandBotId(str, chatFull.bot_info);
    }

    public final long getEphemeralCommandBotId(String str, ArrayList arrayList) {
        if (str == null || arrayList == null || arrayList.isEmpty() || !str.startsWith("/") || str.length() < 2) {
            return 0L;
        }
        LongSparseArray longSparseArray = new LongSparseArray(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj;
            longSparseArray.put(botInfo, botInfo.user_id);
        }
        return getEphemeralCommandBotId(str, longSparseArray);
    }

    public final long getEphemeralCommandBotId(String str, LongSparseArray longSparseArray) {
        String strSubstring;
        String strSubstring2;
        if (str != null && longSparseArray != null && !longSparseArray.isEmpty() && str.startsWith("/") && str.length() >= 2) {
            int iIndexOf = str.indexOf(32);
            if (iIndexOf != -1) {
                strSubstring = str.substring(1, iIndexOf);
            } else {
                strSubstring = str.substring(1);
            }
            int iIndexOf2 = strSubstring.indexOf(64);
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
                for (int i = 0; i < longSparseArray.size(); i++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) longSparseArray.valueAt(i);
                    if (UserObject.hasPublicUsername(getMessagesController().getUser(Long.valueOf(botInfo.user_id)), strSubstring2)) {
                        ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            TLRPC.BotCommand botCommand = arrayList.get(i2);
                            i2++;
                            TLRPC.BotCommand botCommand2 = botCommand;
                            if (botCommand2.command.equalsIgnoreCase(strSubstring)) {
                                if (botCommand2.ephemeral) {
                                    return botInfo.user_id;
                                }
                                return 0L;
                            }
                        }
                    }
                }
                return 0L;
            }
            long j = 0;
            boolean z = false;
            for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
                TL_bots.BotInfo botInfo2 = (TL_bots.BotInfo) longSparseArray.valueAt(i3);
                ArrayList<TLRPC.BotCommand> arrayList2 = botInfo2.commands;
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    TLRPC.BotCommand botCommand3 = arrayList2.get(i4);
                    i4++;
                    TLRPC.BotCommand botCommand4 = botCommand3;
                    if (botCommand4.command.equalsIgnoreCase(strSubstring)) {
                        if (j != 0) {
                            return 0L;
                        }
                        j = botInfo2.user_id;
                        z = botCommand4.ephemeral;
                    }
                }
            }
            if (z) {
                return j;
            }
        }
        return 0L;
    }

    public final class EphemeralUpdates {
        public final Struct welcomeMessagesToAdd = new Struct();
        public final Struct welcomeMessagesToEdit = new Struct();
        public final StructBuilder ephemeralMessagesToAdd = new StructBuilder();
        public final StructBuilder ephemeralMessagesToEdit = new StructBuilder();
        public final StructBuilder welcomeMessagesAnchor = new StructBuilder();

        public class Struct {
            public final ArrayList messages = new ArrayList();
            public final LongSparseArray convertedByDialog = new LongSparseArray();
            public final LongSparseArray objectsByDialog = new LongSparseArray();

            public static void access$000(Struct struct, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, MessageObject messageObject) {
                struct.getClass();
                long dialogId = MessageObject.getDialogId(tL_message);
                struct.messages.add(ephemeralMessage);
                LongSparseArray longSparseArray = struct.convertedByDialog;
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) longSparseArray.get(dialogId);
                if (tL_messages_messages == null) {
                    tL_messages_messages = new TLRPC.TL_messages_messages();
                    longSparseArray.put(tL_messages_messages, dialogId);
                }
                tL_messages_messages.messages.add(tL_message);
                LongSparseArray longSparseArray2 = struct.objectsByDialog;
                ArrayList arrayList = (ArrayList) longSparseArray2.get(dialogId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    longSparseArray2.put(arrayList, dialogId);
                }
                arrayList.add(messageObject);
            }
        }

        public final class StructBuilder extends Struct {
            public final void build(int i, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i2) {
                ArrayList arrayList = this.messages;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    TLRPC.TL_message tL_messageConvertEphemeralToFakeDefault = EphemeralMessagesHelper.convertEphemeralToFakeDefault((TL_ephemeral.EphemeralMessage) obj);
                    int i4 = i;
                    ConcurrentHashMap concurrentHashMap3 = concurrentHashMap;
                    ConcurrentHashMap concurrentHashMap4 = concurrentHashMap2;
                    MessageObject messageObject = new MessageObject(i4, (TLRPC.Message) tL_messageConvertEphemeralToFakeDefault, (AbstractMap<Long, TLRPC.User>) concurrentHashMap3, (AbstractMap<Long, TLRPC.Chat>) concurrentHashMap4, true, true);
                    long dialogId = MessageObject.getDialogId(tL_messageConvertEphemeralToFakeDefault);
                    if (i2 != 0) {
                        tL_messageConvertEphemeralToFakeDefault.edit_date = i2;
                        tL_messageConvertEphemeralToFakeDefault.flags |= 32768;
                    }
                    LongSparseArray longSparseArray = this.convertedByDialog;
                    TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) longSparseArray.get(dialogId);
                    if (tL_messages_messages == null) {
                        tL_messages_messages = new TLRPC.TL_messages_messages();
                        longSparseArray.put(tL_messages_messages, dialogId);
                    }
                    tL_messages_messages.messages.add(tL_messageConvertEphemeralToFakeDefault);
                    LongSparseArray longSparseArray2 = this.objectsByDialog;
                    ArrayList arrayList2 = (ArrayList) longSparseArray2.get(dialogId);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        longSparseArray2.put(arrayList2, dialogId);
                    }
                    arrayList2.add(messageObject);
                    i = i4;
                    concurrentHashMap = concurrentHashMap3;
                    concurrentHashMap2 = concurrentHashMap4;
                }
            }
        }

        public final void apply(TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage, int i, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
            TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateNewEphemeralMessage.message;
            if (ephemeralMessage.anchor_msg_id != 0) {
                this.welcomeMessagesAnchor.messages.add(ephemeralMessage);
            } else {
                if (!ephemeralMessage.welcome) {
                    this.ephemeralMessagesToAdd.messages.add(ephemeralMessage);
                    return;
                }
                TLRPC.TL_message tL_messageConvertEphemeralToFakeDefault = EphemeralMessagesHelper.convertEphemeralToFakeDefault(ephemeralMessage);
                Struct.access$000(this.welcomeMessagesToAdd, ephemeralMessage, tL_messageConvertEphemeralToFakeDefault, new MessageObject(i, (TLRPC.Message) tL_messageConvertEphemeralToFakeDefault, (AbstractMap<Long, TLRPC.User>) concurrentHashMap, (AbstractMap<Long, TLRPC.Chat>) concurrentHashMap2, true, true));
            }
        }

        public final void apply(TL_update.TL_updateEditEphemeralMessage tL_updateEditEphemeralMessage, int i, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
            TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateEditEphemeralMessage.message;
            if (ephemeralMessage.anchor_msg_id != 0) {
                this.welcomeMessagesAnchor.messages.add(ephemeralMessage);
                return;
            }
            if (ephemeralMessage.welcome) {
                TLRPC.TL_message tL_messageConvertEphemeralToFakeDefault = EphemeralMessagesHelper.convertEphemeralToFakeDefault(ephemeralMessage);
                MessageObject messageObject = new MessageObject(i, (TLRPC.Message) tL_messageConvertEphemeralToFakeDefault, (AbstractMap<Long, TLRPC.User>) concurrentHashMap, (AbstractMap<Long, TLRPC.Chat>) concurrentHashMap2, true, true);
                tL_messageConvertEphemeralToFakeDefault.edit_date = ConnectionsManager.getInstance(i).getCurrentTime();
                tL_messageConvertEphemeralToFakeDefault.flags |= 32768;
                Struct.access$000(this.welcomeMessagesToEdit, ephemeralMessage, tL_messageConvertEphemeralToFakeDefault, messageObject);
                return;
            }
            this.ephemeralMessagesToEdit.messages.add(ephemeralMessage);
        }

        public static void apply(TL_update.TL_updateDeleteEphemeralMessages tL_updateDeleteEphemeralMessages) {
            DialogObject.getPeerDialogId(tL_updateDeleteEphemeralMessages.peer);
        }
    }
}
