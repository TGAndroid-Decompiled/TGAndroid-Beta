package mc;

import h7.u;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import k7.t;
import pc.i;
public final class d extends t {
    public static final Set f13633g = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set h = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set f13634i = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));
    public final u f13635a;
    public final z9.d f13636b;
    public final ArrayList f13637c = new ArrayList(0);
    public a d = new a("", 0, Collections.EMPTY_MAP, null);
    public boolean f13638e;
    public boolean f13639f;

    public d(u uVar, z9.d dVar) {
        this.f13635a = uVar;
        this.f13636b = dVar;
    }

    public static Map a(i iVar) {
        boolean z4;
        oc.b bVar = iVar.v;
        int i10 = bVar.f16708a;
        if (i10 > 0) {
            HashMap hashMap = new HashMap(i10);
            int i11 = 0;
            while (true) {
                if (i11 < bVar.f16708a) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    String str = bVar.f16710c[i11];
                    String str2 = bVar.f16709b[i11];
                    if (str == null) {
                        str = "";
                    }
                    ?? obj = new Object();
                    if (str2 != null) {
                        obj.f16705a = str2.trim();
                        if (str2.length() != 0) {
                            obj.f16706b = str;
                            obj.f16707c = bVar;
                            i11++;
                            hashMap.put(obj.f16705a.toLowerCase(Locale.US), obj.f16706b);
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
        throw new UnsupportedOperationException("Method not decompiled: mc.d.b(java.lang.Appendable, java.lang.String):void");
    }
}
