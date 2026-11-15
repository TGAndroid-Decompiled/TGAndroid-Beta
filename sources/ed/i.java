package ed;

import a8.z9;
import com.google.android.gms.internal.vision.e2;
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
    public static final Pattern f10583j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f10584k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f10585l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f10586m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f10587n = Pattern.compile("\\s+");
    public final wf.b f10588a;
    public final BitSet f10589b;
    public final HashMap f10590c;
    public final HashMap d;
    public p f10591e;
    public String f10592f;
    public int f10593g;
    public gf.e h;
    public gf.d f10594i;

    public i(wf.b bVar, List list, List list2) {
        k kVar;
        this.f10588a = bVar;
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
        this.f10590c = hashMap;
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
        Set<Character> keySet = this.f10590c.keySet();
        Set<Character> keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        for (Character ch3 : keySet2) {
            bitSet.set(ch3.charValue());
        }
        this.f10589b = bitSet;
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
        if (this.f10593g >= this.f10592f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f10592f);
        matcher.region(this.f10593g, this.f10592f.length());
        if (!matcher.find()) {
            return null;
        }
        this.f10593g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.f10593g < this.f10592f.length()) {
            return this.f10592f.charAt(this.f10593g);
        }
        return (char) 0;
    }

    public final void e(gf.e eVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        gf.e eVar2 = this.h;
        while (eVar2 != null) {
            gf.e eVar3 = eVar2.f13227e;
            if (eVar3 == eVar) {
                break;
            }
            eVar2 = eVar3;
        }
        while (eVar2 != null) {
            s sVar = eVar2.f13224a;
            char c10 = eVar2.f13225b;
            nf.a aVar = (nf.a) this.d.get(Character.valueOf(c10));
            if (eVar2.d && aVar != null) {
                char e10 = aVar.e();
                gf.e eVar4 = eVar2.f13227e;
                int i7 = 0;
                boolean z11 = false;
                while (eVar4 != null && eVar4 != eVar && eVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (eVar4.f13226c && eVar4.f13225b == e10) {
                        i7 = aVar.c(eVar4, eVar2);
                        z11 = true;
                        if (i7 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    eVar4 = eVar4.f13227e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), eVar2.f13227e);
                        if (!eVar2.f13226c) {
                            f(eVar2);
                        }
                    }
                    eVar2 = eVar2.f13228f;
                } else {
                    s sVar2 = eVar4.f13224a;
                    eVar4.f13229g -= i7;
                    eVar2.f13229g -= i7;
                    sVar2.f17845g = e2.k(sVar2.f17845g, i7, 0);
                    sVar.f17845g = e2.k(sVar.f17845g, i7, 0);
                    gf.e eVar5 = eVar2.f13227e;
                    while (eVar5 != null && eVar5 != eVar4) {
                        gf.e eVar6 = eVar5.f13227e;
                        f(eVar5);
                        eVar5 = eVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f17843f) != sVar) {
                        z9.b(pVar, (p) sVar.f17842e);
                    }
                    aVar.a(sVar2, sVar, i7);
                    if (eVar4.f13229g == 0) {
                        eVar4.f13224a.g();
                        f(eVar4);
                    }
                    if (eVar2.f13229g == 0) {
                        gf.e eVar7 = eVar2.f13228f;
                        sVar.g();
                        f(eVar2);
                        eVar2 = eVar7;
                    }
                }
            } else {
                eVar2 = eVar2.f13228f;
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
        gf.e eVar2 = eVar.f13227e;
        if (eVar2 != null) {
            eVar2.f13228f = eVar.f13228f;
        }
        gf.e eVar3 = eVar.f13228f;
        if (eVar3 == null) {
            this.h = eVar2;
        } else {
            eVar3.f13227e = eVar2;
        }
    }
}
