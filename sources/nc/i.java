package nc;

import h7.z;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.p;
import je.s;

public final class i implements ke.a {

    public static final Pattern f18458j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    public static final Pattern f18459k = Pattern.compile("^ *(?:\n *)?");

    public static final Pattern f18460l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    public static final Pattern f18461m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    public static final Pattern f18462n = Pattern.compile("\\s+");

    public final g5.b f18463a;

    public final BitSet f18464b;

    public final HashMap f18465c;
    public final HashMap d;

    public p f18466e;

    public String f18467f;

    public int f18468g;
    public ge.c h;

    public ge.b f18469i;

    public i(g5.b bVar, List list, List list2) {
        k kVar;
        this.f18463a = bVar;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            char cD = hVar.d();
            List arrayList = (List) map.get(Character.valueOf(cD));
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                map.put(Character.valueOf(cD), arrayList);
            }
            arrayList.add(hVar);
        }
        this.f18465c = map;
        HashMap map2 = new HashMap();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            me.a aVar = (me.a) it2.next();
            char cE = aVar.e();
            char cA = aVar.a();
            if (cE == cA) {
                me.a aVar2 = (me.a) map2.get(Character.valueOf(cE));
                if (aVar2 == null || aVar2.e() != aVar2.a()) {
                    b(cE, aVar, map2);
                } else {
                    if (aVar2 instanceof k) {
                        kVar = (k) aVar2;
                    } else {
                        k kVar2 = new k(cE);
                        kVar2.f(aVar2);
                        kVar = kVar2;
                    }
                    kVar.f(aVar);
                    map2.put(Character.valueOf(cE), kVar);
                }
            } else {
                b(cE, aVar, map2);
                b(cA, aVar, map2);
            }
        }
        this.d = map2;
        Set setKeySet = this.f18465c.keySet();
        Set setKeySet2 = map2.keySet();
        BitSet bitSet = new BitSet();
        Iterator it3 = setKeySet.iterator();
        while (it3.hasNext()) {
            bitSet.set(((Character) it3.next()).charValue());
        }
        Iterator it4 = setKeySet2.iterator();
        while (it4.hasNext()) {
            bitSet.set(((Character) it4.next()).charValue());
        }
        this.f18464b = bitSet;
    }

    public static void b(char c10, me.a aVar, HashMap map) {
        if (((me.a) map.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    @Override
    public final void a(String str, p pVar) {
        p sVar;
        p sVar2;
        boolean z10;
        boolean z11;
        ge.i iVar;
        this.f18467f = str.trim();
        this.f18468g = 0;
        this.h = null;
        this.f18469i = null;
        this.f18466e = pVar;
        while (true) {
            char cD = d();
            if (cD == 0) {
                sVar2 = null;
            } else {
                List<h> list = (List) this.f18465c.get(Character.valueOf(cD));
                if (list != null) {
                    int i10 = this.f18468g;
                    sVar2 = null;
                    for (h hVar : list) {
                        hVar.f18455a = this;
                        hVar.f18456b = this.f18466e;
                        hVar.f18457c = this.f18467f;
                        hVar.d = this.f18468g;
                        sVar = hVar.b();
                        this.f18468g = hVar.d;
                        if (sVar != null) {
                            sVar2 = sVar;
                            break;
                        } else {
                            this.f18468g = i10;
                            sVar2 = sVar;
                        }
                    }
                } else {
                    me.a aVar = (me.a) this.d.get(Character.valueOf(cD));
                    if (aVar == null) {
                        int i11 = this.f18468g;
                        int length = this.f18467f.length();
                        while (true) {
                            int i12 = this.f18468g;
                            if (i12 == length) {
                                break;
                            }
                            if (this.f18464b.get(this.f18467f.charAt(i12))) {
                                break;
                            } else {
                                this.f18468g++;
                            }
                        }
                        int i13 = this.f18468g;
                        if (i11 != i13) {
                            sVar = new s(this.f18467f.substring(i11, i13));
                            sVar2 = sVar;
                            break;
                        }
                    } else {
                        int i14 = this.f18468g;
                        int i15 = 0;
                        while (d() == cD) {
                            i15++;
                            this.f18468g++;
                        }
                        if (i15 < aVar.d()) {
                            this.f18468g = i14;
                            iVar = null;
                        } else {
                            String strSubstring = i14 == 0 ? "\n" : this.f18467f.substring(i14 - 1, i14);
                            char cD2 = d();
                            String strValueOf = cD2 != 0 ? String.valueOf(cD2) : "\n";
                            Pattern pattern = f18458j;
                            boolean zMatches = pattern.matcher(strSubstring).matches();
                            Pattern pattern2 = f18460l;
                            boolean zMatches2 = pattern2.matcher(strSubstring).matches();
                            boolean zMatches3 = pattern.matcher(strValueOf).matches();
                            boolean zMatches4 = pattern2.matcher(strValueOf).matches();
                            boolean z12 = !zMatches4 && (!zMatches3 || zMatches2 || zMatches);
                            boolean z13 = !zMatches2 && (!zMatches || zMatches4 || zMatches3);
                            if (cD == '_') {
                                z11 = z12 && (!z13 || zMatches);
                                z10 = z13 && (!z12 || zMatches3);
                            } else {
                                boolean z14 = z12 && cD == aVar.e();
                                z10 = z13 && cD == aVar.a();
                                z11 = z14;
                            }
                            this.f18468g = i14;
                            iVar = new ge.i(i15, z11, z10);
                        }
                        if (iVar != null) {
                            int i16 = iVar.f6885a;
                            int i17 = this.f18468g;
                            int i18 = i17 + i16;
                            this.f18468g = i18;
                            ge.i iVar2 = iVar;
                            s sVar3 = new s(this.f18467f.substring(i17, i18));
                            boolean z15 = iVar2.f6887c;
                            boolean z16 = iVar2.f6886b;
                            ge.c cVar = this.h;
                            ge.c cVar2 = new ge.c(sVar3, cD, z15, z16, cVar);
                            this.h = cVar2;
                            cVar2.f6857g = i16;
                            cVar2.h = i16;
                            if (cVar != null) {
                                cVar.f6856f = cVar2;
                            }
                            sVar2 = sVar3;
                        }
                    }
                    sVar2 = null;
                }
                if (sVar2 == null) {
                    this.f18468g++;
                    sVar2 = new s(String.valueOf(cD));
                }
            }
            if (sVar2 == null) {
                break;
            } else {
                pVar.b(sVar2);
            }
        }
        e(null);
        p pVar2 = (p) pVar.f12925c;
        p pVar3 = (p) pVar.d;
        if (pVar2 == pVar3) {
            return;
        }
        z.b(pVar2, pVar3);
    }

    public final String c(Pattern pattern) {
        if (this.f18468g >= this.f18467f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f18467f);
        matcher.region(this.f18468g, this.f18467f.length());
        if (!matcher.find()) {
            return null;
        }
        this.f18468g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.f18468g < this.f18467f.length()) {
            return this.f18467f.charAt(this.f18468g);
        }
        return (char) 0;
    }

    public final void e(ge.c cVar) {
        boolean z10;
        p pVar;
        HashMap map = new HashMap();
        ge.c cVar2 = this.h;
        while (cVar2 != null) {
            ge.c cVar3 = cVar2.f6855e;
            if (cVar3 == cVar) {
                break;
            } else {
                cVar2 = cVar3;
            }
        }
        while (cVar2 != null) {
            s sVar = cVar2.f6852a;
            char c10 = cVar2.f6853b;
            me.a aVar = (me.a) this.d.get(Character.valueOf(c10));
            if (!cVar2.d || aVar == null) {
                cVar2 = cVar2.f6856f;
            } else {
                char cE = aVar.e();
                ge.c cVar4 = cVar2.f6855e;
                int iC = 0;
                boolean z11 = false;
                while (true) {
                    if (cVar4 == null || cVar4 == cVar || cVar4 == map.get(Character.valueOf(c10))) {
                        z10 = z11;
                        z11 = false;
                        break;
                    }
                    if (cVar4.f6854c && cVar4.f6853b == cE) {
                        iC = aVar.c(cVar4, cVar2);
                        z11 = true;
                        if (iC > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    cVar4 = cVar4.f6855e;
                }
                if (z11) {
                    s sVar2 = cVar4.f6852a;
                    cVar4.f6857g -= iC;
                    cVar2.f6857g -= iC;
                    sVar2.f12929g = com.google.android.recaptcha.internal.a.n(sVar2.f12929g, iC, 0);
                    sVar.f12929g = com.google.android.recaptcha.internal.a.n(sVar.f12929g, iC, 0);
                    ge.c cVar5 = cVar2.f6855e;
                    while (cVar5 != null && cVar5 != cVar4) {
                        ge.c cVar6 = cVar5.f6855e;
                        f(cVar5);
                        cVar5 = cVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f12927f) != sVar) {
                        z.b(pVar, (p) sVar.f12926e);
                    }
                    aVar.b(sVar2, sVar, iC);
                    if (cVar4.f6857g == 0) {
                        cVar4.f6852a.g();
                        f(cVar4);
                    }
                    if (cVar2.f6857g == 0) {
                        ge.c cVar7 = cVar2.f6856f;
                        sVar.g();
                        f(cVar2);
                        cVar2 = cVar7;
                    }
                } else {
                    if (!z10) {
                        map.put(Character.valueOf(c10), cVar2.f6855e);
                        if (!cVar2.f6854c) {
                            f(cVar2);
                        }
                    }
                    cVar2 = cVar2.f6856f;
                }
            }
        }
        while (true) {
            ge.c cVar8 = this.h;
            if (cVar8 == null || cVar8 == cVar) {
                return;
            } else {
                f(cVar8);
            }
        }
    }

    public final void f(ge.c cVar) {
        ge.c cVar2 = cVar.f6855e;
        if (cVar2 != null) {
            cVar2.f6856f = cVar.f6856f;
        }
        ge.c cVar3 = cVar.f6856f;
        if (cVar3 == null) {
            this.h = cVar2;
        } else {
            cVar3.f6855e = cVar2;
        }
    }
}
