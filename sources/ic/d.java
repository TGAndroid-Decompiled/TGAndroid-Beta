package ic;

import f7.o8;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import lc.i;
public final class d extends o8 {
    public static final Set f11094g = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set h = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set f11095i = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));
    public final wa.a f11096a;
    public final ya.b f11097b;
    public final ArrayList f11098c = new ArrayList(0);
    public a d = new a("", 0, Collections.EMPTY_MAP, null);
    public boolean f11099e;
    public boolean f11100f;

    public d(wa.a aVar, ya.b bVar) {
        this.f11096a = aVar;
        this.f11097b = bVar;
    }

    public static Map a(i iVar) {
        boolean z10;
        kc.c cVar = iVar.f16816k;
        int i9 = cVar.f14756a;
        if (i9 > 0) {
            HashMap hashMap = new HashMap(i9);
            int i10 = 0;
            while (true) {
                if (i10 < cVar.f14756a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    String str = cVar.f14758c[i10];
                    String str2 = cVar.f14757b[i10];
                    if (str == null) {
                        str = "";
                    }
                    ?? obj = new Object();
                    if (str2 != null) {
                        obj.f14750a = str2.trim();
                        if (str2.length() != 0) {
                            obj.f14751b = str;
                            obj.f14752c = cVar;
                            i10++;
                            hashMap.put(obj.f14750a.toLowerCase(Locale.US), obj.f14751b);
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
        throw new UnsupportedOperationException("Method not decompiled: ic.d.b(java.lang.Appendable, java.lang.String):void");
    }
}
