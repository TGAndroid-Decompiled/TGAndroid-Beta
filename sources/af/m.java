package af;

import com.google.android.gms.internal.cast.a6;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class m implements ef.a {
    public static final Pattern f595i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f596j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f597k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f598l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f599m = Pattern.compile("`+");
    public static final Pattern f600n = Pattern.compile("^`+");
    public static final Pattern f601o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f602p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f603q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f604r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f605s = Pattern.compile("\\s+");
    public static final Pattern f606t = Pattern.compile(" *$");
    public final BitSet f607a;
    public final BitSet f608b;
    public final HashMap f609c;
    public final qf.b d;
    public String e;
    public int f610f;
    public f f611g;
    public e h;

    public m(qf.b bVar) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new bf.a(0), new bf.a(1)), hashMap);
        c((List) bVar.f44465b, hashMap);
        this.f609c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f608b = bitSet;
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
        this.f607a = bitSet2;
        this.d = bVar;
    }

    public static void b(char c10, gf.a aVar, HashMap hashMap) {
        if (((gf.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        s sVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            gf.a aVar = (gf.a) it.next();
            char e = aVar.e();
            char a2 = aVar.a();
            if (e == a2) {
                gf.a aVar2 = (gf.a) hashMap.get(Character.valueOf(e));
                if (aVar2 != null && aVar2.e() == aVar2.a()) {
                    if (aVar2 instanceof s) {
                        sVar = (s) aVar2;
                    } else {
                        s sVar2 = new s(e);
                        sVar2.f(aVar2);
                        sVar = sVar2;
                    }
                    sVar.f(aVar);
                    hashMap.put(Character.valueOf(e), sVar);
                } else {
                    b(e, aVar, hashMap);
                }
            } else {
                b(e, aVar, hashMap);
                b(a2, aVar, hashMap);
            }
        }
    }

    public static void e(df.s sVar, df.s sVar2, int i10) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(sVar.f7990g);
            df.p pVar = (df.p) sVar2.f7988f;
            for (df.p pVar2 = (df.p) sVar.f7988f; pVar2 != pVar; pVar2 = (df.p) pVar2.f7988f) {
                sb2.append(((df.s) pVar2).f7990g);
                pVar2.g();
            }
            sVar.f7990g = sb2.toString();
        }
    }

    public static void f(df.p pVar, df.p pVar2) {
        df.s sVar = null;
        df.s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof df.s) {
                sVar2 = (df.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i10 = sVar2.f7990g.length() + i10;
            } else {
                e(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (df.p) pVar.f7988f;
        }
        e(sVar, sVar2, i10);
    }

    @Override
    public final void a(java.lang.String r24, df.p r25) {
        throw new UnsupportedOperationException("Method not decompiled: af.m.a(java.lang.String, df.p):void");
    }

    public final String d(Pattern pattern) {
        if (this.f610f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f610f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f610f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f610f < this.e.length()) {
            return this.e.charAt(this.f610f);
        }
        return (char) 0;
    }

    public final void h(f fVar) {
        boolean z10;
        df.p pVar;
        HashMap hashMap = new HashMap();
        f fVar2 = this.f611g;
        while (fVar2 != null) {
            f fVar3 = fVar2.e;
            if (fVar3 == fVar) {
                break;
            }
            fVar2 = fVar3;
        }
        while (fVar2 != null) {
            df.s sVar = fVar2.f562a;
            char c10 = fVar2.f563b;
            gf.a aVar = (gf.a) this.f609c.get(Character.valueOf(c10));
            if (fVar2.d && aVar != null) {
                char e = aVar.e();
                f fVar4 = fVar2.e;
                int i10 = 0;
                boolean z11 = false;
                while (fVar4 != null && fVar4 != fVar && fVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (fVar4.f564c && fVar4.f563b == e) {
                        i10 = aVar.d(fVar4, fVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    fVar4 = fVar4.e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), fVar2.e);
                        if (!fVar2.f564c) {
                            i(fVar2);
                        }
                    }
                    fVar2 = fVar2.f565f;
                } else {
                    df.s sVar2 = fVar4.f562a;
                    fVar4.f566g -= i10;
                    fVar2.f566g -= i10;
                    sVar2.f7990g = a6.j(i10, 0, sVar2.f7990g);
                    sVar.f7990g = a6.j(i10, 0, sVar.f7990g);
                    f fVar5 = fVar2.e;
                    while (fVar5 != null && fVar5 != fVar4) {
                        f fVar6 = fVar5.e;
                        i(fVar5);
                        fVar5 = fVar6;
                    }
                    if (sVar2 != sVar && (pVar = (df.p) sVar2.f7988f) != sVar) {
                        f(pVar, (df.p) sVar.e);
                    }
                    aVar.b(sVar2, sVar, i10);
                    if (fVar4.f566g == 0) {
                        fVar4.f562a.g();
                        i(fVar4);
                    }
                    if (fVar2.f566g == 0) {
                        f fVar7 = fVar2.f565f;
                        sVar.g();
                        i(fVar2);
                        fVar2 = fVar7;
                    }
                }
            } else {
                fVar2 = fVar2.f565f;
            }
        }
        while (true) {
            f fVar8 = this.f611g;
            if (fVar8 != null && fVar8 != fVar) {
                i(fVar8);
            } else {
                return;
            }
        }
    }

    public final void i(f fVar) {
        f fVar2 = fVar.e;
        if (fVar2 != null) {
            fVar2.f565f = fVar.f565f;
        }
        f fVar3 = fVar.f565f;
        if (fVar3 == null) {
            this.f611g = fVar2;
        } else {
            fVar3.e = fVar2;
        }
    }
}
