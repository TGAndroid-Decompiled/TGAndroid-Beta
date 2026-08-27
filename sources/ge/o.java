package ge;

import g7.i8;
import g7.j8;
import java.util.Locale;
import java.util.regex.Pattern;
import je.r;

public final class o extends le.a {

    public final r f6921a = new r();

    public final k f6922b = new k();

    @Override
    public final void a(CharSequence charSequence) {
        int iB;
        int i10;
        k kVar = this.f6922b;
        StringBuilder sb2 = kVar.f6907b;
        if (sb2.length() != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        int iC = 0;
        while (iC < charSequence.length()) {
            int iB2 = m1.j.b(kVar.f6906a);
            if (iB2 == 0) {
                int iC2 = j8.c(iC, charSequence.length(), charSequence);
                if (iC2 >= charSequence.length() || charSequence.charAt(iC2) != '[') {
                    iC = -1;
                } else {
                    kVar.f6906a = 2;
                    kVar.d = new StringBuilder();
                    iC = iC2 + 1;
                    if (iC >= charSequence.length()) {
                        kVar.d.append('\n');
                    }
                }
            } else if (iB2 == 1) {
                iB = i8.b(iC, charSequence);
                if (iB == -1) {
                    iC = -1;
                } else {
                    kVar.d.append(charSequence, iC, iB);
                    if (iB >= charSequence.length()) {
                        kVar.d.append('\n');
                        iC = iB;
                    } else if (charSequence.charAt(iB) != ']' || (i10 = iB + 1) >= charSequence.length() || charSequence.charAt(i10) != ':' || kVar.d.length() > 999) {
                        iC = -1;
                    } else {
                        String string = kVar.d.toString();
                        Pattern pattern = ie.a.f11220a;
                        String strReplaceAll = ie.a.f11222c.matcher(string.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (strReplaceAll.isEmpty()) {
                            iC = -1;
                        } else {
                            kVar.f6909e = strReplaceAll;
                            kVar.f6906a = 3;
                            iC = j8.c(iB + 2, charSequence.length(), charSequence);
                        }
                    }
                }
            } else if (iB2 == 2) {
                int iC3 = j8.c(iC, charSequence.length(), charSequence);
                int iA = i8.a(iC3, charSequence);
                if (iA != -1) {
                    kVar.f6910f = charSequence.charAt(iC3) == '<' ? charSequence.subSequence(iC3 + 1, iA - 1).toString() : charSequence.subSequence(iC3, iA).toString();
                    iC = j8.c(iA, charSequence.length(), charSequence);
                    if (iC >= charSequence.length()) {
                        kVar.f6912i = true;
                        sb2.setLength(0);
                    } else if (iC == iA) {
                        iC = -1;
                    }
                    kVar.f6906a = 4;
                } else {
                    iC = -1;
                }
            } else if (iB2 == 3) {
                iC = j8.c(iC, charSequence.length(), charSequence);
                if (iC >= charSequence.length()) {
                    kVar.f6906a = 1;
                } else {
                    kVar.f6911g = (char) 0;
                    char cCharAt = charSequence.charAt(iC);
                    if (cCharAt == '\"' || cCharAt == '\'') {
                        kVar.f6911g = cCharAt;
                    } else if (cCharAt == '(') {
                        kVar.f6911g = ')';
                    }
                    if (kVar.f6911g != 0) {
                        kVar.f6906a = 5;
                        kVar.h = new StringBuilder();
                        iC++;
                        if (iC == charSequence.length()) {
                            kVar.h.append('\n');
                        }
                    } else {
                        kVar.a();
                        kVar.f6906a = 1;
                    }
                }
            } else if (iB2 == 4) {
                iB = i8.d(charSequence, iC, kVar.f6911g);
                if (iB == -1) {
                    iC = -1;
                } else {
                    kVar.h.append(charSequence.subSequence(iC, iB));
                    if (iB >= charSequence.length()) {
                        kVar.h.append('\n');
                        iC = iB;
                    } else {
                        iC = j8.c(iB + 1, charSequence.length(), charSequence);
                        if (iC != charSequence.length()) {
                            iC = -1;
                        } else {
                            kVar.f6912i = true;
                            kVar.a();
                            sb2.setLength(0);
                            kVar.f6906a = 1;
                        }
                    }
                }
            } else if (iB2 == 5) {
                return;
            }
            if (iC == -1) {
                kVar.f6906a = 6;
                return;
            }
        }
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final void d() {
        if (this.f6922b.f6907b.length() == 0) {
            this.f6921a.g();
        }
    }

    @Override
    public final je.a e() {
        return this.f6921a;
    }

    @Override
    public final void g(ke.a aVar) {
        StringBuilder sb2 = this.f6922b.f6907b;
        if (sb2.length() > 0) {
            aVar.a(sb2.toString(), this.f6921a);
        }
    }

    @Override
    public final e4.h h(e eVar) {
        if (eVar.h) {
            return null;
        }
        return e4.h.a(eVar.f6863b);
    }
}
