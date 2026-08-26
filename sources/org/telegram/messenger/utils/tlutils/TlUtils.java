package org.telegram.messenger.utils.tlutils;

import j$.util.List;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.zip.CRC32;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda5;

public abstract class TlUtils {
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
        List.EL.sort(arrayList, new Theme$$ExternalSyntheticLambda5(22));
    }

    public static ArrayList findAllInstances(java.util.List list, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object obj : list) {
                if (cls.isInstance(obj)) {
                    arrayList.add(cls.cast(obj));
                }
            }
        }
        return arrayList;
    }

    public static Object findFirstInstance(ArrayList arrayList, Class cls) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }

    public static TLRPC.Document getGiftDocument(TL_stars.StarGift starGift) {
        TLRPC.Document document = starGift.sticker;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = starGift.attributes;
        if (arrayList != null && document == null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i);
                i++;
                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) {
                    return ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document;
                }
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

    public static boolean isInstance(Object obj, Class... clsArr) {
        if (obj != null) {
            for (Class cls : clsArr) {
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
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
}
