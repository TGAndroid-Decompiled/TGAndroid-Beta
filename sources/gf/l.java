package gf;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kf.s;
public final class l implements lf.a {
    public static final Pattern f13915i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f13916j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f13917k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f13918l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f13919m = Pattern.compile("`+");
    public static final Pattern f13920n = Pattern.compile("^`+");
    public static final Pattern f13921o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f13922p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f13923q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f13924r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f13925s = Pattern.compile("\\s+");
    public static final Pattern f13926t = Pattern.compile(" *$");
    public final BitSet f13927a;
    public final BitSet f13928b;
    public final HashMap f13929c;
    public final wf.b d;
    public String f13930e;
    public int f13931f;
    public e f13932g;
    public d h;

    public l(wf.b bVar) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new hf.a(0), new hf.a(1)), hashMap);
        c((List) bVar.f57667b, hashMap);
        this.f13929c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f13928b = bitSet;
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
        this.f13927a = bitSet2;
        this.d = bVar;
    }

    public static void b(char c10, nf.a aVar, HashMap hashMap) {
        if (((nf.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        r rVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            nf.a aVar = (nf.a) it.next();
            char e10 = aVar.e();
            char b10 = aVar.b();
            if (e10 == b10) {
                nf.a aVar2 = (nf.a) hashMap.get(Character.valueOf(e10));
                if (aVar2 != null && aVar2.e() == aVar2.b()) {
                    if (aVar2 instanceof r) {
                        rVar = (r) aVar2;
                    } else {
                        r rVar2 = new r(e10);
                        rVar2.f(aVar2);
                        rVar = rVar2;
                    }
                    rVar.f(aVar);
                    hashMap.put(Character.valueOf(e10), rVar);
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
            sb2.append(sVar.f17286g);
            kf.p pVar = (kf.p) sVar2.f17284f;
            for (kf.p pVar2 = (kf.p) sVar.f17284f; pVar2 != pVar; pVar2 = (kf.p) pVar2.f17284f) {
                sb2.append(((s) pVar2).f17286g);
                pVar2.g();
            }
            sVar.f17286g = sb2.toString();
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
                i7 = sVar2.f17286g.length() + i7;
            } else {
                e(sVar, sVar2, i7);
                sVar = null;
                sVar2 = null;
                i7 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (kf.p) pVar.f17284f;
        }
        e(sVar, sVar2, i7);
    }

    @Override
    public final void a(java.lang.String r24, kf.p r25) {
        throw new UnsupportedOperationException("Method not decompiled: gf.l.a(java.lang.String, kf.p):void");
    }

    public final String d(Pattern pattern) {
        if (this.f13931f >= this.f13930e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f13930e);
        matcher.region(this.f13931f, this.f13930e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f13931f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f13931f < this.f13930e.length()) {
            return this.f13930e.charAt(this.f13931f);
        }
        return (char) 0;
    }

    public final void h(e eVar) {
        boolean z9;
        kf.p pVar;
        HashMap hashMap = new HashMap();
        e eVar2 = this.f13932g;
        while (eVar2 != null) {
            e eVar3 = eVar2.f13883e;
            if (eVar3 == eVar) {
                break;
            }
            eVar2 = eVar3;
        }
        while (eVar2 != null) {
            s sVar = eVar2.f13880a;
            char c10 = eVar2.f13881b;
            nf.a aVar = (nf.a) this.f13929c.get(Character.valueOf(c10));
            if (eVar2.d && aVar != null) {
                char e10 = aVar.e();
                e eVar4 = eVar2.f13883e;
                int i7 = 0;
                boolean z10 = false;
                while (eVar4 != null && eVar4 != eVar && eVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (eVar4.f13882c && eVar4.f13881b == e10) {
                        i7 = aVar.c(eVar4, eVar2);
                        z10 = true;
                        if (i7 > 0) {
                            z9 = true;
                            break;
                        }
                    }
                    eVar4 = eVar4.f13883e;
                }
                z9 = z10;
                z10 = false;
                if (!z10) {
                    if (!z9) {
                        hashMap.put(Character.valueOf(c10), eVar2.f13883e);
                        if (!eVar2.f13882c) {
                            i(eVar2);
                        }
                    }
                    eVar2 = eVar2.f13884f;
                } else {
                    s sVar2 = eVar4.f13880a;
                    eVar4.f13885g -= i7;
                    eVar2.f13885g -= i7;
                    sVar2.f17286g = com.google.android.recaptcha.internal.a.k(sVar2.f17286g, i7, 0);
                    sVar.f17286g = com.google.android.recaptcha.internal.a.k(sVar.f17286g, i7, 0);
                    e eVar5 = eVar2.f13883e;
                    while (eVar5 != null && eVar5 != eVar4) {
                        e eVar6 = eVar5.f13883e;
                        i(eVar5);
                        eVar5 = eVar6;
                    }
                    if (sVar2 != sVar && (pVar = (kf.p) sVar2.f17284f) != sVar) {
                        f(pVar, (kf.p) sVar.f17283e);
                    }
                    aVar.a(sVar2, sVar, i7);
                    if (eVar4.f13885g == 0) {
                        eVar4.f13880a.g();
                        i(eVar4);
                    }
                    if (eVar2.f13885g == 0) {
                        e eVar7 = eVar2.f13884f;
                        sVar.g();
                        i(eVar2);
                        eVar2 = eVar7;
                    }
                }
            } else {
                eVar2 = eVar2.f13884f;
            }
        }
        while (true) {
            e eVar8 = this.f13932g;
            if (eVar8 != null && eVar8 != eVar) {
                i(eVar8);
            } else {
                return;
            }
        }
    }

    public final void i(e eVar) {
        e eVar2 = eVar.f13883e;
        if (eVar2 != null) {
            eVar2.f13884f = eVar.f13884f;
        }
        e eVar3 = eVar.f13884f;
        if (eVar3 == null) {
            this.f13932g = eVar2;
        } else {
            eVar3.f13883e = eVar2;
        }
    }
}
