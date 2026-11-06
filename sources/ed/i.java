package ed;

import a8.x9;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kf.p;
import kf.s;
public final class i implements lf.a {
    public static final Pattern f10747j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f10748k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f10749l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f10750m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f10751n = Pattern.compile("\\s+");
    public final wf.b f10752a;
    public final BitSet f10753b;
    public final HashMap f10754c;
    public final HashMap d;
    public p f10755e;
    public String f10756f;
    public int f10757g;
    public gf.e h;
    public gf.d f10758i;

    public i(wf.b bVar, List list, List list2) {
        k kVar;
        this.f10752a = bVar;
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
        this.f10754c = hashMap;
        HashMap hashMap2 = new HashMap();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            nf.a aVar = (nf.a) it2.next();
            char e10 = aVar.e();
            char b10 = aVar.b();
            if (e10 == b10) {
                nf.a aVar2 = (nf.a) hashMap2.get(Character.valueOf(e10));
                if (aVar2 != null && aVar2.e() == aVar2.b()) {
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
                b(b10, aVar, hashMap2);
            }
        }
        this.d = hashMap2;
        Set<Character> keySet = this.f10754c.keySet();
        Set<Character> keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        for (Character ch3 : keySet2) {
            bitSet.set(ch3.charValue());
        }
        this.f10753b = bitSet;
    }

    public static void b(char c10, nf.a aVar, HashMap hashMap) {
        if (((nf.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    @Override
    public final void a(java.lang.String r12, kf.p r13) {
        throw new UnsupportedOperationException("Method not decompiled: ed.i.a(java.lang.String, kf.p):void");
    }

    public final String c(Pattern pattern) {
        if (this.f10757g >= this.f10756f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f10756f);
        matcher.region(this.f10757g, this.f10756f.length());
        if (!matcher.find()) {
            return null;
        }
        this.f10757g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.f10757g < this.f10756f.length()) {
            return this.f10756f.charAt(this.f10757g);
        }
        return (char) 0;
    }

    public final void e(gf.e eVar) {
        boolean z9;
        p pVar;
        HashMap hashMap = new HashMap();
        gf.e eVar2 = this.h;
        while (eVar2 != null) {
            gf.e eVar3 = eVar2.f13883e;
            if (eVar3 == eVar) {
                break;
            }
            eVar2 = eVar3;
        }
        while (eVar2 != null) {
            s sVar = eVar2.f13880a;
            char c10 = eVar2.f13881b;
            nf.a aVar = (nf.a) this.d.get(Character.valueOf(c10));
            if (eVar2.d && aVar != null) {
                char e10 = aVar.e();
                gf.e eVar4 = eVar2.f13883e;
                int i7 = 0;
                boolean z10 = false;
                while (eVar4 != null && eVar4 != eVar && eVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (eVar4.f13882c && eVar4.f13881b == e10) {
                        i7 = aVar.c(eVar4, eVar2);
                        z10 = true;
                        if (i7 > 0) {
                            z9 = true;
                            break;
                        }
                    }
                    eVar4 = eVar4.f13883e;
                }
                z9 = z10;
                z10 = false;
                if (!z10) {
                    if (!z9) {
                        hashMap.put(Character.valueOf(c10), eVar2.f13883e);
                        if (!eVar2.f13882c) {
                            f(eVar2);
                        }
                    }
                    eVar2 = eVar2.f13884f;
                } else {
                    s sVar2 = eVar4.f13880a;
                    eVar4.f13885g -= i7;
                    eVar2.f13885g -= i7;
                    sVar2.f17283g = com.google.android.recaptcha.internal.a.k(sVar2.f17283g, i7, 0);
                    sVar.f17283g = com.google.android.recaptcha.internal.a.k(sVar.f17283g, i7, 0);
                    gf.e eVar5 = eVar2.f13883e;
                    while (eVar5 != null && eVar5 != eVar4) {
                        gf.e eVar6 = eVar5.f13883e;
                        f(eVar5);
                        eVar5 = eVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f17281f) != sVar) {
                        x9.b(pVar, (p) sVar.f17280e);
                    }
                    aVar.a(sVar2, sVar, i7);
                    if (eVar4.f13885g == 0) {
                        eVar4.f13880a.g();
                        f(eVar4);
                    }
                    if (eVar2.f13885g == 0) {
                        gf.e eVar7 = eVar2.f13884f;
                        sVar.g();
                        f(eVar2);
                        eVar2 = eVar7;
                    }
                }
            } else {
                eVar2 = eVar2.f13884f;
            }
        }
        while (true) {
            gf.e eVar8 = this.h;
            if (eVar8 != null && eVar8 != eVar) {
                f(eVar8);
            } else {
                return;
            }
        }
    }

    public final void f(gf.e eVar) {
        gf.e eVar2 = eVar.f13883e;
        if (eVar2 != null) {
            eVar2.f13884f = eVar.f13884f;
        }
        gf.e eVar3 = eVar.f13884f;
        if (eVar3 == null) {
            this.h = eVar2;
        } else {
            eVar3.f13883e = eVar2;
        }
    }
}
