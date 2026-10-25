package bf;

import c3.h0;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n4.s;
public final class k implements ff.a {
    public static final Pattern f3942i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f3943j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f3944k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f3945l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f3946m = Pattern.compile("`+");
    public static final Pattern f3947n = Pattern.compile("^`+");
    public static final Pattern f3948o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f3949p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f3950q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f3951r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f3952s = Pattern.compile("\\s+");
    public static final Pattern f3953t = Pattern.compile(" *$");
    public final BitSet f3954a;
    public final BitSet f3955b;
    public final HashMap f3956c;
    public final s d;
    public String e;
    public int f3957f;
    public e f3958g;
    public d h;

    public k(s sVar) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new cf.a(0), new cf.a(1)), hashMap);
        c((List) sVar.f18696b, hashMap);
        this.f3956c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f3955b = bitSet;
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
        this.f3954a = bitSet2;
        this.d = sVar;
    }

    public static void b(char c10, hf.a aVar, HashMap hashMap) {
        if (((hf.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        q qVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            hf.a aVar = (hf.a) it.next();
            char e = aVar.e();
            char b10 = aVar.b();
            if (e == b10) {
                hf.a aVar2 = (hf.a) hashMap.get(Character.valueOf(e));
                if (aVar2 != null && aVar2.e() == aVar2.b()) {
                    if (aVar2 instanceof q) {
                        qVar = (q) aVar2;
                    } else {
                        q qVar2 = new q(e);
                        qVar2.f(aVar2);
                        qVar = qVar2;
                    }
                    qVar.f(aVar);
                    hashMap.put(Character.valueOf(e), qVar);
                } else {
                    b(e, aVar, hashMap);
                }
            } else {
                b(e, aVar, hashMap);
                b(b10, aVar, hashMap);
            }
        }
    }

    public static void e(ef.s sVar, ef.s sVar2, int i10) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(sVar.f9941g);
            ef.p pVar = (ef.p) sVar2.f9939f;
            for (ef.p pVar2 = (ef.p) sVar.f9939f; pVar2 != pVar; pVar2 = (ef.p) pVar2.f9939f) {
                sb2.append(((ef.s) pVar2).f9941g);
                pVar2.g();
            }
            sVar.f9941g = sb2.toString();
        }
    }

    public static void f(ef.p pVar, ef.p pVar2) {
        ef.s sVar = null;
        ef.s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof ef.s) {
                sVar2 = (ef.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i10 = sVar2.f9941g.length() + i10;
            } else {
                e(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (ef.p) pVar.f9939f;
        }
        e(sVar, sVar2, i10);
    }

    @Override
    public final void a(java.lang.String r24, ef.p r25) {
        throw new UnsupportedOperationException("Method not decompiled: bf.k.a(java.lang.String, ef.p):void");
    }

    public final String d(Pattern pattern) {
        if (this.f3957f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f3957f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f3957f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f3957f < this.e.length()) {
            return this.e.charAt(this.f3957f);
        }
        return (char) 0;
    }

    public final void h(e eVar) {
        boolean z10;
        ef.p pVar;
        HashMap hashMap = new HashMap();
        e eVar2 = this.f3958g;
        while (eVar2 != null) {
            e eVar3 = eVar2.e;
            if (eVar3 == eVar) {
                break;
            }
            eVar2 = eVar3;
        }
        while (eVar2 != null) {
            ef.s sVar = eVar2.f3912a;
            char c10 = eVar2.f3913b;
            hf.a aVar = (hf.a) this.f3956c.get(Character.valueOf(c10));
            if (eVar2.d && aVar != null) {
                char e = aVar.e();
                e eVar4 = eVar2.e;
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
                            i(eVar2);
                        }
                    }
                    eVar2 = eVar2.f3915f;
                } else {
                    ef.s sVar2 = eVar4.f3912a;
                    eVar4.f3916g -= i10;
                    eVar2.f3916g -= i10;
                    sVar2.f9941g = h0.l(i10, 0, sVar2.f9941g);
                    sVar.f9941g = h0.l(i10, 0, sVar.f9941g);
                    e eVar5 = eVar2.e;
                    while (eVar5 != null && eVar5 != eVar4) {
                        e eVar6 = eVar5.e;
                        i(eVar5);
                        eVar5 = eVar6;
                    }
                    if (sVar2 != sVar && (pVar = (ef.p) sVar2.f9939f) != sVar) {
                        f(pVar, (ef.p) sVar.e);
                    }
                    aVar.d(sVar2, sVar, i10);
                    if (eVar4.f3916g == 0) {
                        eVar4.f3912a.g();
                        i(eVar4);
                    }
                    if (eVar2.f3916g == 0) {
                        e eVar7 = eVar2.f3915f;
                        sVar.g();
                        i(eVar2);
                        eVar2 = eVar7;
                    }
                }
            } else {
                eVar2 = eVar2.f3915f;
            }
        }
        while (true) {
            e eVar8 = this.f3958g;
            if (eVar8 != null && eVar8 != eVar) {
                i(eVar8);
            } else {
                return;
            }
        }
    }

    public final void i(e eVar) {
        e eVar2 = eVar.e;
        if (eVar2 != null) {
            eVar2.f3915f = eVar.f3915f;
        }
        e eVar3 = eVar.f3915f;
        if (eVar3 == null) {
            this.f3958g = eVar2;
        } else {
            eVar3.e = eVar2;
        }
    }
}
