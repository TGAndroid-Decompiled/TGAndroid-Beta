package gf;

import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kf.s;
public final class k implements lf.a {
    public static final Pattern f13601i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f13602j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f13603k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f13604l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f13605m = Pattern.compile("`+");
    public static final Pattern f13606n = Pattern.compile("^`+");
    public static final Pattern f13607o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f13608p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f13609q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f13610r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f13611s = Pattern.compile("\\s+");
    public static final Pattern f13612t = Pattern.compile(" *$");
    public final BitSet f13613a;
    public final BitSet f13614b;
    public final HashMap f13615c;
    public final wf.b d;
    public String f13616e;
    public int f13617f;
    public e f13618g;
    public d h;

    public k(wf.b bVar) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new hf.a(0), new hf.a(1)), hashMap);
        c((List) bVar.f59715b, hashMap);
        this.f13615c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f13614b = bitSet;
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
        this.f13613a = bitSet2;
        this.d = bVar;
    }

    public static void b(char c10, nf.a aVar, HashMap hashMap) {
        if (((nf.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        q qVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            nf.a aVar = (nf.a) it.next();
            char e10 = aVar.e();
            char b10 = aVar.b();
            if (e10 == b10) {
                nf.a aVar2 = (nf.a) hashMap.get(Character.valueOf(e10));
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

    public static void e(s sVar, s sVar2, int i7) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i7);
            sb2.append(sVar.f18271g);
            kf.p pVar = (kf.p) sVar2.f18269f;
            for (kf.p pVar2 = (kf.p) sVar.f18269f; pVar2 != pVar; pVar2 = (kf.p) pVar2.f18269f) {
                sb2.append(((s) pVar2).f18271g);
                pVar2.g();
            }
            sVar.f18271g = sb2.toString();
        }
    }

    public static void f(kf.p pVar, kf.p pVar2) {
        s sVar = null;
        s sVar2 = null;
        int i7 = 0;
        while (pVar != null) {
            if (pVar instanceof s) {
                sVar2 = (s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i7 = sVar2.f18271g.length() + i7;
            } else {
                e(sVar, sVar2, i7);
                sVar = null;
                sVar2 = null;
                i7 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (kf.p) pVar.f18269f;
        }
        e(sVar, sVar2, i7);
    }

    @Override
    public final void a(java.lang.String r24, kf.p r25) {
        throw new UnsupportedOperationException("Method not decompiled: gf.k.a(java.lang.String, kf.p):void");
    }

    public final String d(Pattern pattern) {
        if (this.f13617f >= this.f13616e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f13616e);
        matcher.region(this.f13617f, this.f13616e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f13617f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f13617f < this.f13616e.length()) {
            return this.f13616e.charAt(this.f13617f);
        }
        return (char) 0;
    }

    public final void h(e eVar) {
        boolean z10;
        kf.p pVar;
        HashMap hashMap = new HashMap();
        e eVar2 = this.f13618g;
        while (eVar2 != null) {
            e eVar3 = eVar2.f13571e;
            if (eVar3 == eVar) {
                break;
            }
            eVar2 = eVar3;
        }
        while (eVar2 != null) {
            s sVar = eVar2.f13568a;
            char c10 = eVar2.f13569b;
            nf.a aVar = (nf.a) this.f13615c.get(Character.valueOf(c10));
            if (eVar2.d && aVar != null) {
                char e10 = aVar.e();
                e eVar4 = eVar2.f13571e;
                int i7 = 0;
                boolean z11 = false;
                while (eVar4 != null && eVar4 != eVar && eVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (eVar4.f13570c && eVar4.f13569b == e10) {
                        i7 = aVar.c(eVar4, eVar2);
                        z11 = true;
                        if (i7 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    eVar4 = eVar4.f13571e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), eVar2.f13571e);
                        if (!eVar2.f13570c) {
                            i(eVar2);
                        }
                    }
                    eVar2 = eVar2.f13572f;
                } else {
                    s sVar2 = eVar4.f13568a;
                    eVar4.f13573g -= i7;
                    eVar2.f13573g -= i7;
                    sVar2.f18271g = e2.k(sVar2.f18271g, i7, 0);
                    sVar.f18271g = e2.k(sVar.f18271g, i7, 0);
                    e eVar5 = eVar2.f13571e;
                    while (eVar5 != null && eVar5 != eVar4) {
                        e eVar6 = eVar5.f13571e;
                        i(eVar5);
                        eVar5 = eVar6;
                    }
                    if (sVar2 != sVar && (pVar = (kf.p) sVar2.f18269f) != sVar) {
                        f(pVar, (kf.p) sVar.f18268e);
                    }
                    aVar.a(sVar2, sVar, i7);
                    if (eVar4.f13573g == 0) {
                        eVar4.f13568a.g();
                        i(eVar4);
                    }
                    if (eVar2.f13573g == 0) {
                        e eVar7 = eVar2.f13572f;
                        sVar.g();
                        i(eVar2);
                        eVar2 = eVar7;
                    }
                }
            } else {
                eVar2 = eVar2.f13572f;
            }
        }
        while (true) {
            e eVar8 = this.f13618g;
            if (eVar8 != null && eVar8 != eVar) {
                i(eVar8);
            } else {
                return;
            }
        }
    }

    public final void i(e eVar) {
        e eVar2 = eVar.f13571e;
        if (eVar2 != null) {
            eVar2.f13572f = eVar.f13572f;
        }
        e eVar3 = eVar.f13572f;
        if (eVar3 == null) {
            this.f13618g = eVar2;
        } else {
            eVar3.f13571e = eVar2;
        }
    }
}
