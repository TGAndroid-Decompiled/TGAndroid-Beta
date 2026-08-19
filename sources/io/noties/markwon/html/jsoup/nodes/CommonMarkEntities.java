package io.noties.markwon.html.jsoup.nodes;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;
import org.commonmark.internal.util.Html5Entities;

public abstract class CommonMarkEntities {
    private static final Map COMMONMARK_NAMED_ENTITIES;

    public static boolean isNamedEntity(String str) {
        return COMMONMARK_NAMED_ENTITIES.containsKey(str);
    }

    public static int codepointsForName(String str, int[] iArr) {
        String str2 = (String) COMMONMARK_NAMED_ENTITIES.get(str);
        if (str2 == null) {
            return 0;
        }
        int length = str2.length();
        if (length == 1) {
            iArr[0] = str2.charAt(0);
            return length;
        }
        iArr[0] = str2.charAt(0);
        iArr[1] = str2.charAt(1);
        return length;
    }

    static {
        Map map;
        try {
            Field declaredField = Html5Entities.class.getDeclaredField("NAMED_CHARACTER_REFERENCES");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable th) {
            Map map2 = Collections.EMPTY_MAP;
            th.printStackTrace();
            map = map2;
        }
        COMMONMARK_NAMED_ENTITIES = map;
    }
}
