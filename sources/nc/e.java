package nc;

import g7.i8;
import h7.z;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import je.m;
import je.p;
import je.s;

public final class e extends h {

    public static final Pattern f18452e = i.f18462n;

    @Override
    public final p b() {
        String strA;
        String strA2;
        boolean z10;
        je.k kVar;
        p pVar;
        p pVar2;
        p pVar3;
        ge.b bVar;
        int i10;
        i iVar;
        int i11;
        String strSubstring;
        m mVar;
        int iB;
        int i12 = this.d + 1;
        this.d = i12;
        i iVar2 = this.f18455a;
        ge.b bVar2 = iVar2.f18469i;
        if (bVar2 == null) {
            return f("]");
        }
        s sVar = (s) bVar2.f6849e;
        boolean z11 = bVar2.f6846a;
        if (!bVar2.f6848c) {
            iVar2.f18469i = (ge.b) bVar2.f6850f;
            return f("]");
        }
        if (c() == '(') {
            this.d++;
            e();
            i iVar3 = this.f18455a;
            int i13 = this.d;
            iVar3.f18468g = i13;
            int iA = i8.a(i13, iVar3.f18467f);
            if (iA == -1) {
                strA = null;
            } else {
                String strSubstring2 = iVar3.d() == '<' ? iVar3.f18467f.substring(iVar3.f18468g + 1, iA - 1) : iVar3.f18467f.substring(iVar3.f18468g, iA);
                iVar3.f18468g = iA;
                strA = ie.a.a(strSubstring2);
            }
            this.d = this.f18455a.f18468g;
            if (strA != null) {
                e();
                String str = this.f18457c;
                int i14 = this.d;
                if (f18452e.matcher(str.substring(i14 - 1, i14)).matches()) {
                    i iVar4 = this.f18455a;
                    int i15 = this.d;
                    iVar4.f18468g = i15;
                    int iC = i8.c(i15, iVar4.f18467f);
                    if (iC == -1) {
                        strA2 = null;
                    } else {
                        String strSubstring3 = iVar4.f18467f.substring(iVar4.f18468g + 1, iC - 1);
                        iVar4.f18468g = iC;
                        strA2 = ie.a.a(strSubstring3);
                    }
                    this.d = this.f18455a.f18468g;
                    e();
                } else {
                    strA2 = null;
                }
                if (c() == ')') {
                    this.d++;
                    z10 = true;
                } else {
                    this.d = i12;
                }
                if (!z10) {
                    i10 = this.d;
                    iVar = this.f18455a;
                    iVar.f18468g = i10;
                    if (i10 < iVar.f18467f.length() && iVar.f18467f.charAt(iVar.f18468g) == '[') {
                        int i16 = iVar.f18468g + 1;
                        iB = i8.b(i16, iVar.f18467f);
                        int i17 = iB - i16;
                        if (iB != -1 && i17 <= 999 && iB < iVar.f18467f.length() && iVar.f18467f.charAt(iB) == ']') {
                            iVar.f18468g = iB + 1;
                        }
                    }
                    int i18 = this.f18455a.f18468g;
                    this.d = i18;
                    i11 = i18 - i10;
                    if (i11 > 2) {
                        strSubstring = this.f18457c.substring(i10, i11 + i10);
                    } else if (bVar2.d) {
                        strSubstring = null;
                    } else {
                        strSubstring = this.f18457c.substring(bVar2.f6847b, i12);
                    }
                    if (strSubstring != null) {
                        Pattern pattern = ie.a.f11220a;
                        String strReplaceAll = ie.a.f11222c.matcher(strSubstring.substring(1, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        i iVar5 = this.f18455a;
                        iVar5.getClass();
                        mVar = (m) ((Map) iVar5.f18463a.f6390c).get(strReplaceAll);
                        if (mVar != null) {
                            strA = mVar.h;
                            strA2 = mVar.f12922i;
                            z10 = true;
                        }
                    }
                }
                if (!z10) {
                    this.d = i12;
                    i iVar6 = this.f18455a;
                    iVar6.f18469i = (ge.b) iVar6.f18469i.f6850f;
                    return f("]");
                }
                if (z11) {
                    kVar = new je.k(0, strA, strA2);
                } else {
                    kVar = new je.k(1, strA, strA2);
                }
                pVar = (p) sVar.f12927f;
                while (pVar != null) {
                    p pVar4 = (p) pVar.f12927f;
                    kVar.b(pVar);
                    pVar = pVar4;
                }
                ge.c cVar = (ge.c) bVar2.f6851g;
                i iVar7 = this.f18455a;
                iVar7.f18468g = this.d;
                iVar7.e(cVar);
                this.d = this.f18455a.f18468g;
                pVar2 = (p) kVar.f12925c;
                pVar3 = (p) kVar.d;
                if (pVar2 != pVar3) {
                    z.b(pVar2, pVar3);
                }
                sVar.g();
                i iVar8 = this.f18455a;
                bVar = (ge.b) iVar8.f18469i.f6850f;
                iVar8.f18469i = bVar;
                if (!z11) {
                    while (bVar != null) {
                        if (!bVar.f6846a) {
                            bVar.f6848c = false;
                        }
                        bVar = (ge.b) bVar.f6850f;
                    }
                }
                return kVar;
            }
            z10 = false;
            if (!z10) {
                i10 = this.d;
                iVar = this.f18455a;
                iVar.f18468g = i10;
                if (i10 < iVar.f18467f.length()) {
                    int i19 = iVar.f18468g + 1;
                    iB = i8.b(i19, iVar.f18467f);
                    int i110 = iB - i19;
                    if (iB != -1) {
                        iVar.f18468g = iB + 1;
                    }
                }
                int i111 = this.f18455a.f18468g;
                this.d = i111;
                i11 = i111 - i10;
                if (i11 > 2) {
                    strSubstring = this.f18457c.substring(i10, i11 + i10);
                } else if (bVar2.d) {
                    strSubstring = this.f18457c.substring(bVar2.f6847b, i12);
                } else {
                    strSubstring = null;
                }
                if (strSubstring != null) {
                    Pattern pattern2 = ie.a.f11220a;
                    String strReplaceAll2 = ie.a.f11222c.matcher(strSubstring.substring(1, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                    i iVar9 = this.f18455a;
                    iVar9.getClass();
                    mVar = (m) ((Map) iVar9.f18463a.f6390c).get(strReplaceAll2);
                    if (mVar != null) {
                        strA = mVar.h;
                        strA2 = mVar.f12922i;
                        z10 = true;
                    }
                }
            }
            if (!z10) {
                this.d = i12;
                i iVar10 = this.f18455a;
                iVar10.f18469i = (ge.b) iVar10.f18469i.f6850f;
                return f("]");
            }
            if (z11) {
                kVar = new je.k(0, strA, strA2);
            } else {
                kVar = new je.k(1, strA, strA2);
            }
            pVar = (p) sVar.f12927f;
            while (pVar != null) {
                p pVar5 = (p) pVar.f12927f;
                kVar.b(pVar);
                pVar = pVar5;
            }
            ge.c cVar2 = (ge.c) bVar2.f6851g;
            i iVar11 = this.f18455a;
            iVar11.f18468g = this.d;
            iVar11.e(cVar2);
            this.d = this.f18455a.f18468g;
            pVar2 = (p) kVar.f12925c;
            pVar3 = (p) kVar.d;
            if (pVar2 != pVar3) {
                z.b(pVar2, pVar3);
            }
            sVar.g();
            i iVar12 = this.f18455a;
            bVar = (ge.b) iVar12.f18469i.f6850f;
            iVar12.f18469i = bVar;
            if (!z11) {
                while (bVar != null) {
                    if (!bVar.f6846a) {
                        bVar.f6848c = false;
                    }
                    bVar = (ge.b) bVar.f6850f;
                }
            }
            return kVar;
        }
        strA = null;
        strA2 = null;
        z10 = false;
        if (!z10) {
            i10 = this.d;
            iVar = this.f18455a;
            iVar.f18468g = i10;
            if (i10 < iVar.f18467f.length()) {
                int i112 = iVar.f18468g + 1;
                iB = i8.b(i112, iVar.f18467f);
                int i113 = iB - i112;
                if (iB != -1) {
                    iVar.f18468g = iB + 1;
                }
            }
            int i114 = this.f18455a.f18468g;
            this.d = i114;
            i11 = i114 - i10;
            if (i11 > 2) {
                strSubstring = this.f18457c.substring(i10, i11 + i10);
            } else if (bVar2.d) {
                strSubstring = this.f18457c.substring(bVar2.f6847b, i12);
            } else {
                strSubstring = null;
            }
            if (strSubstring != null) {
                Pattern pattern3 = ie.a.f11220a;
                String strReplaceAll3 = ie.a.f11222c.matcher(strSubstring.substring(1, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                i iVar13 = this.f18455a;
                iVar13.getClass();
                mVar = (m) ((Map) iVar13.f18463a.f6390c).get(strReplaceAll3);
                if (mVar != null) {
                    strA = mVar.h;
                    strA2 = mVar.f12922i;
                    z10 = true;
                }
            }
        }
        if (!z10) {
            this.d = i12;
            i iVar14 = this.f18455a;
            iVar14.f18469i = (ge.b) iVar14.f18469i.f6850f;
            return f("]");
        }
        if (z11) {
            kVar = new je.k(0, strA, strA2);
        } else {
            kVar = new je.k(1, strA, strA2);
        }
        pVar = (p) sVar.f12927f;
        while (pVar != null) {
            p pVar6 = (p) pVar.f12927f;
            kVar.b(pVar);
            pVar = pVar6;
        }
        ge.c cVar3 = (ge.c) bVar2.f6851g;
        i iVar15 = this.f18455a;
        iVar15.f18468g = this.d;
        iVar15.e(cVar3);
        this.d = this.f18455a.f18468g;
        pVar2 = (p) kVar.f12925c;
        pVar3 = (p) kVar.d;
        if (pVar2 != pVar3) {
            z.b(pVar2, pVar3);
        }
        sVar.g();
        i iVar16 = this.f18455a;
        bVar = (ge.b) iVar16.f18469i.f6850f;
        iVar16.f18469i = bVar;
        if (!z11) {
            while (bVar != null) {
                if (!bVar.f6846a) {
                    bVar.f6848c = false;
                }
                bVar = (ge.b) bVar.f6850f;
            }
        }
        return kVar;
    }

    @Override
    public final char d() {
        return ']';
    }
}
