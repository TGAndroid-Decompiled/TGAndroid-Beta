package df;

import gf.s;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class k implements hf.a {
    public static final Pattern f8885i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f8886j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f8887k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f8888l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f8889m = Pattern.compile("`+");
    public static final Pattern f8890n = Pattern.compile("^`+");
    public static final Pattern f8891o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f8892p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f8893q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f8894r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f8895s = Pattern.compile("\\s+");
    public static final Pattern f8896t = Pattern.compile(" *$");
    public final BitSet f8897a;
    public final BitSet f8898b;
    public final HashMap f8899c;
    public final p4.q d;
    public String f8900e;
    public int f8901f;
    public e f8902g;
    public d h;

    public k(p4.q qVar) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new ef.a(0), new ef.a(1)), hashMap);
        c((List) qVar.f53181a, hashMap);
        this.f8899c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f8898b = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.f8897a = bitSet2;
        this.d = qVar;
    }

    public static void b(char c2, kf.a aVar, HashMap hashMap) {
        if (((kf.a) hashMap.put(Character.valueOf(c2), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c2 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        q qVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            kf.a aVar = (kf.a) it.next();
            char e10 = aVar.e();
            char b10 = aVar.b();
            if (e10 == b10) {
                kf.a aVar2 = (kf.a) hashMap.get(Character.valueOf(e10));
                if (aVar2 != null && aVar2.e() == aVar2.b()) {
                    if (aVar2 instanceof q) {
                        qVar = (q) aVar2;
                    } else {
                        q qVar2 = new q(e10);
                        qVar2.f(aVar2);
                        qVar = qVar2;
                    }
                    qVar.f(aVar);
                    hashMap.put(Character.valueOf(e10), qVar);
                } else {
                    b(e10, aVar, hashMap);
                }
            } else {
                b(e10, aVar, hashMap);
                b(b10, aVar, hashMap);
            }
        }
    }

    public static void e(s sVar, s sVar2, int i3) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i3);
            sb2.append(sVar.f12271g);
            gf.p pVar = (gf.p) sVar2.f12269f;
            for (gf.p pVar2 = (gf.p) sVar.f12269f; pVar2 != pVar; pVar2 = (gf.p) pVar2.f12269f) {
                sb2.append(((s) pVar2).f12271g);
                pVar2.g();
            }
            sVar.f12271g = sb2.toString();
        }
    }

    public static void f(gf.p pVar, gf.p pVar2) {
        s sVar = null;
        s sVar2 = null;
        int i3 = 0;
        while (pVar != null) {
            if (pVar instanceof s) {
                sVar2 = (s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i3 = sVar2.f12271g.length() + i3;
            } else {
                e(sVar, sVar2, i3);
                sVar = null;
                sVar2 = null;
                i3 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (gf.p) pVar.f12269f;
        }
        e(sVar, sVar2, i3);
    }

    @Override
    public final void a(java.lang.String r24, gf.p r25) {
        throw new UnsupportedOperationException("Method not decompiled: df.k.a(java.lang.String, gf.p):void");
    }

    public final String d(Pattern pattern) {
        if (this.f8901f >= this.f8900e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f8900e);
        matcher.region(this.f8901f, this.f8900e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f8901f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f8901f < this.f8900e.length()) {
            return this.f8900e.charAt(this.f8901f);
        }
        return (char) 0;
    }

    public final void h(e eVar) {
        boolean z10;
        gf.p pVar;
        HashMap hashMap = new HashMap();
        e eVar2 = this.f8902g;
        while (eVar2 != null) {
            e eVar3 = eVar2.f8855e;
            if (eVar3 == eVar) {
                break;
            }
            eVar2 = eVar3;
        }
        while (eVar2 != null) {
            s sVar = eVar2.f8852a;
            char c2 = eVar2.f8853b;
            kf.a aVar = (kf.a) this.f8899c.get(Character.valueOf(c2));
            if (eVar2.d && aVar != null) {
                char e10 = aVar.e();
                e eVar4 = eVar2.f8855e;
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
                            i(eVar2);
                        }
                    }
                    eVar2 = eVar2.f8856f;
                } else {
                    s sVar2 = eVar4.f8852a;
                    eVar4.f8857g -= i3;
                    eVar2.f8857g -= i3;
                    sVar2.f12271g = com.google.android.recaptcha.internal.a.j(sVar2.f12271g, i3, 0);
                    sVar.f12271g = com.google.android.recaptcha.internal.a.j(sVar.f12271g, i3, 0);
                    e eVar5 = eVar2.f8855e;
                    while (eVar5 != null && eVar5 != eVar4) {
                        e eVar6 = eVar5.f8855e;
                        i(eVar5);
                        eVar5 = eVar6;
                    }
                    if (sVar2 != sVar && (pVar = (gf.p) sVar2.f12269f) != sVar) {
                        f(pVar, (gf.p) sVar.f12268e);
                    }
                    aVar.c(sVar2, sVar, i3);
                    if (eVar4.f8857g == 0) {
                        eVar4.f8852a.g();
                        i(eVar4);
                    }
                    if (eVar2.f8857g == 0) {
                        e eVar7 = eVar2.f8856f;
                        sVar.g();
                        i(eVar2);
                        eVar2 = eVar7;
                    }
                }
            } else {
                eVar2 = eVar2.f8856f;
            }
        }
        while (true) {
            e eVar8 = this.f8902g;
            if (eVar8 != null && eVar8 != eVar) {
                i(eVar8);
            } else {
                return;
            }
        }
    }

    public final void i(e eVar) {
        e eVar2 = eVar.f8855e;
        if (eVar2 != null) {
            eVar2.f8856f = eVar.f8856f;
        }
        e eVar3 = eVar.f8856f;
        if (eVar3 == null) {
            this.f8902g = eVar2;
        } else {
            eVar3.f8855e = eVar2;
        }
    }
}
