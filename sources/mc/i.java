package mc;

import g7.x;
import ie.p;
import ie.s;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class i implements je.a {
    public static final Pattern f17622j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f17623k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f17624l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f17625m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f17626n = Pattern.compile("\\s+");
    public final we.b f17627a;
    public final BitSet f17628b;
    public final HashMap f17629c;
    public final HashMap d;
    public p f17630e;
    public String f17631f;
    public int f17632g;
    public fe.c h;
    public fe.b f17633i;

    public i(we.b bVar, List list, List list2) {
        k kVar;
        this.f17627a = bVar;
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
        this.f17629c = hashMap;
        HashMap hashMap2 = new HashMap();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            le.a aVar = (le.a) it2.next();
            char e10 = aVar.e();
            char c10 = aVar.c();
            if (e10 == c10) {
                le.a aVar2 = (le.a) hashMap2.get(Character.valueOf(e10));
                if (aVar2 != null && aVar2.e() == aVar2.c()) {
                    if (aVar2 instanceof k) {
                        kVar = (k) aVar2;
                    } else {
                        k kVar2 = new k(e10);
                        kVar2.f(aVar2);
                        kVar = kVar2;
                    }
                    kVar.f(aVar);
                    hashMap2.put(Character.valueOf(e10), kVar);
                } else {
                    b(e10, aVar, hashMap2);
                }
            } else {
                b(e10, aVar, hashMap2);
                b(c10, aVar, hashMap2);
            }
        }
        this.d = hashMap2;
        Set<Character> keySet = this.f17629c.keySet();
        Set<Character> keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        for (Character ch3 : keySet2) {
            bitSet.set(ch3.charValue());
        }
        this.f17628b = bitSet;
    }

    public static void b(char c10, le.a aVar, HashMap hashMap) {
        if (((le.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    @Override
    public final void a(java.lang.String r12, ie.p r13) {
        throw new UnsupportedOperationException("Method not decompiled: mc.i.a(java.lang.String, ie.p):void");
    }

    public final String c(Pattern pattern) {
        if (this.f17632g >= this.f17631f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f17631f);
        matcher.region(this.f17632g, this.f17631f.length());
        if (!matcher.find()) {
            return null;
        }
        this.f17632g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.f17632g < this.f17631f.length()) {
            return this.f17631f.charAt(this.f17632g);
        }
        return (char) 0;
    }

    public final void e(fe.c cVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        fe.c cVar2 = this.h;
        while (cVar2 != null) {
            fe.c cVar3 = cVar2.f6055e;
            if (cVar3 == cVar) {
                break;
            }
            cVar2 = cVar3;
        }
        while (cVar2 != null) {
            s sVar = cVar2.f6052a;
            char c10 = cVar2.f6053b;
            le.a aVar = (le.a) this.d.get(Character.valueOf(c10));
            if (cVar2.d && aVar != null) {
                char e10 = aVar.e();
                fe.c cVar4 = cVar2.f6055e;
                int i9 = 0;
                boolean z11 = false;
                while (cVar4 != null && cVar4 != cVar && cVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (cVar4.f6054c && cVar4.f6053b == e10) {
                        i9 = aVar.a(cVar4, cVar2);
                        z11 = true;
                        if (i9 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    cVar4 = cVar4.f6055e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), cVar2.f6055e);
                        if (!cVar2.f6054c) {
                            f(cVar2);
                        }
                    }
                    cVar2 = cVar2.f6056f;
                } else {
                    s sVar2 = cVar4.f6052a;
                    cVar4.f6057g -= i9;
                    cVar2.f6057g -= i9;
                    sVar2.f11127g = e2.c.m(sVar2.f11127g, i9, 0);
                    sVar.f11127g = e2.c.m(sVar.f11127g, i9, 0);
                    fe.c cVar5 = cVar2.f6055e;
                    while (cVar5 != null && cVar5 != cVar4) {
                        fe.c cVar6 = cVar5.f6055e;
                        f(cVar5);
                        cVar5 = cVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f11125f) != sVar) {
                        x.b(pVar, (p) sVar.f11124e);
                    }
                    aVar.b(sVar2, sVar, i9);
                    if (cVar4.f6057g == 0) {
                        cVar4.f6052a.g();
                        f(cVar4);
                    }
                    if (cVar2.f6057g == 0) {
                        fe.c cVar7 = cVar2.f6056f;
                        sVar.g();
                        f(cVar2);
                        cVar2 = cVar7;
                    }
                }
            } else {
                cVar2 = cVar2.f6056f;
            }
        }
        while (true) {
            fe.c cVar8 = this.h;
            if (cVar8 != null && cVar8 != cVar) {
                f(cVar8);
            } else {
                return;
            }
        }
    }

    public final void f(fe.c cVar) {
        fe.c cVar2 = cVar.f6055e;
        if (cVar2 != null) {
            cVar2.f6056f = cVar.f6056f;
        }
        fe.c cVar3 = cVar.f6056f;
        if (cVar3 == null) {
            this.h = cVar2;
        } else {
            cVar3.f6055e = cVar2;
        }
    }
}
