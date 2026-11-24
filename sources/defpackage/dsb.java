package defpackage;

import java.util.Locale;
public enum dsb extends rub {
    public dsb() {
        super("RcdataLessthanSign", 10);
    }

    @Override
    public final void c(bsb bsbVar, hl1 hl1Var) {
        String str;
        if (hl1Var.m('/')) {
            bsbVar.e();
            bsbVar.a(rub.w);
            return;
        }
        if (hl1Var.o() && bsbVar.o != null) {
            String str2 = "</" + bsbVar.o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str2.toLowerCase(locale);
            String upperCase = str2.toUpperCase(locale);
            if (hl1Var.p(lowerCase) <= -1 && hl1Var.p(upperCase) <= -1) {
                wrb d = bsbVar.d(false);
                String str3 = bsbVar.o;
                d.e = str3;
                if (str3 != null) {
                    str = str3.toLowerCase(locale);
                } else {
                    str = "";
                }
                d.f = str;
                bsbVar.i = d;
                bsbVar.k();
                hl1Var.q();
                bsbVar.c = rub.a;
                return;
            }
        }
        bsbVar.h("<");
        bsbVar.c = rub.c;
    }
}
