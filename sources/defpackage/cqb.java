package defpackage;

import java.util.Locale;
public enum cqb extends qsb {
    public cqb() {
        super("RcdataLessthanSign", 10);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        String str;
        if (zj1Var.m('/')) {
            aqbVar.e();
            aqbVar.a(qsb.w);
            return;
        }
        if (zj1Var.o() && aqbVar.o != null) {
            String str2 = "</" + aqbVar.o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str2.toLowerCase(locale);
            String upperCase = str2.toUpperCase(locale);
            if (zj1Var.p(lowerCase) <= -1 && zj1Var.p(upperCase) <= -1) {
                vpb d = aqbVar.d(false);
                String str3 = aqbVar.o;
                d.e = str3;
                if (str3 != null) {
                    str = str3.toLowerCase(locale);
                } else {
                    str = "";
                }
                d.f = str;
                aqbVar.i = d;
                aqbVar.k();
                zj1Var.q();
                aqbVar.c = qsb.a;
                return;
            }
        }
        aqbVar.h("<");
        aqbVar.c = qsb.c;
    }
}
