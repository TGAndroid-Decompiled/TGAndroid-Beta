package kc;

import f7.v;
import i7.i;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
public final class d extends i {
    public static final Set f13617g = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set h = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set f13618i = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));
    public final bb.a f13619a;
    public final v f13620b;
    public final ArrayList f13621c = new ArrayList(0);
    public a d = new a("", 0, Collections.EMPTY_MAP, null);
    public boolean f13622e;
    public boolean f13623f;

    public d(bb.a aVar, v vVar) {
        this.f13619a = aVar;
        this.f13620b = vVar;
    }

    public static Map a(nc.i iVar) {
        boolean z10;
        mc.b bVar = iVar.f17283k;
        int i10 = bVar.f16974a;
        if (i10 > 0) {
            HashMap hashMap = new HashMap(i10);
            int i11 = 0;
            while (true) {
                if (i11 < bVar.f16974a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    String str = bVar.f16976c[i11];
                    String str2 = bVar.f16975b[i11];
                    if (str == null) {
                        str = "";
                    }
                    ?? obj = new Object();
                    if (str2 != null) {
                        obj.f16971a = str2.trim();
                        if (str2.length() != 0) {
                            obj.f16972b = str;
                            obj.f16973c = bVar;
                            i11++;
                            hashMap.put(obj.f16971a.toLowerCase(Locale.US), obj.f16972b);
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
        throw new UnsupportedOperationException("Method not decompiled: kc.d.b(java.lang.Appendable, java.lang.String):void");
    }
}
