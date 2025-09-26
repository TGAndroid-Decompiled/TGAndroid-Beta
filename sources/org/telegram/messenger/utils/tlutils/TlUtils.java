package org.telegram.messenger.utils.tlutils;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public abstract class TlUtils {
    public static TLRPC.InputPeer getInputPeerFromSendMessageRequest(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
            return ((TLRPC.TL_messages_sendMessage) tLObject).peer;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).peer;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
            return ((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer;
        }
        if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            return ((TLRPC.TL_messages_forwardMessages) tLObject).to_peer;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            return ((TLRPC.TL_messages_sendMultiMedia) tLObject).peer;
        }
        return null;
    }

    public static TLRPC.InputReplyTo getInputReplyToFromSendMessageRequest(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
            return ((TLRPC.TL_messages_sendMessage) tLObject).reply_to;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).reply_to;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
            return ((TLRPC.TL_messages_sendInlineBotResult) tLObject).reply_to;
        }
        if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            return ((TLRPC.TL_messages_forwardMessages) tLObject).reply_to;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            return ((TLRPC.TL_messages_sendMultiMedia) tLObject).reply_to;
        }
        return null;
    }

    public static String getMessageFromSendMessageRequest(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
            return ((TLRPC.TL_messages_sendMessage) tLObject).message;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).message;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            Iterator<TLRPC.TL_inputSingleMedia> it = ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media.iterator();
            while (it.hasNext()) {
                TLRPC.TL_inputSingleMedia next = it.next();
                if (!TextUtils.isEmpty(next.message)) {
                    return next.message;
                }
            }
        }
        return null;
    }

    public static void setInputReplyToFromSendMessageRequest(TLObject tLObject, TLRPC.InputReplyTo inputReplyTo) {
        if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
            TLRPC.TL_messages_sendMessage tL_messages_sendMessage = (TLRPC.TL_messages_sendMessage) tLObject;
            tL_messages_sendMessage.reply_to = inputReplyTo;
            tL_messages_sendMessage.flags |= 1;
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            tL_messages_sendMedia.reply_to = inputReplyTo;
            tL_messages_sendMedia.flags |= 1;
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
            TLRPC.TL_messages_sendInlineBotResult tL_messages_sendInlineBotResult = (TLRPC.TL_messages_sendInlineBotResult) tLObject;
            tL_messages_sendInlineBotResult.reply_to = inputReplyTo;
            tL_messages_sendInlineBotResult.flags |= 1;
        } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) tLObject;
            tL_messages_forwardMessages.reply_to = inputReplyTo;
            tL_messages_forwardMessages.flags |= 1;
        } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
            tL_messages_sendMultiMedia.reply_to = inputReplyTo;
            tL_messages_sendMultiMedia.flags |= 1;
        }
    }

    public static long getOrCalculateRandomIdFromSendMessageRequest(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
            return ((TLRPC.TL_messages_sendMessage) tLObject).random_id;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).random_id;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
            return ((TLRPC.TL_messages_sendInlineBotResult) tLObject).random_id;
        }
        long j = 0;
        if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            Iterator<Long> it = ((TLRPC.TL_messages_forwardMessages) tLObject).random_id.iterator();
            while (it.hasNext()) {
                j = MediaDataController.calcHash(j, it.next().longValue());
            }
            return j;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            Iterator<TLRPC.TL_inputSingleMedia> it2 = ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media.iterator();
            while (it2.hasNext()) {
                j = MediaDataController.calcHash(j, it2.next().random_id);
            }
        }
        return j;
    }

    public static boolean isInstance(Object obj, Class... clsArr) {
        if (obj != null && clsArr != null) {
            for (Class cls : clsArr) {
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.Document getGiftDocument(TL_stars.StarGift starGift) {
        TLRPC.Document document = starGift.sticker;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = starGift.attributes;
        if (arrayList == null || document != null) {
            return document;
        }
        Iterator<TL_stars.StarGiftAttribute> it = arrayList.iterator();
        while (it.hasNext()) {
            TL_stars.StarGiftAttribute next = it.next();
            if (next instanceof TL_stars.starGiftAttributeModel) {
                return ((TL_stars.starGiftAttributeModel) next).document;
            }
        }
        return document;
    }

    public static TLRPC.Document getGiftDocumentPattern(TL_stars.StarGift starGift) {
        TLRPC.Document document = starGift.sticker;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = starGift.attributes;
        if (arrayList == null || document != null) {
            return document;
        }
        Iterator<TL_stars.StarGiftAttribute> it = arrayList.iterator();
        while (it.hasNext()) {
            TL_stars.StarGiftAttribute next = it.next();
            if (next instanceof TL_stars.starGiftAttributePattern) {
                return ((TL_stars.starGiftAttributePattern) next).document;
            }
        }
        return document;
    }

    public static String getThemeEmoticonOrGiftTitle(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return ((TLRPC.TL_chatTheme) chatTheme).emoticon;
        }
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift.title;
        }
        return null;
    }

    public static TLRPC.GroupCall applyGroupCallUpdate(TLRPC.GroupCall groupCall, TLRPC.GroupCall groupCall2) {
        if ((groupCall2 instanceof TLRPC.TL_groupCall) && (groupCall instanceof TLRPC.TL_groupCall)) {
            TLRPC.TL_groupCall tL_groupCall = (TLRPC.TL_groupCall) groupCall2;
            if (tL_groupCall.min) {
                TLRPC.TL_groupCall tL_groupCall2 = (TLRPC.TL_groupCall) groupCall;
                tL_groupCall.can_change_join_muted = tL_groupCall2.can_change_join_muted;
                tL_groupCall.can_start_video = tL_groupCall2.can_start_video;
                tL_groupCall.creator = tL_groupCall2.creator;
                tL_groupCall.can_change_messages_enabled = tL_groupCall2.can_change_messages_enabled;
            }
        }
        return groupCall2;
    }
}
