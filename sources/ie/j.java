package ie;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import le.s;
public final class j implements me.a {
    public static final Pattern f8925i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f8926j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f8927k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f8928l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f8929m = Pattern.compile("`+");
    public static final Pattern f8930n = Pattern.compile("^`+");
    public static final Pattern f8931o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f8932p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f8933q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f8934r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f8935s = Pattern.compile("\\s+");
    public static final Pattern f8936t = Pattern.compile(" *$");
    public final BitSet f8937a;
    public final BitSet f8938b;
    public final HashMap f8939c;
    public final g9.l d;
    public String f8940e;
    public int f8941f;
    public c f8942g;
    public b h;

    public j(g9.l lVar) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new je.a(0), new je.a(1)), hashMap);
        c((List) lVar.f7168b, hashMap);
        this.f8939c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f8938b = bitSet;
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
        this.f8937a = bitSet2;
        this.d = lVar;
    }

    public static void b(char c3, oe.a aVar, HashMap hashMap) {
        if (((oe.a) hashMap.put(Character.valueOf(c3), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c3 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        p pVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            oe.a aVar = (oe.a) it.next();
            char e10 = aVar.e();
            char b10 = aVar.b();
            if (e10 == b10) {
                oe.a aVar2 = (oe.a) hashMap.get(Character.valueOf(e10));
                if (aVar2 != null && aVar2.e() == aVar2.b()) {
                    if (aVar2 instanceof p) {
                        pVar = (p) aVar2;
                    } else {
                        p pVar2 = new p(e10);
                        pVar2.f(aVar2);
                        pVar = pVar2;
                    }
                    pVar.f(aVar);
                    hashMap.put(Character.valueOf(e10), pVar);
                } else {
                    b(e10, aVar, hashMap);
                }
            } else {
                b(e10, aVar, hashMap);
                b(b10, aVar, hashMap);
            }
        }
    }

    public static void e(s sVar, s sVar2, int i10) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(sVar.f15210g);
            le.p pVar = (le.p) sVar2.f15208f;
            for (le.p pVar2 = (le.p) sVar.f15208f; pVar2 != pVar; pVar2 = (le.p) pVar2.f15208f) {
                sb2.append(((s) pVar2).f15210g);
                pVar2.g();
            }
            sVar.f15210g = sb2.toString();
        }
    }

    public static void f(le.p pVar, le.p pVar2) {
        s sVar = null;
        s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof s) {
                sVar2 = (s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i10 = sVar2.f15210g.length() + i10;
            } else {
                e(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (le.p) pVar.f15208f;
        }
        e(sVar, sVar2, i10);
    }

    @Override
    public final void a(java.lang.String r24, le.p r25) {
        throw new UnsupportedOperationException("Method not decompiled: ie.j.a(java.lang.String, le.p):void");
    }

    public final String d(Pattern pattern) {
        if (this.f8941f >= this.f8940e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f8940e);
        matcher.region(this.f8941f, this.f8940e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f8941f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f8941f < this.f8940e.length()) {
            return this.f8940e.charAt(this.f8941f);
        }
        return (char) 0;
    }

    public final void h(c cVar) {
        boolean z10;
        le.p pVar;
        HashMap hashMap = new HashMap();
        c cVar2 = this.f8942g;
        while (cVar2 != null) {
            c cVar3 = cVar2.f8892e;
            if (cVar3 == cVar) {
                break;
            }
            cVar2 = cVar3;
        }
        while (cVar2 != null) {
            s sVar = cVar2.f8889a;
            char c3 = cVar2.f8890b;
            oe.a aVar = (oe.a) this.f8939c.get(Character.valueOf(c3));
            if (cVar2.d && aVar != null) {
                char e10 = aVar.e();
                c cVar4 = cVar2.f8892e;
                int i10 = 0;
                boolean z11 = false;
                while (cVar4 != null && cVar4 != cVar && cVar4 != hashMap.get(Character.valueOf(c3))) {
                    if (cVar4.f8891c && cVar4.f8890b == e10) {
                        i10 = aVar.c(cVar4, cVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    cVar4 = cVar4.f8892e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c3), cVar2.f8892e);
                        if (!cVar2.f8891c) {
                            i(cVar2);
                        }
                    }
                    cVar2 = cVar2.f8893f;
                } else {
                    s sVar2 = cVar4.f8889a;
                    cVar4.f8894g -= i10;
                    cVar2.f8894g -= i10;
                    sVar2.f15210g = com.google.android.recaptcha.internal.a.m(sVar2.f15210g, i10, 0);
                    sVar.f15210g = com.google.android.recaptcha.internal.a.m(sVar.f15210g, i10, 0);
                    c cVar5 = cVar2.f8892e;
                    while (cVar5 != null && cVar5 != cVar4) {
                        c cVar6 = cVar5.f8892e;
                        i(cVar5);
                        cVar5 = cVar6;
                    }
                    if (sVar2 != sVar && (pVar = (le.p) sVar2.f15208f) != sVar) {
                        f(pVar, (le.p) sVar.f15207e);
                    }
                    aVar.a(sVar2, sVar, i10);
                    if (cVar4.f8894g == 0) {
                        cVar4.f8889a.g();
                        i(cVar4);
                    }
                    if (cVar2.f8894g == 0) {
                        c cVar7 = cVar2.f8893f;
                        sVar.g();
                        i(cVar2);
                        cVar2 = cVar7;
                    }
                }
            } else {
                cVar2 = cVar2.f8893f;
            }
        }
        while (true) {
            c cVar8 = this.f8942g;
            if (cVar8 != null && cVar8 != cVar) {
                i(cVar8);
            } else {
                return;
            }
        }
    }

    public final void i(c cVar) {
        c cVar2 = cVar.f8892e;
        if (cVar2 != null) {
            cVar2.f8893f = cVar.f8893f;
        }
        c cVar3 = cVar.f8893f;
        if (cVar3 == null) {
            this.f8942g = cVar2;
        } else {
            cVar3.f8892e = cVar2;
        }
    }
}
