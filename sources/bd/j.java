package bd;

import b8.s1;
import gf.p;
import gf.s;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4.q;
public final class j implements hf.a {
    public static final Pattern f3235j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f3236k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f3237l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f3238m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f3239n = Pattern.compile("\\s+");
    public final q f3240a;
    public final BitSet f3241b;
    public final HashMap f3242c;
    public final HashMap d;
    public p f3243e;
    public String f3244f;
    public int f3245g;
    public df.e h;
    public df.d f3246i;

    public j(q qVar, List list, List list2) {
        l lVar;
        this.f3240a = qVar;
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
        this.f3242c = hashMap;
        HashMap hashMap2 = new HashMap();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            kf.a aVar = (kf.a) it2.next();
            char e10 = aVar.e();
            char b10 = aVar.b();
            if (e10 == b10) {
                kf.a aVar2 = (kf.a) hashMap2.get(Character.valueOf(e10));
                if (aVar2 != null && aVar2.e() == aVar2.b()) {
                    if (aVar2 instanceof l) {
                        lVar = (l) aVar2;
                    } else {
                        l lVar2 = new l(e10);
                        lVar2.f(aVar2);
                        lVar = lVar2;
                    }
                    lVar.f(aVar);
                    hashMap2.put(Character.valueOf(e10), lVar);
                } else {
                    b(e10, aVar, hashMap2);
                }
            } else {
                b(e10, aVar, hashMap2);
                b(b10, aVar, hashMap2);
            }
        }
        this.d = hashMap2;
        Set<Character> keySet = this.f3242c.keySet();
        Set<Character> keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        for (Character ch3 : keySet2) {
            bitSet.set(ch3.charValue());
        }
        this.f3241b = bitSet;
    }

    public static void b(char c2, kf.a aVar, HashMap hashMap) {
        if (((kf.a) hashMap.put(Character.valueOf(c2), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c2 + "'");
    }

    @Override
    public final void a(java.lang.String r12, gf.p r13) {
        throw new UnsupportedOperationException("Method not decompiled: bd.j.a(java.lang.String, gf.p):void");
    }

    public final String c(Pattern pattern) {
        if (this.f3245g >= this.f3244f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f3244f);
        matcher.region(this.f3245g, this.f3244f.length());
        if (!matcher.find()) {
            return null;
        }
        this.f3245g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.f3245g < this.f3244f.length()) {
            return this.f3244f.charAt(this.f3245g);
        }
        return (char) 0;
    }

    public final void e(df.e eVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        df.e eVar2 = this.h;
        while (eVar2 != null) {
            df.e eVar3 = eVar2.f8855e;
            if (eVar3 == eVar) {
                break;
            }
            eVar2 = eVar3;
        }
        while (eVar2 != null) {
            s sVar = eVar2.f8852a;
            char c2 = eVar2.f8853b;
            kf.a aVar = (kf.a) this.d.get(Character.valueOf(c2));
            if (eVar2.d && aVar != null) {
                char e10 = aVar.e();
                df.e eVar4 = eVar2.f8855e;
                int i3 = 0;
                boolean z11 = false;
                while (eVar4 != null && eVar4 != eVar && eVar4 != hashMap.get(Character.valueOf(c2))) {
                    if (eVar4.f8854c && eVar4.f8853b == e10) {
                        i3 = aVar.a(eVar4, eVar2);
                        z11 = true;
                        if (i3 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    eVar4 = eVar4.f8855e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c2), eVar2.f8855e);
                        if (!eVar2.f8854c) {
                            f(eVar2);
                        }
                    }
                    eVar2 = eVar2.f8856f;
                } else {
                    s sVar2 = eVar4.f8852a;
                    eVar4.f8857g -= i3;
                    eVar2.f8857g -= i3;
                    sVar2.f12271g = com.google.android.recaptcha.internal.a.j(sVar2.f12271g, i3, 0);
                    sVar.f12271g = com.google.android.recaptcha.internal.a.j(sVar.f12271g, i3, 0);
                    df.e eVar5 = eVar2.f8855e;
                    while (eVar5 != null && eVar5 != eVar4) {
                        df.e eVar6 = eVar5.f8855e;
                        f(eVar5);
                        eVar5 = eVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f12269f) != sVar) {
                        s1.b(pVar, (p) sVar.f12268e);
                    }
                    aVar.c(sVar2, sVar, i3);
                    if (eVar4.f8857g == 0) {
                        eVar4.f8852a.g();
                        f(eVar4);
                    }
                    if (eVar2.f8857g == 0) {
                        df.e eVar7 = eVar2.f8856f;
                        sVar.g();
                        f(eVar2);
                        eVar2 = eVar7;
                    }
                }
            } else {
                eVar2 = eVar2.f8856f;
            }
        }
        while (true) {
            df.e eVar8 = this.h;
            if (eVar8 != null && eVar8 != eVar) {
                f(eVar8);
            } else {
                return;
            }
        }
    }

    public final void f(df.e eVar) {
        df.e eVar2 = eVar.f8855e;
        if (eVar2 != null) {
            eVar2.f8856f = eVar.f8856f;
        }
        df.e eVar3 = eVar.f8856f;
        if (eVar3 == null) {
            this.h = eVar2;
        } else {
            eVar3.f8855e = eVar2;
        }
    }
}
