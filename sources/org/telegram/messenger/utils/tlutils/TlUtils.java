package org.telegram.messenger.utils.tlutils;

import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public abstract class TlUtils {
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
}
