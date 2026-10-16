package cd;

import fd.i;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import v7.d5;
public final class d extends d5 {
    public static final Set f4736g = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set h = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set f4737i = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));
    public final oa.d f4738a;
    public final pb.a f4739b;
    public final ArrayList f4740c = new ArrayList(0);
    public a d = new a("", 0, Collections.EMPTY_MAP, null);
    public boolean e;
    public boolean f4741f;

    public d(oa.d dVar, pb.a aVar) {
        this.f4738a = dVar;
        this.f4739b = aVar;
    }

    public static Map a(i iVar) {
        boolean z10;
        ed.c cVar = iVar.f9122k;
        int i10 = cVar.f8730a;
        if (i10 > 0) {
            HashMap hashMap = new HashMap(i10);
            int i11 = 0;
            while (true) {
                if (i11 < cVar.f8730a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    String str = cVar.f8732c[i11];
                    String str2 = cVar.f8731b[i11];
                    if (str == null) {
                        str = "";
                    }
                    ?? obj = new Object();
                    if (str2 != null) {
                        obj.f8724a = str2.trim();
                        if (str2.length() != 0) {
                            obj.f8725b = str;
                            obj.f8726c = cVar;
                            i11++;
                            hashMap.put(obj.f8724a.toLowerCase(Locale.US), obj.f8725b);
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
        throw new UnsupportedOperationException("Method not decompiled: cd.d.b(java.lang.Appendable, java.lang.String):void");
    }
}
