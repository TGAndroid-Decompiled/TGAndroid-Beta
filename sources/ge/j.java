package ge;

import g7.i8;
import g7.j8;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.s;

public final class j implements ke.a {

    public static final Pattern f6888i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    public static final Pattern f6889j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    public static final Pattern f6890k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    public static final Pattern f6891l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    public static final Pattern f6892m = Pattern.compile("`+");

    public static final Pattern f6893n = Pattern.compile("^`+");

    public static final Pattern f6894o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    public static final Pattern f6895p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    public static final Pattern f6896q = Pattern.compile("^ *(?:\n *)?");

    public static final Pattern f6897r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    public static final Pattern f6898s = Pattern.compile("\\s+");

    public static final Pattern f6899t = Pattern.compile(" *$");

    public final BitSet f6900a;

    public final BitSet f6901b;

    public final HashMap f6902c;
    public final g5.b d;

    public String f6903e;

    public int f6904f;

    public c f6905g;
    public b h;

    public j(g5.b bVar) {
        List list = (List) bVar.f6389b;
        HashMap map = new HashMap();
        c(Arrays.asList(new he.a(0), new he.a(1)), map);
        c(list, map);
        this.f6902c = map;
        Set setKeySet = map.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.f6901b = bitSet;
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
        this.f6900a = bitSet2;
        this.d = bVar;
    }

    public static void b(char c10, me.a aVar, HashMap map) {
        if (((me.a) map.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void c(Iterable iterable, HashMap map) {
        p pVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            me.a aVar = (me.a) it.next();
            char cE = aVar.e();
            char cA = aVar.a();
            if (cE == cA) {
                me.a aVar2 = (me.a) map.get(Character.valueOf(cE));
                if (aVar2 == null || aVar2.e() != aVar2.a()) {
                    b(cE, aVar, map);
                } else {
                    if (aVar2 instanceof p) {
                        pVar = (p) aVar2;
                    } else {
                        p pVar2 = new p(cE);
                        pVar2.f(aVar2);
                        pVar = pVar2;
                    }
                    pVar.f(aVar);
                    map.put(Character.valueOf(cE), pVar);
                }
            } else {
                b(cE, aVar, map);
                b(cA, aVar, map);
            }
        }
    }

    public static void e(s sVar, s sVar2, int i10) {
        if (sVar == null || sVar2 == null || sVar == sVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(sVar.f12929g);
        je.p pVar = (je.p) sVar.f12927f;
        je.p pVar2 = (je.p) sVar2.f12927f;
        while (pVar != pVar2) {
            sb2.append(((s) pVar).f12929g);
            je.p pVar3 = (je.p) pVar.f12927f;
            pVar.g();
            pVar = pVar3;
        }
        sVar.f12929g = sb2.toString();
    }

    public static void f(je.p pVar, je.p pVar2) {
        s sVar = null;
        s sVar2 = null;
        int length = 0;
        while (pVar != null) {
            if (pVar instanceof s) {
                sVar2 = (s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                length = sVar2.f12929g.length() + length;
            } else {
                e(sVar, sVar2, length);
                sVar = null;
                sVar2 = null;
                length = 0;
            }
            if (pVar == pVar2) {
                break;
            } else {
                pVar = (je.p) pVar.f12927f;
            }
        }
        e(sVar, sVar2, length);
    }

    @Override
    public final void a(String str, je.p pVar) {
        je.g gVar;
        ?? r10;
        s sVar;
        ?? r11;
        Object sVar2;
        ?? sVar3;
        int i10;
        je.k kVar;
        String strD;
        Object sVar4;
        String strA;
        boolean z10;
        String strA2;
        boolean z11;
        boolean z12;
        ?? iVar;
        this.f6903e = str.trim();
        this.f6904f = 0;
        ?? sVar5 = 0;
        this.f6905g = null;
        this.h = null;
        ?? r12 = 0;
        while (true) {
            char cG = g();
            if (cG == 0) {
                r11 = sVar5;
            } else {
                if (cG != '\n') {
                    if (cG == '!') {
                        int i11 = this.f6904f + 1;
                        this.f6904f = i11;
                        if (g() == '[') {
                            this.f6904f++;
                            s sVar6 = new s("![");
                            b bVar = this.h;
                            b bVar2 = new b(sVar6, i11, bVar, this.f6905g, true);
                            if (bVar != null) {
                                bVar.d = true;
                            }
                            this.h = bVar2;
                            sVar3 = sVar6;
                        } else {
                            sVar2 = new s("!");
                            sVar3 = sVar2;
                        }
                    } else if (cG == '&') {
                        String strD2 = d(f6891l);
                        if (strD2 != null) {
                            sVar5 = new s(ie.b.a(strD2));
                            sVar3 = sVar5;
                        } else {
                            sVar3 = 0;
                        }
                    } else if (cG == '<') {
                        String strD3 = d(f6894o);
                        if (strD3 != null) {
                            i10 = 1;
                            String strN = com.google.android.recaptcha.internal.a.n(strD3, 1, 1);
                            kVar = new je.k(1, s3.c.e("mailto:", strN), null);
                            kVar.b(new s(strN));
                        } else {
                            i10 = 1;
                            String strD4 = d(f6895p);
                            if (strD4 != null) {
                                String strN2 = com.google.android.recaptcha.internal.a.n(strD4, 1, 1);
                                kVar = new je.k(1, strN2, null);
                                kVar.b(new s(strN2));
                            } else {
                                sVar3 = 0;
                            }
                            if (sVar3 == 0) {
                                strD = d(f6889j);
                                if (strD != null) {
                                    sVar5 = new je.d(i10);
                                    sVar5.h = strD;
                                    sVar3 = sVar5;
                                } else {
                                    sVar3 = 0;
                                }
                            }
                        }
                        sVar3 = kVar;
                        if (sVar3 == 0) {
                            strD = d(f6889j);
                            if (strD != null) {
                                sVar5 = new je.d(i10);
                                sVar5.h = strD;
                                sVar3 = sVar5;
                            } else {
                                sVar3 = 0;
                            }
                        }
                    } else if (cG != '`') {
                        switch (cG) {
                            case '[':
                                int i12 = this.f6904f;
                                this.f6904f = i12 + 1;
                                s sVar7 = new s("[");
                                b bVar3 = this.h;
                                b bVar4 = new b(sVar7, i12, bVar3, this.f6905g, false);
                                if (bVar3 != null) {
                                    bVar3.d = true;
                                }
                                this.h = bVar4;
                                sVar3 = sVar7;
                                break;
                            case '\\':
                                this.f6904f++;
                                if (g() == '\n') {
                                    sVar2 = new je.g(1);
                                    this.f6904f++;
                                } else {
                                    if (this.f6904f < this.f6903e.length()) {
                                        String str2 = this.f6903e;
                                        int i13 = this.f6904f;
                                        if (f6890k.matcher(str2.substring(i13, i13 + 1)).matches()) {
                                            String str3 = this.f6903e;
                                            int i14 = this.f6904f;
                                            s sVar8 = new s(str3.substring(i14, i14 + 1));
                                            this.f6904f++;
                                            sVar3 = sVar8;
                                        }
                                    }
                                    sVar2 = new s("\\");
                                }
                                sVar3 = sVar2;
                                break;
                            case ']':
                                int i15 = this.f6904f + 1;
                                this.f6904f = i15;
                                b bVar5 = this.h;
                                if (bVar5 != null) {
                                    s sVar9 = (s) bVar5.f6849e;
                                    boolean z13 = bVar5.f6846a;
                                    if (bVar5.f6848c) {
                                        if (g() == '(') {
                                            this.f6904f++;
                                            Pattern pattern = f6896q;
                                            d(pattern);
                                            int iA = i8.a(this.f6904f, this.f6903e);
                                            if (iA == -1) {
                                                strA2 = null;
                                            } else {
                                                String strSubstring = g() == '<' ? this.f6903e.substring(this.f6904f + 1, iA - 1) : this.f6903e.substring(this.f6904f, iA);
                                                this.f6904f = iA;
                                                strA2 = ie.a.a(strSubstring);
                                            }
                                            if (strA2 != null) {
                                                d(pattern);
                                                String str4 = this.f6903e;
                                                int i16 = this.f6904f;
                                                if (f6898s.matcher(str4.substring(i16 - 1, i16)).matches()) {
                                                    int iC = i8.c(this.f6904f, this.f6903e);
                                                    if (iC == -1) {
                                                        strA = null;
                                                    } else {
                                                        String strSubstring2 = this.f6903e.substring(this.f6904f + 1, iC - 1);
                                                        this.f6904f = iC;
                                                        strA = ie.a.a(strSubstring2);
                                                    }
                                                    d(pattern);
                                                } else {
                                                    strA = null;
                                                }
                                                if (g() == ')') {
                                                    this.f6904f++;
                                                    z10 = true;
                                                } else {
                                                    this.f6904f = i15;
                                                }
                                            } else {
                                                strA = null;
                                            }
                                            z10 = false;
                                        } else {
                                            strA = null;
                                            z10 = false;
                                            strA2 = null;
                                        }
                                        if (!z10) {
                                            int i17 = this.f6904f;
                                            if (i17 < this.f6903e.length() && this.f6903e.charAt(this.f6904f) == '[') {
                                                int i18 = this.f6904f + 1;
                                                int iB = i8.b(i18, this.f6903e);
                                                int i19 = iB - i18;
                                                if (iB != -1 && i19 <= 999 && iB < this.f6903e.length() && this.f6903e.charAt(iB) == ']') {
                                                    this.f6904f = iB + 1;
                                                }
                                            }
                                            int i20 = this.f6904f - i17;
                                            String strSubstring3 = i20 > 2 ? this.f6903e.substring(i17, i20 + i17) : !bVar5.d ? this.f6903e.substring(bVar5.f6847b, i15) : null;
                                            if (strSubstring3 != null) {
                                                Pattern pattern2 = ie.a.f11220a;
                                                je.m mVar = (je.m) ((Map) this.d.f6390c).get(ie.a.f11222c.matcher(strSubstring3.substring(1, strSubstring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                if (mVar != null) {
                                                    strA2 = mVar.h;
                                                    strA = mVar.f12922i;
                                                    z10 = true;
                                                }
                                            }
                                        }
                                        if (!z10) {
                                            this.f6904f = i15;
                                            this.h = (b) this.h.f6850f;
                                            sVar2 = new s("]");
                                            sVar3 = sVar2;
                                        } else {
                                            sVar5 = z13 ? new je.k(0, strA2, strA) : new je.k(1, strA2, strA);
                                            je.p pVar2 = (je.p) sVar9.f12927f;
                                            while (pVar2 != null) {
                                                je.p pVar3 = (je.p) pVar2.f12927f;
                                                sVar5.b(pVar2);
                                                pVar2 = pVar3;
                                            }
                                            h((c) bVar5.f6851g);
                                            je.p pVar4 = (je.p) sVar5.f12925c;
                                            je.p pVar5 = (je.p) sVar5.d;
                                            if (pVar4 != pVar5) {
                                                f(pVar4, pVar5);
                                            }
                                            sVar9.g();
                                            b bVar6 = (b) this.h.f6850f;
                                            this.h = bVar6;
                                            if (!z13) {
                                                while (bVar6 != null) {
                                                    if (!bVar6.f6846a) {
                                                        bVar6.f6848c = false;
                                                    }
                                                    bVar6 = (b) bVar6.f6850f;
                                                }
                                            }
                                            sVar3 = sVar5;
                                        }
                                    } else {
                                        this.h = (b) bVar5.f6850f;
                                        sVar4 = new s("]");
                                    }
                                } else {
                                    sVar4 = new s("]");
                                }
                                sVar3 = sVar4;
                                break;
                            default:
                                if (!this.f6901b.get(cG)) {
                                    int i21 = this.f6904f;
                                    int length = this.f6903e.length();
                                    while (true) {
                                        int i22 = this.f6904f;
                                        if (i22 != length) {
                                            if (!this.f6900a.get(this.f6903e.charAt(i22))) {
                                                this.f6904f++;
                                            }
                                        }
                                    }
                                    int i23 = this.f6904f;
                                    if (i21 == i23) {
                                        sVar3 = sVar5;
                                    } else {
                                        sVar3 = new s(this.f6903e.substring(i21, i23));
                                    }
                                } else {
                                    me.a aVar = (me.a) this.f6902c.get(Character.valueOf(cG));
                                    int i24 = this.f6904f;
                                    int i25 = 0;
                                    while (g() == cG) {
                                        i25++;
                                        this.f6904f++;
                                    }
                                    if (i25 < aVar.d()) {
                                        this.f6904f = i24;
                                        iVar = sVar5;
                                    } else {
                                        String strSubstring4 = i24 == 0 ? "\n" : this.f6903e.substring(i24 - 1, i24);
                                        char cG2 = g();
                                        String strValueOf = cG2 != 0 ? String.valueOf(cG2) : "\n";
                                        Pattern pattern3 = f6888i;
                                        boolean zMatches = pattern3.matcher(strSubstring4).matches();
                                        Pattern pattern4 = f6897r;
                                        boolean zMatches2 = pattern4.matcher(strSubstring4).matches();
                                        boolean zMatches3 = pattern3.matcher(strValueOf).matches();
                                        boolean zMatches4 = pattern4.matcher(strValueOf).matches();
                                        boolean z14 = !zMatches4 && (!zMatches3 || zMatches2 || zMatches);
                                        boolean z15 = !zMatches2 && (!zMatches || zMatches4 || zMatches3);
                                        if (cG == '_') {
                                            z12 = z14 && (!z15 || zMatches);
                                            z11 = z15 && (!z14 || zMatches3);
                                        } else {
                                            boolean z16 = z14 && cG == aVar.e();
                                            z11 = z15 && cG == aVar.a();
                                            z12 = z16;
                                        }
                                        this.f6904f = i24;
                                        iVar = new i(i25, z12, z11);
                                    }
                                    if (iVar != 0) {
                                        int i26 = iVar.f6885a;
                                        int i27 = this.f6904f;
                                        int i28 = i27 + i26;
                                        this.f6904f = i28;
                                        s sVar10 = new s(this.f6903e.substring(i27, i28));
                                        boolean z17 = iVar.f6887c;
                                        boolean z18 = iVar.f6886b;
                                        c cVar = this.f6905g;
                                        c cVar2 = new c(sVar10, cG, z17, z18, cVar);
                                        this.f6905g = cVar2;
                                        cVar2.f6857g = i26;
                                        cVar2.h = i26;
                                        if (cVar != null) {
                                            cVar.f6856f = cVar2;
                                        }
                                        sVar3 = sVar10;
                                    } else {
                                        sVar3 = sVar5;
                                    }
                                }
                                break;
                        }
                    } else {
                        String strD5 = d(f6893n);
                        if (strD5 == null) {
                            sVar3 = 0;
                        } else {
                            int i29 = this.f6904f;
                            while (true) {
                                String strD6 = d(f6892m);
                                if (strD6 == null) {
                                    this.f6904f = i29;
                                    sVar5 = new s(strD5);
                                    sVar3 = sVar5;
                                } else if (strD6.equals(strD5)) {
                                    je.d dVar = new je.d(0);
                                    String strReplace = this.f6903e.substring(i29, this.f6904f - strD5.length()).replace('\n', ' ');
                                    if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                                        int length2 = strReplace.length();
                                        if (j8.b(' ', strReplace, 0, length2) != length2) {
                                            strReplace = com.google.android.recaptcha.internal.a.n(strReplace, 1, 1);
                                        }
                                    }
                                    dVar.h = strReplace;
                                    sVar4 = dVar;
                                    sVar3 = sVar4;
                                }
                            }
                        }
                    }
                    r10 = sVar3;
                } else {
                    this.f6904f++;
                    if (r12 instanceof s) {
                        s sVar11 = (s) r12;
                        if (sVar11.f12929g.endsWith(" ")) {
                            String str5 = sVar11.f12929g;
                            Matcher matcher = f6899t.matcher(str5);
                            int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                            if (iEnd > 0) {
                                sVar11.f12929g = com.google.android.recaptcha.internal.a.n(str5, iEnd, 0);
                            }
                            gVar = iEnd >= 2 ? new je.g(1) : new je.g(2);
                        } else {
                            gVar = new je.g(2);
                        }
                    } else {
                        gVar = new je.g(2);
                    }
                    r10 = gVar;
                }
                if (r10 != 0) {
                    r11 = r10;
                } else {
                    this.f6904f++;
                    sVar = new s(String.valueOf(cG));
                }
            }
            if (r11 == 0) {
                r11 = sVar;
                h(null);
                je.p pVar6 = (je.p) pVar.f12925c;
                je.p pVar7 = (je.p) pVar.d;
                if (pVar6 == pVar7) {
                    return;
                }
                f(pVar6, pVar7);
                return;
            }
            r11 = sVar;
            pVar.b(r11);
            sVar5 = 0;
            r12 = r11;
        }
    }

    public final String d(Pattern pattern) {
        if (this.f6904f >= this.f6903e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f6903e);
        matcher.region(this.f6904f, this.f6903e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f6904f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f6904f < this.f6903e.length()) {
            return this.f6903e.charAt(this.f6904f);
        }
        return (char) 0;
    }

    public final void h(c cVar) {
        boolean z10;
        je.p pVar;
        HashMap map = new HashMap();
        c cVar2 = this.f6905g;
        while (cVar2 != null) {
            c cVar3 = cVar2.f6855e;
            if (cVar3 == cVar) {
                break;
            } else {
                cVar2 = cVar3;
            }
        }
        while (cVar2 != null) {
            s sVar = cVar2.f6852a;
            char c10 = cVar2.f6853b;
            me.a aVar = (me.a) this.f6902c.get(Character.valueOf(c10));
            if (!cVar2.d || aVar == null) {
                cVar2 = cVar2.f6856f;
            } else {
                char cE = aVar.e();
                c cVar4 = cVar2.f6855e;
                int iC = 0;
                boolean z11 = false;
                while (true) {
                    if (cVar4 == null || cVar4 == cVar || cVar4 == map.get(Character.valueOf(c10))) {
                        z10 = z11;
                        z11 = false;
                        break;
                    }
                    if (cVar4.f6854c && cVar4.f6853b == cE) {
                        iC = aVar.c(cVar4, cVar2);
                        z11 = true;
                        if (iC > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    cVar4 = cVar4.f6855e;
                }
                if (z11) {
                    s sVar2 = cVar4.f6852a;
                    cVar4.f6857g -= iC;
                    cVar2.f6857g -= iC;
                    sVar2.f12929g = com.google.android.recaptcha.internal.a.n(sVar2.f12929g, iC, 0);
                    sVar.f12929g = com.google.android.recaptcha.internal.a.n(sVar.f12929g, iC, 0);
                    c cVar5 = cVar2.f6855e;
                    while (cVar5 != null && cVar5 != cVar4) {
                        c cVar6 = cVar5.f6855e;
                        i(cVar5);
                        cVar5 = cVar6;
                    }
                    if (sVar2 != sVar && (pVar = (je.p) sVar2.f12927f) != sVar) {
                        f(pVar, (je.p) sVar.f12926e);
                    }
                    aVar.b(sVar2, sVar, iC);
                    if (cVar4.f6857g == 0) {
                        cVar4.f6852a.g();
                        i(cVar4);
                    }
                    if (cVar2.f6857g == 0) {
                        c cVar7 = cVar2.f6856f;
                        sVar.g();
                        i(cVar2);
                        cVar2 = cVar7;
                    }
                } else {
                    if (!z10) {
                        map.put(Character.valueOf(c10), cVar2.f6855e);
                        if (!cVar2.f6854c) {
                            i(cVar2);
                        }
                    }
                    cVar2 = cVar2.f6856f;
                }
            }
        }
        while (true) {
            c cVar8 = this.f6905g;
            if (cVar8 == null || cVar8 == cVar) {
                return;
            } else {
                i(cVar8);
            }
        }
    }

    public final void i(c cVar) {
        c cVar2 = cVar.f6855e;
        if (cVar2 != null) {
            cVar2.f6856f = cVar.f6856f;
        }
        c cVar3 = cVar.f6856f;
        if (cVar3 == null) {
            this.f6905g = cVar2;
        } else {
            cVar3.f6855e = cVar2;
        }
    }
}
