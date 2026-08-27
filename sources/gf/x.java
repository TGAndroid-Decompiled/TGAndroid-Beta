package gf;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.BaseController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;

public final class x extends BaseController {

    public static volatile x[] f7071a = new x[4];

    public static TLRPC.TL_message b(TL_ephemeral.EphemeralMessage ephemeralMessage) {
        int i10;
        int i11;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = ephemeralMessage.out;
        tL_message.f22401id = MessageObject.ephemeralMessageIdPack(ephemeralMessage.f22593id);
        TLRPC.Peer peer = ephemeralMessage.from_id;
        if (peer != null) {
            tL_message.from_id = peer;
            tL_message.flags |= 256;
        }
        tL_message.peer_id = ephemeralMessage.peer_id;
        int i12 = ephemeralMessage.anchor_msg_id;
        tL_message.ephemeralAnchorMsgId = i12;
        if (ephemeralMessage.welcome || i12 != 0) {
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
        long j10 = ephemeralMessage.via_bot_id;
        if (j10 != 0) {
            tL_message.via_bot_id = j10;
            tL_message.flags |= 2048;
        }
        TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage.reply_to;
        if (messageReplyHeader != null) {
            TLRPC.MessageReplyHeader messageReplyHeader2 = (TLRPC.MessageReplyHeader) TLObject.deepCopy(messageReplyHeader, new f9.z(8));
            tL_message.reply_to = messageReplyHeader2;
            if (ephemeralMessage.reply_to.reply_to_ephemeral && (i11 = messageReplyHeader2.reply_to_msg_id) != 0) {
                messageReplyHeader2.reply_to_msg_id = MessageObject.ephemeralMessageIdPack(i11);
                tL_message.reply_to.reply_to_msg_id |= 16;
            }
            TLRPC.MessageReplyHeader messageReplyHeader3 = tL_message.reply_to;
            if (messageReplyHeader3.reply_to_top_id == 0 && (i10 = ephemeralMessage.top_msg_id) != 0) {
                messageReplyHeader3.reply_to_top_id = i10;
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

    public static TL_ephemeral.TL_ephemeralMessage c(TLRPC.Message message, int i10) {
        TL_ephemeral.TL_ephemeralMessage tL_ephemeralMessage = new TL_ephemeral.TL_ephemeralMessage();
        tL_ephemeralMessage.out = message.out;
        tL_ephemeralMessage.invert_media = message.invert_media;
        tL_ephemeralMessage.noforwards = message.noforwards;
        tL_ephemeralMessage.f22593id = MessageObject.ephemeralMessageIdUnpack(message.f22401id);
        tL_ephemeralMessage.from_id = message.from_id;
        tL_ephemeralMessage.peer_id = message.peer_id;
        tL_ephemeralMessage.receiver_id = message.ephemeralReceiverBotId;
        if (i10 != 0) {
            tL_ephemeralMessage.top_msg_id = i10;
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

    public static x g(int i10) {
        x xVar;
        x xVar2 = f7071a[i10];
        if (xVar2 != null) {
            return xVar2;
        }
        synchronized (x.class) {
            try {
                xVar = f7071a[i10];
                if (xVar == null) {
                    x[] xVarArr = f7071a;
                    x xVar3 = new x(i10);
                    xVarArr[i10] = xVar3;
                    xVar = xVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xVar;
    }

    public final boolean a(TLObject tLObject, List list, Utilities.Callback callback) {
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
                boolean z10 = inputReplyTo instanceof TLRPC.TL_inputReplyToMessage;
                TLRPC.InputReplyTo inputReplyTo2 = inputReplyTo;
                if (z10) {
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = (TLRPC.TL_inputReplyToMessage) inputReplyTo;
                    if (MessageObject.isEphemeralMessageId(tL_inputReplyToMessage.reply_to_msg_id)) {
                        inputReplyTo2 = inputReplyTo;
                        TLRPC.TL_inputReplyToEphemeralMessage tL_inputReplyToEphemeralMessage = new TLRPC.TL_inputReplyToEphemeralMessage();
                        tL_inputReplyToEphemeralMessage.f22446id = MessageObject.ephemeralMessageIdUnpack(tL_inputReplyToMessage.reply_to_msg_id);
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
                long jF = f(tL_messages_sendMessage.message, chatFull2.bot_info);
                if (jF != 0) {
                    tL_messages_sendMessage.ephemeralReceiverBotId = jF;
                    return a(tLObject, list, callback);
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
                boolean z11 = inputReplyTo3 instanceof TLRPC.TL_inputReplyToMessage;
                TLRPC.InputReplyTo inputReplyTo4 = inputReplyTo3;
                if (z11) {
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage2 = (TLRPC.TL_inputReplyToMessage) inputReplyTo3;
                    if (MessageObject.isEphemeralMessageId(tL_inputReplyToMessage2.reply_to_msg_id)) {
                        inputReplyTo4 = inputReplyTo3;
                        TLRPC.TL_inputReplyToEphemeralMessage tL_inputReplyToEphemeralMessage2 = new TLRPC.TL_inputReplyToEphemeralMessage();
                        tL_inputReplyToEphemeralMessage2.f22446id = MessageObject.ephemeralMessageIdUnpack(tL_inputReplyToMessage2.reply_to_msg_id);
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
                long jF2 = f(tL_messages_sendMedia.message, chatFull.bot_info);
                if (jF2 != 0) {
                    tL_messages_sendMedia.ephemeralReceiverBotId = jF2;
                    return a(tLObject, list, callback);
                }
            }
        }
        return true;
    }

    public final long d(long j10, String str) {
        TLRPC.ChatFull chatFull;
        if (j10 >= 0 || (chatFull = getMessagesController().getChatFull(-j10)) == null) {
            return 0L;
        }
        return f(str, chatFull.bot_info);
    }

    public final long e(String str, a0.h hVar) {
        String strSubstring;
        if (str != null && hVar != null && !hVar.i() && str.startsWith("/") && str.length() >= 2) {
            int iIndexOf = str.indexOf(32);
            String strSubstring2 = iIndexOf != -1 ? str.substring(1, iIndexOf) : str.substring(1);
            int iIndexOf2 = strSubstring2.indexOf(64);
            if (iIndexOf2 != -1) {
                String strSubstring3 = strSubstring2.substring(0, iIndexOf2);
                strSubstring = strSubstring2.substring(iIndexOf2 + 1);
                strSubstring2 = strSubstring3;
            } else {
                strSubstring = null;
            }
            if (strSubstring2.isEmpty()) {
                return 0L;
            }
            if (strSubstring != null) {
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i10);
                    if (UserObject.hasPublicUsername(getMessagesController().getUser(Long.valueOf(botInfo.user_id)), strSubstring)) {
                        ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            TLRPC.BotCommand botCommand = arrayList.get(i11);
                            i11++;
                            TLRPC.BotCommand botCommand2 = botCommand;
                            if (botCommand2.command.equalsIgnoreCase(strSubstring2)) {
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
            long j10 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TL_bots.BotInfo botInfo2 = (TL_bots.BotInfo) hVar.n(i12);
                ArrayList<TLRPC.BotCommand> arrayList2 = botInfo2.commands;
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    TLRPC.BotCommand botCommand3 = arrayList2.get(i13);
                    i13++;
                    TLRPC.BotCommand botCommand4 = botCommand3;
                    if (botCommand4.command.equalsIgnoreCase(strSubstring2)) {
                        if (j10 != 0) {
                            return 0L;
                        }
                        j10 = botInfo2.user_id;
                        z10 = botCommand4.ephemeral;
                    }
                }
            }
            if (z10) {
                return j10;
            }
        }
        return 0L;
    }

    public final long f(String str, ArrayList arrayList) {
        if (str == null || arrayList == null || arrayList.isEmpty() || !str.startsWith("/") || str.length() < 2) {
            return 0L;
        }
        a0.h hVar = new a0.h(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj;
            hVar.k(botInfo, botInfo.user_id);
        }
        return e(str, hVar);
    }
}
