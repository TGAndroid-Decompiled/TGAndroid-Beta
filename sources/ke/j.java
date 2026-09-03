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
    public static final Pattern f11145i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f11146j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f11147k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f11148l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f11149m = Pattern.compile("`+");
    public static final Pattern f11150n = Pattern.compile("^`+");
    public static final Pattern f11151o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f11152p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f11153q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f11154r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f11155s = Pattern.compile("\\s+");
    public static final Pattern f11156t = Pattern.compile(" *$");
    public final BitSet f11157a;
    public final BitSet f11158b;
    public final HashMap f11159c;
    public final f7.b d;
    public String f11160e;
    public int f11161f;
    public c f11162g;
    public b h;

    public j(f7.b bVar) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new le.a(0), new le.a(1)), hashMap);
        c((List) bVar.f6120b, hashMap);
        this.f11159c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f11158b = bitSet;
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
        this.f11157a = bitSet2;
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
            char e6 = aVar.e();
            char b10 = aVar.b();
            if (e6 == b10) {
                qe.a aVar2 = (qe.a) hashMap.get(Character.valueOf(e6));
                if (aVar2 != null && aVar2.e() == aVar2.b()) {
                    if (aVar2 instanceof p) {
                        pVar = (p) aVar2;
                    } else {
                        p pVar2 = new p(e6);
                        pVar2.f(aVar2);
                        pVar = pVar2;
                    }
                    pVar.f(aVar);
                    hashMap.put(Character.valueOf(e6), pVar);
                } else {
                    b(e6, aVar, hashMap);
                }
            } else {
                b(e6, aVar, hashMap);
                b(b10, aVar, hashMap);
            }
        }
    }

    public static void e(s sVar, s sVar2, int i10) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb = new StringBuilder(i10);
            sb.append(sVar.f15981g);
            ne.p pVar = (ne.p) sVar2.f15979f;
            for (ne.p pVar2 = (ne.p) sVar.f15979f; pVar2 != pVar; pVar2 = (ne.p) pVar2.f15979f) {
                sb.append(((s) pVar2).f15981g);
                pVar2.g();
            }
            sVar.f15981g = sb.toString();
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
                i10 = sVar2.f15981g.length() + i10;
            } else {
                e(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (ne.p) pVar.f15979f;
        }
        e(sVar, sVar2, i10);
    }

    @Override
    public final void a(java.lang.String r24, ne.p r25) {
        throw new UnsupportedOperationException("Method not decompiled: ke.j.a(java.lang.String, ne.p):void");
    }

    public final String d(Pattern pattern) {
        if (this.f11161f >= this.f11160e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f11160e);
        matcher.region(this.f11161f, this.f11160e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f11161f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f11161f < this.f11160e.length()) {
            return this.f11160e.charAt(this.f11161f);
        }
        return (char) 0;
    }

    public final void h(c cVar) {
        boolean z4;
        ne.p pVar;
        HashMap hashMap = new HashMap();
        c cVar2 = this.f11162g;
        while (cVar2 != null) {
            c cVar3 = cVar2.f11112e;
            if (cVar3 == cVar) {
                break;
            }
            cVar2 = cVar3;
        }
        while (cVar2 != null) {
            s sVar = cVar2.f11109a;
            char c3 = cVar2.f11110b;
            qe.a aVar = (qe.a) this.f11159c.get(Character.valueOf(c3));
            if (cVar2.d && aVar != null) {
                char e6 = aVar.e();
                c cVar4 = cVar2.f11112e;
                int i10 = 0;
                boolean z10 = false;
                while (cVar4 != null && cVar4 != cVar && cVar4 != hashMap.get(Character.valueOf(c3))) {
                    if (cVar4.f11111c && cVar4.f11110b == e6) {
                        i10 = aVar.c(cVar4, cVar2);
                        z10 = true;
                        if (i10 > 0) {
                            z4 = true;
                            break;
                        }
                    }
                    cVar4 = cVar4.f11112e;
                }
                z4 = z10;
                z10 = false;
                if (!z10) {
                    if (!z4) {
                        hashMap.put(Character.valueOf(c3), cVar2.f11112e);
                        if (!cVar2.f11111c) {
                            i(cVar2);
                        }
                    }
                    cVar2 = cVar2.f11113f;
                } else {
                    s sVar2 = cVar4.f11109a;
                    cVar4.f11114g -= i10;
                    cVar2.f11114g -= i10;
                    sVar2.f15981g = e2.c.j(sVar2.f15981g, i10, 0);
                    sVar.f15981g = e2.c.j(sVar.f15981g, i10, 0);
                    c cVar5 = cVar2.f11112e;
                    while (cVar5 != null && cVar5 != cVar4) {
                        c cVar6 = cVar5.f11112e;
                        i(cVar5);
                        cVar5 = cVar6;
                    }
                    if (sVar2 != sVar && (pVar = (ne.p) sVar2.f15979f) != sVar) {
                        f(pVar, (ne.p) sVar.f15978e);
                    }
                    aVar.a(sVar2, sVar, i10);
                    if (cVar4.f11114g == 0) {
                        cVar4.f11109a.g();
                        i(cVar4);
                    }
                    if (cVar2.f11114g == 0) {
                        c cVar7 = cVar2.f11113f;
                        sVar.g();
                        i(cVar2);
                        cVar2 = cVar7;
                    }
                }
            } else {
                cVar2 = cVar2.f11113f;
            }
        }
        while (true) {
            c cVar8 = this.f11162g;
            if (cVar8 != null && cVar8 != cVar) {
                i(cVar8);
            } else {
                return;
            }
        }
    }

    public final void i(c cVar) {
        c cVar2 = cVar.f11112e;
        if (cVar2 != null) {
            cVar2.f11113f = cVar.f11113f;
        }
        c cVar3 = cVar.f11113f;
        if (cVar3 == null) {
            this.f11162g = cVar2;
        } else {
            cVar3.f11112e = cVar2;
        }
    }
}
