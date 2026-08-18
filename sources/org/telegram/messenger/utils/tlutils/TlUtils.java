package org.telegram.messenger.utils.tlutils;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stars;

public abstract class TlUtils {
    public static TLRPC.InputPeer getInputPeerFromSendMessageRequest(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
            return ((TLRPC.TL_messages_sendMessage) tLObject).peer;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).peer;
        }
        if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
            return ((TL_ephemeral.TL_sendMessage) tLObject).peer;
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
        if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
            return ((TL_ephemeral.TL_sendMessage) tLObject).reply_to;
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
        if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
            return ((TL_ephemeral.TL_sendMessage) tLObject).message;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            for (TLRPC.TL_inputSingleMedia tL_inputSingleMedia : ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media) {
                if (!TextUtils.isEmpty(tL_inputSingleMedia.message)) {
                    return tL_inputSingleMedia.message;
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
        if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
            TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject;
            tL_sendMessage.reply_to = inputReplyTo;
            tL_sendMessage.flags |= 32;
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

    public static Object findFirstInstance(List list, Class cls) {
        if (list != null && cls != null) {
            for (Object obj : list) {
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
        }
        return null;
    }

    public static ArrayList findAllInstances(List list, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (list != null && cls != null) {
            for (Object obj : list) {
                if (cls.isInstance(obj)) {
                    arrayList.add(cls.cast(obj));
                }
            }
        }
        return arrayList;
    }

    public static long getOrCalculateRandomIdFromSendMessageRequest(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
            return ((TLRPC.TL_messages_sendMessage) tLObject).random_id;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).random_id;
        }
        if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
            return ((TL_ephemeral.TL_sendMessage) tLObject).random_id;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
            return ((TLRPC.TL_messages_sendInlineBotResult) tLObject).random_id;
        }
        long jCalcHash = 0;
        if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            Iterator<Long> it = ((TLRPC.TL_messages_forwardMessages) tLObject).random_id.iterator();
            while (it.hasNext()) {
                jCalcHash = MediaDataController.calcHash(jCalcHash, it.next().longValue());
            }
            return jCalcHash;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            Iterator<TLRPC.TL_inputSingleMedia> it2 = ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media.iterator();
            while (it2.hasNext()) {
                jCalcHash = MediaDataController.calcHash(jCalcHash, it2.next().random_id);
            }
        }
        return jCalcHash;
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
        for (TL_stars.StarGiftAttribute starGiftAttribute : arrayList) {
            if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
                return ((TL_stars.starGiftAttributeModel) starGiftAttribute).document;
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
        for (TL_stars.StarGiftAttribute starGiftAttribute : arrayList) {
            if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
                return ((TL_stars.starGiftAttributePattern) starGiftAttribute).document;
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

    public static TLRPC.InputMedia toInputMediaGeo(TLRPC.MessageMedia messageMedia) {
        TLRPC.InputMedia tL_inputMediaGeoPoint;
        if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
            tL_inputMediaGeoPoint = new TLRPC.TL_inputMediaVenue();
            tL_inputMediaGeoPoint.address = messageMedia.address;
            tL_inputMediaGeoPoint.title = messageMedia.title;
            tL_inputMediaGeoPoint.provider = messageMedia.provider;
            tL_inputMediaGeoPoint.venue_id = messageMedia.venue_id;
            tL_inputMediaGeoPoint.venue_type = "";
        } else if (messageMedia instanceof TLRPC.TL_messageMediaGeoLive) {
            tL_inputMediaGeoPoint = new TLRPC.TL_inputMediaGeoLive();
            tL_inputMediaGeoPoint.period = messageMedia.period;
            int i = tL_inputMediaGeoPoint.flags;
            tL_inputMediaGeoPoint.flags = i | 2;
            int i2 = messageMedia.heading;
            if (i2 != 0) {
                tL_inputMediaGeoPoint.heading = i2;
                tL_inputMediaGeoPoint.flags = i | 6;
            }
            int i3 = messageMedia.proximity_notification_radius;
            if (i3 != 0) {
                tL_inputMediaGeoPoint.proximity_notification_radius = i3;
                tL_inputMediaGeoPoint.flags |= 8;
            }
        } else {
            tL_inputMediaGeoPoint = new TLRPC.TL_inputMediaGeoPoint();
        }
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_inputMediaGeoPoint.geo_point = tL_inputGeoPoint;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        tL_inputGeoPoint.lat = geoPoint.lat;
        tL_inputGeoPoint._long = geoPoint._long;
        return tL_inputMediaGeoPoint;
    }

    public static void calculateAnswerShuffleHash(TLRPC.Poll poll, long j) {
        if (poll == null) {
            return;
        }
        int size = poll.answers.size();
        for (int i = 0; i < size; i++) {
            poll.answers.get(i).unshuffled_index = i;
        }
        if (poll.creator || !poll.shuffle_answers) {
            return;
        }
        CRC32 crc32 = new CRC32();
        int size2 = poll.answers.size();
        for (int i2 = 0; i2 < size2; i2++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i2);
            if (pollAnswer.option != null) {
                crc32.reset();
                String string = Long.toString(j);
                Charset charset = StandardCharsets.UTF_8;
                crc32.update(string.getBytes(charset));
                crc32.update(pollAnswer.option);
                crc32.update(Long.toString(poll.id).getBytes(charset));
                pollAnswer.shuffle_hash = crc32.getValue();
            }
        }
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(poll.answers);
        poll.shuffled_answers = arrayList;
        j$.util.List.EL.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return TlUtils.lambda$calculateAnswerShuffleHash$0((TLRPC.PollAnswer) obj, (TLRPC.PollAnswer) obj2);
            }
        });
    }

    public static int lambda$calculateAnswerShuffleHash$0(TLRPC.PollAnswer pollAnswer, TLRPC.PollAnswer pollAnswer2) {
        return Long.compare(pollAnswer.shuffle_hash ^ Long.MIN_VALUE, pollAnswer2.shuffle_hash ^ Long.MIN_VALUE);
    }
}
