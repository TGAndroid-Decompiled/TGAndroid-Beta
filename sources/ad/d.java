package ad;

import a8.g1;
import dd.i;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
public final class d extends g1 {
    public static final Set f1038g = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set h = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set f1039i = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));
    public final nb.a f1040a;
    public final pb.b f1041b;
    public final ArrayList f1042c = new ArrayList(0);
    public a d = new a("", 0, Collections.EMPTY_MAP, null);
    public boolean f1043e;
    public boolean f1044f;

    public d(nb.a aVar, pb.b bVar) {
        this.f1040a = aVar;
        this.f1041b = bVar;
    }

    public static Map a(i iVar) {
        boolean z9;
        cd.c cVar = iVar.f8646k;
        int i7 = cVar.f6081a;
        if (i7 > 0) {
            HashMap hashMap = new HashMap(i7);
            int i10 = 0;
            while (true) {
                if (i10 < cVar.f6081a) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    String str = cVar.f6083c[i10];
                    String str2 = cVar.f6082b[i10];
                    if (str == null) {
                        str = "";
                    }
                    ?? obj = new Object();
                    if (str2 != null) {
                        obj.f6075a = str2.trim();
                        if (str2.length() != 0) {
                            obj.f6076b = str;
                            obj.f6077c = cVar;
                            i10++;
                            hashMap.put(obj.f6075a.toLowerCase(Locale.US), obj.f6076b);
                        } else {
                            throw new IllegalArgumentException("String must not be empty");
                        }
                    } else {
                        throw new IllegalArgumentException("Object must not be null");
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
        throw new UnsupportedOperationException("Method not decompiled: ad.d.b(java.lang.Appendable, java.lang.String):void");
    }
}
