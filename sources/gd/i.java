package gd;

import com.google.android.gms.internal.play_billing.k3;
import df.p;
import df.s;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v7.p7;
public final class i implements ef.a {
    public static final Pattern f11000j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f11001k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f11002l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f11003m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f11004n = Pattern.compile("\\s+");
    public final qf.b f11005a;
    public final BitSet f11006b;
    public final HashMap f11007c;
    public final HashMap d;
    public p e;
    public String f11008f;
    public int f11009g;
    public af.f h;
    public af.e f11010i;

    public i(qf.b bVar, List list, List list2) {
        k kVar;
        this.f11005a = bVar;
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
        this.f11007c = hashMap;
        HashMap hashMap2 = new HashMap();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            gf.a aVar = (gf.a) it2.next();
            char e = aVar.e();
            char a2 = aVar.a();
            if (e == a2) {
                gf.a aVar2 = (gf.a) hashMap2.get(Character.valueOf(e));
                if (aVar2 != null && aVar2.e() == aVar2.a()) {
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
                b(a2, aVar, hashMap2);
            }
        }
        this.d = hashMap2;
        Set<Character> keySet = this.f11007c.keySet();
        Set<Character> keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        for (Character ch3 : keySet2) {
            bitSet.set(ch3.charValue());
        }
        this.f11006b = bitSet;
    }

    public static void b(char c10, gf.a aVar, HashMap hashMap) {
        if (((gf.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    @Override
    public final void a(java.lang.String r12, df.p r13) {
        throw new UnsupportedOperationException("Method not decompiled: gd.i.a(java.lang.String, df.p):void");
    }

    public final String c(Pattern pattern) {
        if (this.f11009g >= this.f11008f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f11008f);
        matcher.region(this.f11009g, this.f11008f.length());
        if (!matcher.find()) {
            return null;
        }
        this.f11009g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.f11009g < this.f11008f.length()) {
            return this.f11008f.charAt(this.f11009g);
        }
        return (char) 0;
    }

    public final void e(af.f fVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        af.f fVar2 = this.h;
        while (fVar2 != null) {
            af.f fVar3 = fVar2.e;
            if (fVar3 == fVar) {
                break;
            }
            fVar2 = fVar3;
        }
        while (fVar2 != null) {
            s sVar = fVar2.f562a;
            char c10 = fVar2.f563b;
            gf.a aVar = (gf.a) this.d.get(Character.valueOf(c10));
            if (fVar2.d && aVar != null) {
                char e = aVar.e();
                af.f fVar4 = fVar2.e;
                int i10 = 0;
                boolean z11 = false;
                while (fVar4 != null && fVar4 != fVar && fVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (fVar4.f564c && fVar4.f563b == e) {
                        i10 = aVar.d(fVar4, fVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    fVar4 = fVar4.e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), fVar2.e);
                        if (!fVar2.f564c) {
                            f(fVar2);
                        }
                    }
                    fVar2 = fVar2.f565f;
                } else {
                    s sVar2 = fVar4.f562a;
                    fVar4.f566g -= i10;
                    fVar2.f566g -= i10;
                    sVar2.f7991g = k3.j(i10, 0, sVar2.f7991g);
                    sVar.f7991g = k3.j(i10, 0, sVar.f7991g);
                    af.f fVar5 = fVar2.e;
                    while (fVar5 != null && fVar5 != fVar4) {
                        af.f fVar6 = fVar5.e;
                        f(fVar5);
                        fVar5 = fVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f7989f) != sVar) {
                        p7.b(pVar, (p) sVar.e);
                    }
                    aVar.b(sVar2, sVar, i10);
                    if (fVar4.f566g == 0) {
                        fVar4.f562a.g();
                        f(fVar4);
                    }
                    if (fVar2.f566g == 0) {
                        af.f fVar7 = fVar2.f565f;
                        sVar.g();
                        f(fVar2);
                        fVar2 = fVar7;
                    }
                }
            } else {
                fVar2 = fVar2.f565f;
            }
        }
        while (true) {
            af.f fVar8 = this.h;
            if (fVar8 != null && fVar8 != fVar) {
                f(fVar8);
            } else {
                return;
            }
        }
    }

    public final void f(af.f fVar) {
        af.f fVar2 = fVar.e;
        if (fVar2 != null) {
            fVar2.f565f = fVar.f565f;
        }
        af.f fVar3 = fVar.f565f;
        if (fVar3 == null) {
            this.h = fVar2;
        } else {
            fVar3.e = fVar2;
        }
    }
}
