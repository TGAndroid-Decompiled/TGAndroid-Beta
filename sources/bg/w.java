package bg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c1;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
public final class w extends c1 {
    public static volatile w[] f3391a = new w[4];

    public static TLRPC.TL_message b(TL_ephemeral.EphemeralMessage ephemeralMessage) {
        int i7;
        int i10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = ephemeralMessage.out;
        tL_message.f26977id = (ephemeralMessage.f27171id & (-1879048193)) | 1610612736;
        TLRPC.Peer peer = ephemeralMessage.from_id;
        if (peer != null) {
            tL_message.from_id = peer;
            tL_message.flags |= 256;
        }
        tL_message.peer_id = ephemeralMessage.peer_id;
        int i11 = ephemeralMessage.anchor_msg_id;
        tL_message.ephemeralAnchorMsgId = i11;
        if (!ephemeralMessage.welcome && i11 == 0) {
            tL_message.ephemeralReceiverBotId = ephemeralMessage.receiver_id;
        } else {
            tL_message.ephemeralReceiverBotId = -1L;
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
        long j3 = ephemeralMessage.via_bot_id;
        if (j3 != 0) {
            tL_message.via_bot_id = j3;
            tL_message.flags |= 2048;
        }
        TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage.reply_to;
        if (messageReplyHeader != null) {
            TLRPC.MessageReplyHeader messageReplyHeader2 = (TLRPC.MessageReplyHeader) TLObject.deepCopy(messageReplyHeader, new a3.l(20));
            tL_message.reply_to = messageReplyHeader2;
            if (ephemeralMessage.reply_to.reply_to_ephemeral && (i10 = messageReplyHeader2.reply_to_msg_id) != 0) {
                messageReplyHeader2.reply_to_msg_id = ((-1879048193) & i10) | 1610612752;
            }
            if (messageReplyHeader2.reply_to_top_id == 0 && (i7 = ephemeralMessage.top_msg_id) != 0) {
                messageReplyHeader2.reply_to_top_id = i7;
                messageReplyHeader2.forum_topic = true;
                messageReplyHeader2.flags |= 2;
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
        ij.B0(tL_message);
        return tL_message;
    }

    public static TL_ephemeral.TL_ephemeralMessage c(int i7, TLRPC.Message message) {
        TL_ephemeral.TL_ephemeralMessage tL_ephemeralMessage = new TL_ephemeral.TL_ephemeralMessage();
        tL_ephemeralMessage.out = message.out;
        tL_ephemeralMessage.invert_media = message.invert_media;
        tL_ephemeralMessage.noforwards = message.noforwards;
        tL_ephemeralMessage.f27171id = ij.S(message.f26977id);
        tL_ephemeralMessage.from_id = message.from_id;
        tL_ephemeralMessage.peer_id = message.peer_id;
        tL_ephemeralMessage.receiver_id = message.ephemeralReceiverBotId;
        if (i7 != 0) {
            tL_ephemeralMessage.top_msg_id = i7;
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

    public static w g(int i7) {
        w wVar;
        w wVar2 = f3391a[i7];
        if (wVar2 == null) {
            synchronized (w.class) {
                try {
                    wVar = f3391a[i7];
                    if (wVar == null) {
                        ?? r02 = f3391a;
                        ?? c1Var = new c1(i7);
                        r02[i7] = c1Var;
                        wVar = c1Var;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return wVar;
        }
        return wVar2;
    }

    public final boolean a(TLObject tLObject, List list, c20 c20Var) {
        TLRPC.ChatFull N0;
        TLRPC.ChatFull N02;
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
                    tL_sendMessage.receiver_id = getMessagesController().o1(tL_messages_sendMessage.ephemeralReceiverBotId);
                }
                tL_sendMessage.query_id = 0L;
                tL_sendMessage.message = tL_messages_sendMessage.message;
                tL_sendMessage.entities = tL_messages_sendMessage.entities;
                tL_sendMessage.media = null;
                tL_sendMessage.reply_markup = tL_messages_sendMessage.reply_markup;
                tL_sendMessage.rich_message = tL_messages_sendMessage.rich_message;
                tL_sendMessage.random_id = tL_messages_sendMessage.random_id;
                TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMessage.reply_to;
                boolean z9 = inputReplyTo instanceof TLRPC.TL_inputReplyToMessage;
                TLRPC.TL_inputReplyToEphemeralMessage tL_inputReplyToEphemeralMessage = inputReplyTo;
                if (z9) {
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = (TLRPC.TL_inputReplyToMessage) inputReplyTo;
                    tL_inputReplyToEphemeralMessage = inputReplyTo;
                    if (ij.f3(tL_inputReplyToMessage.reply_to_msg_id)) {
                        TLRPC.TL_inputReplyToEphemeralMessage tL_inputReplyToEphemeralMessage2 = new TLRPC.TL_inputReplyToEphemeralMessage();
                        tL_inputReplyToEphemeralMessage2.f27022id = ij.S(tL_inputReplyToMessage.reply_to_msg_id);
                        tL_inputReplyToEphemeralMessage = tL_inputReplyToEphemeralMessage2;
                    }
                }
                tL_sendMessage.reply_to = tL_inputReplyToEphemeralMessage;
                tL_sendMessage.rich_message = tL_messages_sendMessage.rich_message;
                tL_sendMessage.invert_media = tL_messages_sendMessage.invert_media;
                c20Var.a(tL_sendMessage);
                return false;
            }
            long n10 = m5.n(tL_messages_sendMessage.peer);
            if (n10 < 0 && (N02 = getMessagesController().N0(-n10)) != null) {
                long f10 = f(tL_messages_sendMessage.message, N02.bot_info);
                if (f10 != 0) {
                    tL_messages_sendMessage.ephemeralReceiverBotId = f10;
                    return a(tLObject, list, c20Var);
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
                    tL_sendMessage2.receiver_id = getMessagesController().o1(tL_messages_sendMedia.ephemeralReceiverBotId);
                }
                tL_sendMessage2.query_id = 0L;
                tL_sendMessage2.message = tL_messages_sendMedia.message;
                tL_sendMessage2.entities = tL_messages_sendMedia.entities;
                tL_sendMessage2.media = tL_messages_sendMedia.media;
                tL_sendMessage2.reply_markup = tL_messages_sendMedia.reply_markup;
                tL_sendMessage2.rich_message = null;
                tL_sendMessage2.random_id = tL_messages_sendMedia.random_id;
                TLRPC.InputReplyTo inputReplyTo2 = tL_messages_sendMedia.reply_to;
                boolean z10 = inputReplyTo2 instanceof TLRPC.TL_inputReplyToMessage;
                TLRPC.TL_inputReplyToEphemeralMessage tL_inputReplyToEphemeralMessage3 = inputReplyTo2;
                if (z10) {
                    TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage2 = (TLRPC.TL_inputReplyToMessage) inputReplyTo2;
                    tL_inputReplyToEphemeralMessage3 = inputReplyTo2;
                    if (ij.f3(tL_inputReplyToMessage2.reply_to_msg_id)) {
                        TLRPC.TL_inputReplyToEphemeralMessage tL_inputReplyToEphemeralMessage4 = new TLRPC.TL_inputReplyToEphemeralMessage();
                        tL_inputReplyToEphemeralMessage4.f27022id = ij.S(tL_inputReplyToMessage2.reply_to_msg_id);
                        tL_inputReplyToEphemeralMessage3 = tL_inputReplyToEphemeralMessage4;
                    }
                }
                tL_sendMessage2.reply_to = tL_inputReplyToEphemeralMessage3;
                tL_sendMessage2.invert_media = tL_messages_sendMedia.invert_media;
                c20Var.a(tL_sendMessage2);
                return false;
            }
            long n11 = m5.n(tL_messages_sendMedia.peer);
            if (n11 < 0 && (N0 = getMessagesController().N0(-n11)) != null) {
                long f11 = f(tL_messages_sendMedia.message, N0.bot_info);
                if (f11 != 0) {
                    tL_messages_sendMedia.ephemeralReceiverBotId = f11;
                    return a(tLObject, list, c20Var);
                }
            }
        }
        return true;
    }

    public final long d(long j3, String str) {
        TLRPC.ChatFull N0;
        if (j3 >= 0 || (N0 = getMessagesController().N0(-j3)) == null) {
            return 0L;
        }
        return f(str, N0.bot_info);
    }

    public final long e(String str, a0.h hVar) {
        String substring;
        String str2;
        if (str != null && hVar != null && !hVar.i() && str.startsWith("/") && str.length() >= 2) {
            int indexOf = str.indexOf(32);
            if (indexOf != -1) {
                substring = str.substring(1, indexOf);
            } else {
                substring = str.substring(1);
            }
            int indexOf2 = substring.indexOf(64);
            if (indexOf2 != -1) {
                String substring2 = substring.substring(0, indexOf2);
                str2 = substring.substring(indexOf2 + 1);
                substring = substring2;
            } else {
                str2 = null;
            }
            if (substring.isEmpty()) {
                return 0L;
            }
            if (str2 != null) {
                for (int i7 = 0; i7 < hVar.m(); i7++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i7);
                    if (t10.r(str2, getMessagesController().a2(Long.valueOf(botInfo.user_id)))) {
                        ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            TLRPC.BotCommand botCommand = arrayList.get(i10);
                            i10++;
                            TLRPC.BotCommand botCommand2 = botCommand;
                            if (botCommand2.command.equalsIgnoreCase(substring)) {
                                if (!botCommand2.ephemeral) {
                                    return 0L;
                                }
                                return botInfo.user_id;
                            }
                        }
                        continue;
                    }
                }
                return 0L;
            }
            long j3 = 0;
            boolean z9 = false;
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TL_bots.BotInfo botInfo2 = (TL_bots.BotInfo) hVar.n(i11);
                ArrayList<TLRPC.BotCommand> arrayList2 = botInfo2.commands;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    TLRPC.BotCommand botCommand3 = arrayList2.get(i12);
                    i12++;
                    TLRPC.BotCommand botCommand4 = botCommand3;
                    if (botCommand4.command.equalsIgnoreCase(substring)) {
                        if (j3 != 0) {
                            return 0L;
                        }
                        j3 = botInfo2.user_id;
                        z9 = botCommand4.ephemeral;
                    }
                }
            }
            if (z9) {
                return j3;
            }
        }
        return 0L;
    }

    public final long f(String str, ArrayList arrayList) {
        if (str != null && arrayList != null && !arrayList.isEmpty() && str.startsWith("/") && str.length() >= 2) {
            a0.h hVar = new a0.h(arrayList.size());
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj;
                hVar.k(botInfo, botInfo.user_id);
            }
            return e(str, hVar);
        }
        return 0L;
    }
}
