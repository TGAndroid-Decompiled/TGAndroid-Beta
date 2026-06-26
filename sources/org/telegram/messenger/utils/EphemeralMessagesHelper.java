package org.telegram.messenger.utils;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.BaseController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;

public class EphemeralMessagesHelper extends BaseController {
    private static volatile EphemeralMessagesHelper[] Instance = new EphemeralMessagesHelper[4];

    public static TLRPC.TL_message convertEphemeralToFakeDefault(TLRPC.EphemeralMessage ephemeralMessage) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = ephemeralMessage.out;
        tL_message.id = MessageObject.ephemeralMessageIdPack(ephemeralMessage.id);
        TLRPC.Peer peer = ephemeralMessage.from_id;
        if (peer != null) {
            tL_message.from_id = peer;
            tL_message.flags |= 256;
        }
        tL_message.peer_id = ephemeralMessage.peer_id;
        tL_message.ephemeralReceiverBotId = ephemeralMessage.receiver_id;
        tL_message.date = ephemeralMessage.date;
        tL_message.message = ephemeralMessage.message;
        ArrayList<TLRPC.MessageEntity> arrayList = ephemeralMessage.entities;
        if (arrayList != null && !arrayList.isEmpty()) {
            tL_message.entities = ephemeralMessage.entities;
            tL_message.flags |= 128;
        }
        TLRPC.MessageMedia messageMedia = ephemeralMessage.media;
        if (messageMedia != null) {
            tL_message.media = messageMedia;
            tL_message.flags |= 512;
        }
        TLRPC.ReplyMarkup replyMarkup = ephemeralMessage.reply_markup;
        if (replyMarkup != null) {
            tL_message.reply_markup = replyMarkup;
            tL_message.flags |= 64;
        }
        TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage.reply_to;
        if (messageReplyHeader != null) {
            if (messageReplyHeader.reply_to_ephemeral) {
                TLRPC.MessageReplyHeader messageReplyHeader2 = (TLRPC.MessageReplyHeader) TLObject.deepCopy(messageReplyHeader, new Vector.TLDeserializer() {
                    @Override
                    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
                        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i, z);
                    }
                });
                tL_message.reply_to = messageReplyHeader2;
                int i = messageReplyHeader2.reply_to_msg_id;
                if (i != 0) {
                    messageReplyHeader2.reply_to_msg_id = MessageObject.ephemeralMessageIdPack(i);
                }
            } else {
                tL_message.reply_to = messageReplyHeader;
            }
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
        if (list == null || list.isEmpty() || (tLObject instanceof TLRPC.TL_ephemeral_sendMessage)) {
            return true;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
            TLRPC.TL_messages_sendMessage tL_messages_sendMessage = (TLRPC.TL_messages_sendMessage) tLObject;
            if (tL_messages_sendMessage.ephemeralReceiverBotId != 0) {
                TLRPC.TL_ephemeral_sendMessage tL_ephemeral_sendMessage = new TLRPC.TL_ephemeral_sendMessage();
                tL_ephemeral_sendMessage.peer = tL_messages_sendMessage.peer;
                tL_ephemeral_sendMessage.receiver_id = getMessagesController().getInputUser(tL_messages_sendMessage.ephemeralReceiverBotId);
                tL_ephemeral_sendMessage.query_id = 0L;
                tL_ephemeral_sendMessage.message = tL_messages_sendMessage.message;
                tL_ephemeral_sendMessage.entities = tL_messages_sendMessage.entities;
                tL_ephemeral_sendMessage.media = null;
                tL_ephemeral_sendMessage.reply_markup = tL_messages_sendMessage.reply_markup;
                tL_ephemeral_sendMessage.rich_message = tL_messages_sendMessage.rich_message;
                tL_ephemeral_sendMessage.random_id = tL_messages_sendMessage.random_id;
                tL_ephemeral_sendMessage.reply_to = applyReplyTo(tL_messages_sendMessage.reply_to);
                callback.run(tL_ephemeral_sendMessage);
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
                TLRPC.TL_ephemeral_sendMessage tL_ephemeral_sendMessage2 = new TLRPC.TL_ephemeral_sendMessage();
                tL_ephemeral_sendMessage2.peer = tL_messages_sendMedia.peer;
                tL_ephemeral_sendMessage2.receiver_id = getMessagesController().getInputUser(tL_messages_sendMedia.ephemeralReceiverBotId);
                tL_ephemeral_sendMessage2.query_id = 0L;
                tL_ephemeral_sendMessage2.message = tL_messages_sendMedia.message;
                tL_ephemeral_sendMessage2.entities = tL_messages_sendMedia.entities;
                tL_ephemeral_sendMessage2.media = tL_messages_sendMedia.media;
                tL_ephemeral_sendMessage2.reply_markup = tL_messages_sendMedia.reply_markup;
                tL_ephemeral_sendMessage2.rich_message = null;
                tL_ephemeral_sendMessage2.random_id = tL_messages_sendMedia.random_id;
                tL_ephemeral_sendMessage2.reply_to = applyReplyTo(tL_messages_sendMedia.reply_to);
                callback.run(tL_ephemeral_sendMessage2);
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
