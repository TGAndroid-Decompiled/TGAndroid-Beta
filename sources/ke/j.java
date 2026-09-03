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
    public static final Pattern f10350i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f10351j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f10352k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f10353l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f10354m = Pattern.compile("`+");
    public static final Pattern f10355n = Pattern.compile("^`+");
    public static final Pattern f10356o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f10357p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f10358q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f10359r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f10360s = Pattern.compile("\\s+");
    public static final Pattern f10361t = Pattern.compile(" *$");
    public final BitSet f10362a;
    public final BitSet f10363b;
    public final HashMap f10364c;
    public final f7.b d;
    public String e;
    public int f10365f;
    public c f10366g;
    public b h;

    public j(f7.b bVar) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new le.a(0), new le.a(1)), hashMap);
        c((List) bVar.f6001b, hashMap);
        this.f10364c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f10363b = bitSet;
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
        this.f10362a = bitSet2;
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
            sb.append(sVar.f14944g);
            ne.p pVar = (ne.p) sVar2.f14942f;
            for (ne.p pVar2 = (ne.p) sVar.f14942f; pVar2 != pVar; pVar2 = (ne.p) pVar2.f14942f) {
                sb.append(((s) pVar2).f14944g);
                pVar2.g();
            }
            sVar.f14944g = sb.toString();
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
                i10 = sVar2.f14944g.length() + i10;
            } else {
                e(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (ne.p) pVar.f14942f;
        }
        e(sVar, sVar2, i10);
    }

    @Override
    public final void a(java.lang.String r24, ne.p r25) {
        throw new UnsupportedOperationException("Method not decompiled: ke.j.a(java.lang.String, ne.p):void");
    }

    public final String d(Pattern pattern) {
        if (this.f10365f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f10365f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f10365f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f10365f < this.e.length()) {
            return this.e.charAt(this.f10365f);
        }
        return (char) 0;
    }

    public final void h(c cVar) {
        boolean z4;
        ne.p pVar;
        HashMap hashMap = new HashMap();
        c cVar2 = this.f10366g;
        while (cVar2 != null) {
            c cVar3 = cVar2.e;
            if (cVar3 == cVar) {
                break;
            }
            cVar2 = cVar3;
        }
        while (cVar2 != null) {
            s sVar = cVar2.f10317a;
            char c3 = cVar2.f10318b;
            qe.a aVar = (qe.a) this.f10364c.get(Character.valueOf(c3));
            if (cVar2.d && aVar != null) {
                char e = aVar.e();
                c cVar4 = cVar2.e;
                int i10 = 0;
                boolean z10 = false;
                while (cVar4 != null && cVar4 != cVar && cVar4 != hashMap.get(Character.valueOf(c3))) {
                    if (cVar4.f10319c && cVar4.f10318b == e) {
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
                        if (!cVar2.f10319c) {
                            i(cVar2);
                        }
                    }
                    cVar2 = cVar2.f10320f;
                } else {
                    s sVar2 = cVar4.f10317a;
                    cVar4.f10321g -= i10;
                    cVar2.f10321g -= i10;
                    sVar2.f14944g = e2.c.j(sVar2.f14944g, i10, 0);
                    sVar.f14944g = e2.c.j(sVar.f14944g, i10, 0);
                    c cVar5 = cVar2.e;
                    while (cVar5 != null && cVar5 != cVar4) {
                        c cVar6 = cVar5.e;
                        i(cVar5);
                        cVar5 = cVar6;
                    }
                    if (sVar2 != sVar && (pVar = (ne.p) sVar2.f14942f) != sVar) {
                        f(pVar, (ne.p) sVar.e);
                    }
                    aVar.a(sVar2, sVar, i10);
                    if (cVar4.f10321g == 0) {
                        cVar4.f10317a.g();
                        i(cVar4);
                    }
                    if (cVar2.f10321g == 0) {
                        c cVar7 = cVar2.f10320f;
                        sVar.g();
                        i(cVar2);
                        cVar2 = cVar7;
                    }
                }
            } else {
                cVar2 = cVar2.f10320f;
            }
        }
        while (true) {
            c cVar8 = this.f10366g;
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
            cVar2.f10320f = cVar.f10320f;
        }
        c cVar3 = cVar.f10320f;
        if (cVar3 == null) {
            this.f10366g = cVar2;
        } else {
            cVar3.e = cVar2;
        }
    }
}
