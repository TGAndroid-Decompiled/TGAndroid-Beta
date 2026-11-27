package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
public final class fl6 {
    public static final Set e = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set f = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set g = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));
    public final ArrayList a = new ArrayList(0);
    public hi5 b = new hi5("", 0, Collections.EMPTY_MAP, null);
    public boolean c;
    public boolean d;

    public fl6(faf fafVar, rj2 rj2Var) {
    }

    public static Map a(vtb vtbVar) {
        boolean z;
        gy gyVar = vtbVar.m;
        int i = gyVar.a;
        if (i > 0) {
            HashMap hashMap = new HashMap(i);
            int i2 = 0;
            while (true) {
                if (i2 < gyVar.a) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    String str = gyVar.c[i2];
                    String str2 = gyVar.b[i2];
                    if (str == null) {
                        str = "";
                    }
                    ?? obj = new Object();
                    if (str2 != null) {
                        obj.a = str2.trim();
                        if (str2.length() != 0) {
                            obj.b = str;
                            obj.c = gyVar;
                            i2++;
                            hashMap.put(obj.a.toLowerCase(Locale.US), obj.b);
                        } else {
                            lq5.j("String must not be empty");
                            return null;
                        }
                    } else {
                        lq5.j("Object must not be null");
                        return null;
                    }
                } else {
                    return DesugarCollections.unmodifiableMap(hashMap);
                }
            }
        } else {
            return Collections.EMPTY_MAP;
        }
    }

    public final void b(java.lang.Appendable r17, java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl6.b(java.lang.Appendable, java.lang.String):void");
    }
}
