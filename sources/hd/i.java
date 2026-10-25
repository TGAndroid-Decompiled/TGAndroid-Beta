package hd;

import a8.pc;
import c3.h0;
import ef.p;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n4.s;
public final class i implements ff.a {
    public static final Pattern f12776j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f12777k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f12778l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f12779m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f12780n = Pattern.compile("\\s+");
    public final s f12781a;
    public final BitSet f12782b;
    public final HashMap f12783c;
    public final HashMap d;
    public p e;
    public String f12784f;
    public int f12785g;
    public bf.e h;
    public bf.d f12786i;

    public i(s sVar, List list, List list2) {
        k kVar;
        this.f12781a = sVar;
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
        this.f12783c = hashMap;
        HashMap hashMap2 = new HashMap();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            hf.a aVar = (hf.a) it2.next();
            char e = aVar.e();
            char b10 = aVar.b();
            if (e == b10) {
                hf.a aVar2 = (hf.a) hashMap2.get(Character.valueOf(e));
                if (aVar2 != null && aVar2.e() == aVar2.b()) {
                    if (aVar2 instanceof k) {
                        kVar = (k) aVar2;
                    } else {
                        k kVar2 = new k(e);
                        kVar2.f(aVar2);
                        kVar = kVar2;
                    }
                    kVar.f(aVar);
                    hashMap2.put(Character.valueOf(e), kVar);
                } else {
                    b(e, aVar, hashMap2);
                }
            } else {
                b(e, aVar, hashMap2);
                b(b10, aVar, hashMap2);
            }
        }
        this.d = hashMap2;
        Set<Character> keySet = this.f12783c.keySet();
        Set<Character> keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        for (Character ch3 : keySet2) {
            bitSet.set(ch3.charValue());
        }
        this.f12782b = bitSet;
    }

    public static void b(char c10, hf.a aVar, HashMap hashMap) {
        if (((hf.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    @Override
    public final void a(java.lang.String r12, ef.p r13) {
        throw new UnsupportedOperationException("Method not decompiled: hd.i.a(java.lang.String, ef.p):void");
    }

    public final String c(Pattern pattern) {
        if (this.f12785g >= this.f12784f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f12784f);
        matcher.region(this.f12785g, this.f12784f.length());
        if (!matcher.find()) {
            return null;
        }
        this.f12785g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.f12785g < this.f12784f.length()) {
            return this.f12784f.charAt(this.f12785g);
        }
        return (char) 0;
    }

    public final void e(bf.e eVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        bf.e eVar2 = this.h;
        while (eVar2 != null) {
            bf.e eVar3 = eVar2.e;
            if (eVar3 == eVar) {
                break;
            }
            eVar2 = eVar3;
        }
        while (eVar2 != null) {
            ef.s sVar = eVar2.f3912a;
            char c10 = eVar2.f3913b;
            hf.a aVar = (hf.a) this.d.get(Character.valueOf(c10));
            if (eVar2.d && aVar != null) {
                char e = aVar.e();
                bf.e eVar4 = eVar2.e;
                int i10 = 0;
                boolean z11 = false;
                while (eVar4 != null && eVar4 != eVar && eVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (eVar4.f3914c && eVar4.f3913b == e) {
                        i10 = aVar.a(eVar4, eVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    eVar4 = eVar4.e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), eVar2.e);
                        if (!eVar2.f3914c) {
                            f(eVar2);
                        }
                    }
                    eVar2 = eVar2.f3915f;
                } else {
                    ef.s sVar2 = eVar4.f3912a;
                    eVar4.f3916g -= i10;
                    eVar2.f3916g -= i10;
                    sVar2.f9941g = h0.l(i10, 0, sVar2.f9941g);
                    sVar.f9941g = h0.l(i10, 0, sVar.f9941g);
                    bf.e eVar5 = eVar2.e;
                    while (eVar5 != null && eVar5 != eVar4) {
                        bf.e eVar6 = eVar5.e;
                        f(eVar5);
                        eVar5 = eVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f9939f) != sVar) {
                        pc.b(pVar, (p) sVar.e);
                    }
                    aVar.d(sVar2, sVar, i10);
                    if (eVar4.f3916g == 0) {
                        eVar4.f3912a.g();
                        f(eVar4);
                    }
                    if (eVar2.f3916g == 0) {
                        bf.e eVar7 = eVar2.f3915f;
                        sVar.g();
                        f(eVar2);
                        eVar2 = eVar7;
                    }
                }
            } else {
                eVar2 = eVar2.f3915f;
            }
        }
        while (true) {
            bf.e eVar8 = this.h;
            if (eVar8 != null && eVar8 != eVar) {
                f(eVar8);
            } else {
                return;
            }
        }
    }

    public final void f(bf.e eVar) {
        bf.e eVar2 = eVar.e;
        if (eVar2 != null) {
            eVar2.f3915f = eVar.f3915f;
        }
        bf.e eVar3 = eVar.f3915f;
        if (eVar3 == null) {
            this.h = eVar2;
        } else {
            eVar3.e = eVar2;
        }
    }
}
