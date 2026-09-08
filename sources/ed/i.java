package ed;

import bf.p;
import bf.s;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n7.z0;
import v7.a7;
public final class i implements cf.a {
    public static final Pattern f9072j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f9073k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f9074l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f9075m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f9076n = Pattern.compile("\\s+");
    public final z0 f9077a;
    public final BitSet f9078b;
    public final HashMap f9079c;
    public final HashMap d;
    public p f9080e;
    public String f9081f;
    public int f9082g;
    public ye.b h;
    public f6.f f9083i;

    public i(z0 z0Var, List list, List list2) {
        k kVar;
        this.f9077a = z0Var;
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
        this.f9079c = hashMap;
        HashMap hashMap2 = new HashMap();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ef.a aVar = (ef.a) it2.next();
            char e7 = aVar.e();
            char a2 = aVar.a();
            if (e7 == a2) {
                ef.a aVar2 = (ef.a) hashMap2.get(Character.valueOf(e7));
                if (aVar2 != null && aVar2.e() == aVar2.a()) {
                    if (aVar2 instanceof k) {
                        kVar = (k) aVar2;
                    } else {
                        k kVar2 = new k(e7);
                        kVar2.f(aVar2);
                        kVar = kVar2;
                    }
                    kVar.f(aVar);
                    hashMap2.put(Character.valueOf(e7), kVar);
                } else {
                    b(e7, aVar, hashMap2);
                }
            } else {
                b(e7, aVar, hashMap2);
                b(a2, aVar, hashMap2);
            }
        }
        this.d = hashMap2;
        Set<Character> keySet = this.f9079c.keySet();
        Set<Character> keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        for (Character ch3 : keySet2) {
            bitSet.set(ch3.charValue());
        }
        this.f9078b = bitSet;
    }

    public static void b(char c10, ef.a aVar, HashMap hashMap) {
        if (((ef.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    @Override
    public final void a(java.lang.String r12, bf.p r13) {
        throw new UnsupportedOperationException("Method not decompiled: ed.i.a(java.lang.String, bf.p):void");
    }

    public final String c(Pattern pattern) {
        if (this.f9082g >= this.f9081f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f9081f);
        matcher.region(this.f9082g, this.f9081f.length());
        if (!matcher.find()) {
            return null;
        }
        this.f9082g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.f9082g < this.f9081f.length()) {
            return this.f9081f.charAt(this.f9082g);
        }
        return (char) 0;
    }

    public final void e(ye.b bVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        ye.b bVar2 = this.h;
        while (bVar2 != null) {
            ye.b bVar3 = bVar2.f50007e;
            if (bVar3 == bVar) {
                break;
            }
            bVar2 = bVar3;
        }
        while (bVar2 != null) {
            s sVar = bVar2.f50004a;
            char c10 = bVar2.f50005b;
            ef.a aVar = (ef.a) this.d.get(Character.valueOf(c10));
            if (bVar2.d && aVar != null) {
                char e7 = aVar.e();
                ye.b bVar4 = bVar2.f50007e;
                int i10 = 0;
                boolean z11 = false;
                while (bVar4 != null && bVar4 != bVar && bVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (bVar4.f50006c && bVar4.f50005b == e7) {
                        i10 = aVar.b(bVar4, bVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    bVar4 = bVar4.f50007e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), bVar2.f50007e);
                        if (!bVar2.f50006c) {
                            f(bVar2);
                        }
                    }
                    bVar2 = bVar2.f50008f;
                } else {
                    s sVar2 = bVar4.f50004a;
                    bVar4.f50009g -= i10;
                    bVar2.f50009g -= i10;
                    sVar2.f2670g = e2.i(i10, 0, sVar2.f2670g);
                    sVar.f2670g = e2.i(i10, 0, sVar.f2670g);
                    ye.b bVar5 = bVar2.f50007e;
                    while (bVar5 != null && bVar5 != bVar4) {
                        ye.b bVar6 = bVar5.f50007e;
                        f(bVar5);
                        bVar5 = bVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f2668f) != sVar) {
                        a7.b(pVar, (p) sVar.f2667e);
                    }
                    aVar.d(sVar2, sVar, i10);
                    if (bVar4.f50009g == 0) {
                        bVar4.f50004a.g();
                        f(bVar4);
                    }
                    if (bVar2.f50009g == 0) {
                        ye.b bVar7 = bVar2.f50008f;
                        sVar.g();
                        f(bVar2);
                        bVar2 = bVar7;
                    }
                }
            } else {
                bVar2 = bVar2.f50008f;
            }
        }
        while (true) {
            ye.b bVar8 = this.h;
            if (bVar8 != null && bVar8 != bVar) {
                f(bVar8);
            } else {
                return;
            }
        }
    }

    public final void f(ye.b bVar) {
        ye.b bVar2 = bVar.f50007e;
        if (bVar2 != null) {
            bVar2.f50008f = bVar.f50008f;
        }
        ye.b bVar3 = bVar.f50008f;
        if (bVar3 == null) {
            this.h = bVar2;
        } else {
            bVar3.f50007e = bVar2;
        }
    }
}
