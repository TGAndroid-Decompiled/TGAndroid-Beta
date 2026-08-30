package ke;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ne.s;
public final class j implements oe.a {
    public static final Pattern f10371i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f10372j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f10373k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f10374l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f10375m = Pattern.compile("`+");
    public static final Pattern f10376n = Pattern.compile("^`+");
    public static final Pattern f10377o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f10378p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f10379q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f10380r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f10381s = Pattern.compile("\\s+");
    public static final Pattern f10382t = Pattern.compile(" *$");
    public final BitSet f10383a;
    public final BitSet f10384b;
    public final HashMap f10385c;
    public final f7.b d;
    public String e;
    public int f10386f;
    public c f10387g;
    public b h;

    public j(f7.b bVar) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new le.a(0), new le.a(1)), hashMap);
        c((List) bVar.f6012b, hashMap);
        this.f10385c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f10384b = bitSet;
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
        this.f10383a = bitSet2;
        this.d = bVar;
    }

    public static void b(char c3, qe.a aVar, HashMap hashMap) {
        if (((qe.a) hashMap.put(Character.valueOf(c3), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c3 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        p pVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            qe.a aVar = (qe.a) it.next();
            char e = aVar.e();
            char b10 = aVar.b();
            if (e == b10) {
                qe.a aVar2 = (qe.a) hashMap.get(Character.valueOf(e));
                if (aVar2 != null && aVar2.e() == aVar2.b()) {
                    if (aVar2 instanceof p) {
                        pVar = (p) aVar2;
                    } else {
                        p pVar2 = new p(e);
                        pVar2.f(aVar2);
                        pVar = pVar2;
                    }
                    pVar.f(aVar);
                    hashMap.put(Character.valueOf(e), pVar);
                } else {
                    b(e, aVar, hashMap);
                }
            } else {
                b(e, aVar, hashMap);
                b(b10, aVar, hashMap);
            }
        }
    }

    public static void e(s sVar, s sVar2, int i10) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb = new StringBuilder(i10);
            sb.append(sVar.f14959g);
            ne.p pVar = (ne.p) sVar2.f14957f;
            for (ne.p pVar2 = (ne.p) sVar.f14957f; pVar2 != pVar; pVar2 = (ne.p) pVar2.f14957f) {
                sb.append(((s) pVar2).f14959g);
                pVar2.g();
            }
            sVar.f14959g = sb.toString();
        }
    }

    public static void f(ne.p pVar, ne.p pVar2) {
        s sVar = null;
        s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof s) {
                sVar2 = (s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i10 = sVar2.f14959g.length() + i10;
            } else {
                e(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (ne.p) pVar.f14957f;
        }
        e(sVar, sVar2, i10);
    }

    @Override
    public final void a(java.lang.String r24, ne.p r25) {
        throw new UnsupportedOperationException("Method not decompiled: ke.j.a(java.lang.String, ne.p):void");
    }

    public final String d(Pattern pattern) {
        if (this.f10386f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f10386f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f10386f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f10386f < this.e.length()) {
            return this.e.charAt(this.f10386f);
        }
        return (char) 0;
    }

    public final void h(c cVar) {
        boolean z4;
        ne.p pVar;
        HashMap hashMap = new HashMap();
        c cVar2 = this.f10387g;
        while (cVar2 != null) {
            c cVar3 = cVar2.e;
            if (cVar3 == cVar) {
                break;
            }
            cVar2 = cVar3;
        }
        while (cVar2 != null) {
            s sVar = cVar2.f10338a;
            char c3 = cVar2.f10339b;
            qe.a aVar = (qe.a) this.f10385c.get(Character.valueOf(c3));
            if (cVar2.d && aVar != null) {
                char e = aVar.e();
                c cVar4 = cVar2.e;
                int i10 = 0;
                boolean z10 = false;
                while (cVar4 != null && cVar4 != cVar && cVar4 != hashMap.get(Character.valueOf(c3))) {
                    if (cVar4.f10340c && cVar4.f10339b == e) {
                        i10 = aVar.c(cVar4, cVar2);
                        z10 = true;
                        if (i10 > 0) {
                            z4 = true;
                            break;
                        }
                    }
                    cVar4 = cVar4.e;
                }
                z4 = z10;
                z10 = false;
                if (!z10) {
                    if (!z4) {
                        hashMap.put(Character.valueOf(c3), cVar2.e);
                        if (!cVar2.f10340c) {
                            i(cVar2);
                        }
                    }
                    cVar2 = cVar2.f10341f;
                } else {
                    s sVar2 = cVar4.f10338a;
                    cVar4.f10342g -= i10;
                    cVar2.f10342g -= i10;
                    sVar2.f14959g = e2.c.j(sVar2.f14959g, i10, 0);
                    sVar.f14959g = e2.c.j(sVar.f14959g, i10, 0);
                    c cVar5 = cVar2.e;
                    while (cVar5 != null && cVar5 != cVar4) {
                        c cVar6 = cVar5.e;
                        i(cVar5);
                        cVar5 = cVar6;
                    }
                    if (sVar2 != sVar && (pVar = (ne.p) sVar2.f14957f) != sVar) {
                        f(pVar, (ne.p) sVar.e);
                    }
                    aVar.a(sVar2, sVar, i10);
                    if (cVar4.f10342g == 0) {
                        cVar4.f10338a.g();
                        i(cVar4);
                    }
                    if (cVar2.f10342g == 0) {
                        c cVar7 = cVar2.f10341f;
                        sVar.g();
                        i(cVar2);
                        cVar2 = cVar7;
                    }
                }
            } else {
                cVar2 = cVar2.f10341f;
            }
        }
        while (true) {
            c cVar8 = this.f10387g;
            if (cVar8 != null && cVar8 != cVar) {
                i(cVar8);
            } else {
                return;
            }
        }
    }

    public final void i(c cVar) {
        c cVar2 = cVar.e;
        if (cVar2 != null) {
            cVar2.f10341f = cVar.f10341f;
        }
        c cVar3 = cVar.f10341f;
        if (cVar3 == null) {
            this.f10387g = cVar2;
        } else {
            cVar3.e = cVar2;
        }
    }
}
