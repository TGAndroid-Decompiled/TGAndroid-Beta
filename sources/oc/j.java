package oc;

import i7.a6;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import le.p;
import le.s;
public final class j implements me.a {
    public static final Pattern f19485j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f19486k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f19487l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f19488m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f19489n = Pattern.compile("\\s+");
    public final g9.l f19490a;
    public final BitSet f19491b;
    public final HashMap f19492c;
    public final HashMap d;
    public p f19493e;
    public String f19494f;
    public int f19495g;
    public ie.c h;
    public ie.b f19496i;

    public j(g9.l lVar, List list, List list2) {
        l lVar2;
        this.f19490a = lVar;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            char d = hVar.d();
            List list3 = (List) hashMap.get(Character.valueOf(d));
            if (list3 == null) {
                list3 = new ArrayList(1);
                hashMap.put(Character.valueOf(d), list3);
            }
            list3.add(hVar);
        }
        this.f19492c = hashMap;
        HashMap hashMap2 = new HashMap();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            oe.a aVar = (oe.a) it2.next();
            char e10 = aVar.e();
            char b10 = aVar.b();
            if (e10 == b10) {
                oe.a aVar2 = (oe.a) hashMap2.get(Character.valueOf(e10));
                if (aVar2 != null && aVar2.e() == aVar2.b()) {
                    if (aVar2 instanceof l) {
                        lVar2 = (l) aVar2;
                    } else {
                        l lVar3 = new l(e10);
                        lVar3.f(aVar2);
                        lVar2 = lVar3;
                    }
                    lVar2.f(aVar);
                    hashMap2.put(Character.valueOf(e10), lVar2);
                } else {
                    b(e10, aVar, hashMap2);
                }
            } else {
                b(e10, aVar, hashMap2);
                b(b10, aVar, hashMap2);
            }
        }
        this.d = hashMap2;
        Set<Character> keySet = this.f19492c.keySet();
        Set<Character> keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        for (Character ch3 : keySet2) {
            bitSet.set(ch3.charValue());
        }
        this.f19491b = bitSet;
    }

    public static void b(char c3, oe.a aVar, HashMap hashMap) {
        if (((oe.a) hashMap.put(Character.valueOf(c3), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c3 + "'");
    }

    @Override
    public final void a(java.lang.String r12, le.p r13) {
        throw new UnsupportedOperationException("Method not decompiled: oc.j.a(java.lang.String, le.p):void");
    }

    public final String c(Pattern pattern) {
        if (this.f19495g >= this.f19494f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f19494f);
        matcher.region(this.f19495g, this.f19494f.length());
        if (!matcher.find()) {
            return null;
        }
        this.f19495g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.f19495g < this.f19494f.length()) {
            return this.f19494f.charAt(this.f19495g);
        }
        return (char) 0;
    }

    public final void e(ie.c cVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        ie.c cVar2 = this.h;
        while (cVar2 != null) {
            ie.c cVar3 = cVar2.f8892e;
            if (cVar3 == cVar) {
                break;
            }
            cVar2 = cVar3;
        }
        while (cVar2 != null) {
            s sVar = cVar2.f8889a;
            char c3 = cVar2.f8890b;
            oe.a aVar = (oe.a) this.d.get(Character.valueOf(c3));
            if (cVar2.d && aVar != null) {
                char e10 = aVar.e();
                ie.c cVar4 = cVar2.f8892e;
                int i10 = 0;
                boolean z11 = false;
                while (cVar4 != null && cVar4 != cVar && cVar4 != hashMap.get(Character.valueOf(c3))) {
                    if (cVar4.f8891c && cVar4.f8890b == e10) {
                        i10 = aVar.c(cVar4, cVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    cVar4 = cVar4.f8892e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c3), cVar2.f8892e);
                        if (!cVar2.f8891c) {
                            f(cVar2);
                        }
                    }
                    cVar2 = cVar2.f8893f;
                } else {
                    s sVar2 = cVar4.f8889a;
                    cVar4.f8894g -= i10;
                    cVar2.f8894g -= i10;
                    sVar2.f15210g = com.google.android.recaptcha.internal.a.m(sVar2.f15210g, i10, 0);
                    sVar.f15210g = com.google.android.recaptcha.internal.a.m(sVar.f15210g, i10, 0);
                    ie.c cVar5 = cVar2.f8892e;
                    while (cVar5 != null && cVar5 != cVar4) {
                        ie.c cVar6 = cVar5.f8892e;
                        f(cVar5);
                        cVar5 = cVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f15208f) != sVar) {
                        a6.b(pVar, (p) sVar.f15207e);
                    }
                    aVar.a(sVar2, sVar, i10);
                    if (cVar4.f8894g == 0) {
                        cVar4.f8889a.g();
                        f(cVar4);
                    }
                    if (cVar2.f8894g == 0) {
                        ie.c cVar7 = cVar2.f8893f;
                        sVar.g();
                        f(cVar2);
                        cVar2 = cVar7;
                    }
                }
            } else {
                cVar2 = cVar2.f8893f;
            }
        }
        while (true) {
            ie.c cVar8 = this.h;
            if (cVar8 != null && cVar8 != cVar) {
                f(cVar8);
            } else {
                return;
            }
        }
    }

    public final void f(ie.c cVar) {
        ie.c cVar2 = cVar.f8892e;
        if (cVar2 != null) {
            cVar2.f8893f = cVar.f8893f;
        }
        ie.c cVar3 = cVar.f8893f;
        if (cVar3 == null) {
            this.h = cVar2;
        } else {
            cVar3.f8892e = cVar2;
        }
    }
}
