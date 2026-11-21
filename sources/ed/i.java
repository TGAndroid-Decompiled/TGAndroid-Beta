package ed;

import a8.aa;
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
    public static final Pattern f10927j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f10928k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f10929l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f10930m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f10931n = Pattern.compile("\\s+");
    public final wf.b f10932a;
    public final BitSet f10933b;
    public final HashMap f10934c;
    public final HashMap d;
    public p f10935e;
    public String f10936f;
    public int f10937g;
    public gf.e h;
    public gf.d f10938i;

    public i(wf.b bVar, List list, List list2) {
        k kVar;
        this.f10932a = bVar;
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
        this.f10934c = hashMap;
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
        Set<Character> keySet = this.f10934c.keySet();
        Set<Character> keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        for (Character ch3 : keySet2) {
            bitSet.set(ch3.charValue());
        }
        this.f10933b = bitSet;
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
        if (this.f10937g >= this.f10936f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f10936f);
        matcher.region(this.f10937g, this.f10936f.length());
        if (!matcher.find()) {
            return null;
        }
        this.f10937g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.f10937g < this.f10936f.length()) {
            return this.f10936f.charAt(this.f10937g);
        }
        return (char) 0;
    }

    public final void e(gf.e eVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        gf.e eVar2 = this.h;
        while (eVar2 != null) {
            gf.e eVar3 = eVar2.f13568e;
            if (eVar3 == eVar) {
                break;
            }
            eVar2 = eVar3;
        }
        while (eVar2 != null) {
            s sVar = eVar2.f13565a;
            char c10 = eVar2.f13566b;
            nf.a aVar = (nf.a) this.d.get(Character.valueOf(c10));
            if (eVar2.d && aVar != null) {
                char e10 = aVar.e();
                gf.e eVar4 = eVar2.f13568e;
                int i7 = 0;
                boolean z11 = false;
                while (eVar4 != null && eVar4 != eVar && eVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (eVar4.f13567c && eVar4.f13566b == e10) {
                        i7 = aVar.c(eVar4, eVar2);
                        z11 = true;
                        if (i7 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    eVar4 = eVar4.f13568e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), eVar2.f13568e);
                        if (!eVar2.f13567c) {
                            f(eVar2);
                        }
                    }
                    eVar2 = eVar2.f13569f;
                } else {
                    s sVar2 = eVar4.f13565a;
                    eVar4.f13570g -= i7;
                    eVar2.f13570g -= i7;
                    sVar2.f18268g = e2.k(sVar2.f18268g, i7, 0);
                    sVar.f18268g = e2.k(sVar.f18268g, i7, 0);
                    gf.e eVar5 = eVar2.f13568e;
                    while (eVar5 != null && eVar5 != eVar4) {
                        gf.e eVar6 = eVar5.f13568e;
                        f(eVar5);
                        eVar5 = eVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f18266f) != sVar) {
                        aa.b(pVar, (p) sVar.f18265e);
                    }
                    aVar.a(sVar2, sVar, i7);
                    if (eVar4.f13570g == 0) {
                        eVar4.f13565a.g();
                        f(eVar4);
                    }
                    if (eVar2.f13570g == 0) {
                        gf.e eVar7 = eVar2.f13569f;
                        sVar.g();
                        f(eVar2);
                        eVar2 = eVar7;
                    }
                }
            } else {
                eVar2 = eVar2.f13569f;
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
        gf.e eVar2 = eVar.f13568e;
        if (eVar2 != null) {
            eVar2.f13569f = eVar.f13569f;
        }
        gf.e eVar3 = eVar.f13569f;
        if (eVar3 == null) {
            this.h = eVar2;
        } else {
            eVar3.f13568e = eVar2;
        }
    }
}
