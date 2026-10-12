package fd;

import cf.p;
import cf.s;
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
import v7.c7;
public final class i implements df.a {
    public static final Pattern f9865j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f9866k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f9867l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f9868m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f9869n = Pattern.compile("\\s+");
    public final z0 f9870a;
    public final BitSet f9871b;
    public final HashMap f9872c;
    public final HashMap d;
    public p f9873e;
    public String f9874f;
    public int f9875g;
    public ze.b h;
    public f6.f f9876i;

    public i(z0 z0Var, List list, List list2) {
        k kVar;
        this.f9870a = z0Var;
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
        this.f9872c = hashMap;
        HashMap hashMap2 = new HashMap();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ff.a aVar = (ff.a) it2.next();
            char e7 = aVar.e();
            char c10 = aVar.c();
            if (e7 == c10) {
                ff.a aVar2 = (ff.a) hashMap2.get(Character.valueOf(e7));
                if (aVar2 != null && aVar2.e() == aVar2.c()) {
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
                b(c10, aVar, hashMap2);
            }
        }
        this.d = hashMap2;
        Set<Character> keySet = this.f9872c.keySet();
        Set<Character> keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        for (Character ch3 : keySet2) {
            bitSet.set(ch3.charValue());
        }
        this.f9871b = bitSet;
    }

    public static void b(char c10, ff.a aVar, HashMap hashMap) {
        if (((ff.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    @Override
    public final void a(java.lang.String r12, cf.p r13) {
        throw new UnsupportedOperationException("Method not decompiled: fd.i.a(java.lang.String, cf.p):void");
    }

    public final String c(Pattern pattern) {
        if (this.f9875g >= this.f9874f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f9874f);
        matcher.region(this.f9875g, this.f9874f.length());
        if (!matcher.find()) {
            return null;
        }
        this.f9875g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.f9875g < this.f9874f.length()) {
            return this.f9874f.charAt(this.f9875g);
        }
        return (char) 0;
    }

    public final void e(ze.b bVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        ze.b bVar2 = this.h;
        while (bVar2 != null) {
            ze.b bVar3 = bVar2.f54605e;
            if (bVar3 == bVar) {
                break;
            }
            bVar2 = bVar3;
        }
        while (bVar2 != null) {
            s sVar = bVar2.f54602a;
            char c10 = bVar2.f54603b;
            ff.a aVar = (ff.a) this.d.get(Character.valueOf(c10));
            if (bVar2.d && aVar != null) {
                char e7 = aVar.e();
                ze.b bVar4 = bVar2.f54605e;
                int i10 = 0;
                boolean z11 = false;
                while (bVar4 != null && bVar4 != bVar && bVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (bVar4.f54604c && bVar4.f54603b == e7) {
                        i10 = aVar.a(bVar4, bVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    bVar4 = bVar4.f54605e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), bVar2.f54605e);
                        if (!bVar2.f54604c) {
                            f(bVar2);
                        }
                    }
                    bVar2 = bVar2.f54606f;
                } else {
                    s sVar2 = bVar4.f54602a;
                    bVar4.f54607g -= i10;
                    bVar2.f54607g -= i10;
                    sVar2.f4655g = e2.i(i10, 0, sVar2.f4655g);
                    sVar.f4655g = e2.i(i10, 0, sVar.f4655g);
                    ze.b bVar5 = bVar2.f54605e;
                    while (bVar5 != null && bVar5 != bVar4) {
                        ze.b bVar6 = bVar5.f54605e;
                        f(bVar5);
                        bVar5 = bVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f4653f) != sVar) {
                        c7.b(pVar, (p) sVar.f4652e);
                    }
                    aVar.b(sVar2, sVar, i10);
                    if (bVar4.f54607g == 0) {
                        bVar4.f54602a.g();
                        f(bVar4);
                    }
                    if (bVar2.f54607g == 0) {
                        ze.b bVar7 = bVar2.f54606f;
                        sVar.g();
                        f(bVar2);
                        bVar2 = bVar7;
                    }
                }
            } else {
                bVar2 = bVar2.f54606f;
            }
        }
        while (true) {
            ze.b bVar8 = this.h;
            if (bVar8 != null && bVar8 != bVar) {
                f(bVar8);
            } else {
                return;
            }
        }
    }

    public final void f(ze.b bVar) {
        ze.b bVar2 = bVar.f54605e;
        if (bVar2 != null) {
            bVar2.f54606f = bVar.f54606f;
        }
        ze.b bVar3 = bVar.f54606f;
        if (bVar3 == null) {
            this.h = bVar2;
        } else {
            bVar3.f54605e = bVar2;
        }
    }
}
