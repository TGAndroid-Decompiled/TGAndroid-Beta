package io.noties.markwon.html.jsoup.nodes;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;
import org.commonmark.internal.util.Html5Entities;

public abstract class CommonMarkEntities {
    public static final Map COMMONMARK_NAMED_ENTITIES;

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
