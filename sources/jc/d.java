package jc;

import g7.p8;
import g7.q8;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import m1.j;
import mc.h;
import mc.i;
import mc.k;
import mc.l;

public final class d extends q8 {

    public static final Set f12896g = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set h = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));

    public static final Set f12897i = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));

    public final za.b f12898a;

    public final ab.a f12899b;

    public final ArrayList f12900c = new ArrayList(0);
    public a d = new a("", 0, Collections.EMPTY_MAP, null);

    public boolean f12901e;

    public boolean f12902f;

    public d(za.b bVar, ab.a aVar) {
        this.f12898a = bVar;
        this.f12899b = aVar;
    }

    public static Map a(i iVar) {
        lc.b bVar = iVar.f18000k;
        int i10 = bVar.f15534a;
        if (i10 <= 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(i10);
        int i11 = 0;
        while (true) {
            if (!(i11 < bVar.f15534a)) {
                return DesugarCollections.unmodifiableMap(map);
            }
            String str = bVar.f15536c[i11];
            String str2 = bVar.f15535b[i11];
            if (str == null) {
                str = "";
            }
            lc.a aVar = new lc.a();
            if (str2 == null) {
                throw new IllegalArgumentException("Object must not be null");
            }
            aVar.f15531a = str2.trim();
            if (str2.length() == 0) {
                throw new IllegalArgumentException("String must not be empty");
            }
            aVar.f15532b = str;
            aVar.f15533c = bVar;
            i11++;
            map.put(aVar.f15531a.toLowerCase(Locale.US), aVar.f15532b);
        }
    }

    public final void b(Appendable appendable, String str) {
        k kVar;
        b bVar;
        int length;
        l lVar = new l(new mc.a(str), new mc.b(0));
        while (true) {
            if (lVar.f18008e) {
                StringBuilder sb2 = lVar.f18010g;
                int length2 = sb2.length();
                mc.d dVar = lVar.f18014l;
                if (length2 > 0) {
                    String string = sb2.toString();
                    sb2.delete(0, sb2.length());
                    lVar.f18009f = null;
                    dVar.f17990c = string;
                    kVar = dVar;
                } else {
                    String str2 = lVar.f18009f;
                    if (str2 != null) {
                        dVar.f17990c = str2;
                        lVar.f18009f = null;
                        kVar = dVar;
                    } else {
                        lVar.f18008e = false;
                        kVar = lVar.d;
                    }
                }
                int i10 = kVar.f18002b;
                if (6 == i10) {
                    return;
                }
                int iB = j.b(i10);
                za.b bVar2 = this.f12898a;
                Set set = f12897i;
                ArrayList arrayList = this.f12900c;
                Set set2 = f12896g;
                if (iB == 1) {
                    i iVar = (i) kVar;
                    boolean zContains = set2.contains(iVar.d);
                    Set set3 = h;
                    if (zContains) {
                        String str3 = iVar.d;
                        CharSequence charSequence = (CharSequence) appendable;
                        b bVar3 = new b(charSequence.length(), str3, a(iVar));
                        if (this.f12902f) {
                            int length3 = charSequence.length();
                            if (length3 > 0 && '\n' != charSequence.charAt(length3 - 1)) {
                                p8.a(appendable, '\n');
                            }
                            this.f12902f = false;
                        }
                        if (set3.contains(str3) || iVar.f17999j) {
                            bVar2.getClass();
                            String strB = za.b.B(bVar3);
                            if (strB != null && strB.length() > 0) {
                                try {
                                    appendable.append(strB);
                                } catch (IOException e9) {
                                    throw new RuntimeException(e9);
                                }
                            }
                            int length4 = charSequence.length();
                            if (bVar3.d <= -1) {
                                bVar3.d = length4;
                            }
                        }
                        arrayList.add(bVar3);
                    } else {
                        String str4 = iVar.d;
                        if ("p".equals(this.d.f12893a)) {
                            this.d.b(((CharSequence) appendable).length());
                            p8.a(appendable, '\n');
                            this.d = this.d.f12891e;
                        } else if ("li".equals(str4) && "li".equals(this.d.f12893a)) {
                            this.d.b(((CharSequence) appendable).length());
                            this.d = this.d.f12891e;
                        }
                        if (set.contains(str4)) {
                            this.f12901e = "pre".equals(str4);
                            CharSequence charSequence2 = (CharSequence) appendable;
                            int length5 = charSequence2.length();
                            if (length5 > 0 && '\n' != charSequence2.charAt(length5 - 1)) {
                                p8.a(appendable, '\n');
                            }
                        } else if (this.f12902f) {
                            CharSequence charSequence3 = (CharSequence) appendable;
                            int length6 = charSequence3.length();
                            if (length6 > 0 && '\n' != charSequence3.charAt(length6 - 1)) {
                                p8.a(appendable, '\n');
                            }
                            this.f12902f = false;
                        }
                        CharSequence charSequence4 = (CharSequence) appendable;
                        int length7 = charSequence4.length();
                        Map mapA = a(iVar);
                        a aVar = this.d;
                        a aVar2 = new a(str4, length7, mapA, aVar);
                        boolean z10 = set3.contains(str4) || iVar.f17999j;
                        if (z10) {
                            bVar2.getClass();
                            String strB2 = za.b.B(aVar2);
                            if (strB2 != null && strB2.length() > 0) {
                                try {
                                    appendable.append(strB2);
                                } catch (IOException e10) {
                                    throw new RuntimeException(e10);
                                }
                            }
                            aVar2.b(charSequence4.length());
                        }
                        ArrayList arrayList2 = aVar.f12892f;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList(2);
                            aVar.f12892f = arrayList2;
                        }
                        arrayList2.add(aVar2);
                        if (!z10) {
                            this.d = aVar2;
                        }
                    }
                } else if (iB == 2) {
                    h hVar = (h) kVar;
                    if (set2.contains(hVar.d)) {
                        String str5 = hVar.d;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size <= -1) {
                                bVar = null;
                                break;
                            }
                            bVar = (b) arrayList.get(size);
                            if (str5.equals(bVar.f12893a) && bVar.d < 0) {
                                break;
                            } else {
                                size--;
                            }
                        }
                        if (bVar != null) {
                            CharSequence charSequence5 = (CharSequence) appendable;
                            if (bVar.f12894b == charSequence5.length()) {
                                bVar2.getClass();
                                CharSequence charSequenceB = za.b.B(bVar);
                                if (charSequenceB != null) {
                                    try {
                                        appendable.append(charSequenceB);
                                    } catch (IOException e11) {
                                        throw new RuntimeException(e11);
                                    }
                                }
                            }
                            int length8 = charSequence5.length();
                            if (bVar.d <= -1) {
                                bVar.d = length8;
                            }
                        }
                    } else {
                        String str6 = hVar.d;
                        a aVar3 = this.d;
                        while (aVar3 != null && !str6.equals(aVar3.f12893a) && aVar3.d <= -1) {
                            aVar3 = aVar3.f12891e;
                        }
                        if (aVar3 != null) {
                            int i11 = aVar3.f12894b;
                            if ("pre".equals(str6)) {
                                this.f12901e = false;
                            }
                            CharSequence charSequence6 = (CharSequence) appendable;
                            if (i11 == charSequence6.length()) {
                                bVar2.getClass();
                                CharSequence charSequenceB2 = za.b.B(aVar3);
                                if (charSequenceB2 != null) {
                                    try {
                                        appendable.append(charSequenceB2);
                                    } catch (IOException e12) {
                                        throw new RuntimeException(e12);
                                    }
                                }
                            }
                            aVar3.b(charSequence6.length());
                            if (i11 != aVar3.d) {
                                this.f12902f = set.contains(aVar3.f12893a);
                            }
                            if ("p".equals(str6)) {
                                p8.a(appendable, '\n');
                            }
                            this.d = aVar3.f12891e;
                        }
                    }
                } else if (iB == 4) {
                    mc.d dVar2 = (mc.d) kVar;
                    if (this.f12901e) {
                        try {
                            appendable.append(dVar2.f17990c);
                        } catch (IOException e13) {
                            throw new RuntimeException(e13);
                        }
                    } else {
                        if (this.f12902f) {
                            CharSequence charSequence7 = (CharSequence) appendable;
                            int length9 = charSequence7.length();
                            if (length9 > 0 && '\n' != charSequence7.charAt(length9 - 1)) {
                                p8.a(appendable, '\n');
                            }
                            this.f12902f = false;
                        }
                        String str7 = dVar2.f17990c;
                        this.f12899b.getClass();
                        CharSequence charSequence8 = (CharSequence) appendable;
                        int length10 = charSequence8.length();
                        int length11 = str7.length();
                        boolean z11 = false;
                        for (int i12 = 0; i12 < length11; i12++) {
                            char cCharAt = str7.charAt(i12);
                            if (Character.isWhitespace(cCharAt)) {
                                z11 = true;
                            } else {
                                if (z11 && (length = charSequence8.length()) > 0 && !Character.isWhitespace(charSequence8.charAt(length - 1))) {
                                    p8.a(appendable, ' ');
                                }
                                p8.a(appendable, cCharAt);
                                z11 = false;
                            }
                        }
                        if (z11 && length10 < charSequence8.length()) {
                            p8.a(appendable, ' ');
                        }
                    }
                }
                kVar.c();
            } else {
                lVar.f18007c.d(lVar, lVar.f18005a);
            }
        }
    }
}
