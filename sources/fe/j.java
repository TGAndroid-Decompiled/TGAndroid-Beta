package fe;

import ie.s;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class j implements je.a {
    public static final Pattern f6088i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f6089j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f6090k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f6091l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f6092m = Pattern.compile("`+");
    public static final Pattern f6093n = Pattern.compile("^`+");
    public static final Pattern f6094o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f6095p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f6096q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f6097r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f6098s = Pattern.compile("\\s+");
    public static final Pattern f6099t = Pattern.compile(" *$");
    public final BitSet f6100a;
    public final BitSet f6101b;
    public final HashMap f6102c;
    public final we.b d;
    public String f6103e;
    public int f6104f;
    public c f6105g;
    public b h;

    public j(we.b bVar) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new ge.a(0), new ge.a(1)), hashMap);
        c((List) bVar.f48793b, hashMap);
        this.f6102c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f6101b = bitSet;
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
        this.f6100a = bitSet2;
        this.d = bVar;
    }

    public static void b(char c10, le.a aVar, HashMap hashMap) {
        if (((le.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        p pVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            le.a aVar = (le.a) it.next();
            char e10 = aVar.e();
            char c10 = aVar.c();
            if (e10 == c10) {
                le.a aVar2 = (le.a) hashMap.get(Character.valueOf(e10));
                if (aVar2 != null && aVar2.e() == aVar2.c()) {
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
                b(c10, aVar, hashMap);
            }
        }
    }

    public static void e(s sVar, s sVar2, int i9) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i9);
            sb2.append(sVar.f11127g);
            ie.p pVar = (ie.p) sVar2.f11125f;
            for (ie.p pVar2 = (ie.p) sVar.f11125f; pVar2 != pVar; pVar2 = (ie.p) pVar2.f11125f) {
                sb2.append(((s) pVar2).f11127g);
                pVar2.g();
            }
            sVar.f11127g = sb2.toString();
        }
    }

    public static void f(ie.p pVar, ie.p pVar2) {
        s sVar = null;
        s sVar2 = null;
        int i9 = 0;
        while (pVar != null) {
            if (pVar instanceof s) {
                sVar2 = (s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i9 = sVar2.f11127g.length() + i9;
            } else {
                e(sVar, sVar2, i9);
                sVar = null;
                sVar2 = null;
                i9 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (ie.p) pVar.f11125f;
        }
        e(sVar, sVar2, i9);
    }

    @Override
    public final void a(java.lang.String r24, ie.p r25) {
        throw new UnsupportedOperationException("Method not decompiled: fe.j.a(java.lang.String, ie.p):void");
    }

    public final String d(Pattern pattern) {
        if (this.f6104f >= this.f6103e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f6103e);
        matcher.region(this.f6104f, this.f6103e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f6104f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f6104f < this.f6103e.length()) {
            return this.f6103e.charAt(this.f6104f);
        }
        return (char) 0;
    }

    public final void h(c cVar) {
        boolean z10;
        ie.p pVar;
        HashMap hashMap = new HashMap();
        c cVar2 = this.f6105g;
        while (cVar2 != null) {
            c cVar3 = cVar2.f6055e;
            if (cVar3 == cVar) {
                break;
            }
            cVar2 = cVar3;
        }
        while (cVar2 != null) {
            s sVar = cVar2.f6052a;
            char c10 = cVar2.f6053b;
            le.a aVar = (le.a) this.f6102c.get(Character.valueOf(c10));
            if (cVar2.d && aVar != null) {
                char e10 = aVar.e();
                c cVar4 = cVar2.f6055e;
                int i9 = 0;
                boolean z11 = false;
                while (cVar4 != null && cVar4 != cVar && cVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (cVar4.f6054c && cVar4.f6053b == e10) {
                        i9 = aVar.a(cVar4, cVar2);
                        z11 = true;
                        if (i9 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    cVar4 = cVar4.f6055e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), cVar2.f6055e);
                        if (!cVar2.f6054c) {
                            i(cVar2);
                        }
                    }
                    cVar2 = cVar2.f6056f;
                } else {
                    s sVar2 = cVar4.f6052a;
                    cVar4.f6057g -= i9;
                    cVar2.f6057g -= i9;
                    sVar2.f11127g = e2.c.m(sVar2.f11127g, i9, 0);
                    sVar.f11127g = e2.c.m(sVar.f11127g, i9, 0);
                    c cVar5 = cVar2.f6055e;
                    while (cVar5 != null && cVar5 != cVar4) {
                        c cVar6 = cVar5.f6055e;
                        i(cVar5);
                        cVar5 = cVar6;
                    }
                    if (sVar2 != sVar && (pVar = (ie.p) sVar2.f11125f) != sVar) {
                        f(pVar, (ie.p) sVar.f11124e);
                    }
                    aVar.b(sVar2, sVar, i9);
                    if (cVar4.f6057g == 0) {
                        cVar4.f6052a.g();
                        i(cVar4);
                    }
                    if (cVar2.f6057g == 0) {
                        c cVar7 = cVar2.f6056f;
                        sVar.g();
                        i(cVar2);
                        cVar2 = cVar7;
                    }
                }
            } else {
                cVar2 = cVar2.f6056f;
            }
        }
        while (true) {
            c cVar8 = this.f6105g;
            if (cVar8 != null && cVar8 != cVar) {
                i(cVar8);
            } else {
                return;
            }
        }
    }

    public final void i(c cVar) {
        c cVar2 = cVar.f6055e;
        if (cVar2 != null) {
            cVar2.f6056f = cVar.f6056f;
        }
        c cVar3 = cVar.f6056f;
        if (cVar3 == null) {
            this.f6105g = cVar2;
        } else {
            cVar3.f6055e = cVar2;
        }
    }
}
