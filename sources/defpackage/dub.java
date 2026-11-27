package defpackage;

import java.util.Locale;
public enum dub extends rwb {
    public dub() {
        super("RcdataLessthanSign", 10);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        String str;
        if (ik1Var.m('/')) {
            bubVar.e();
            bubVar.a(rwb.w);
            return;
        }
        if (ik1Var.o() && bubVar.o != null) {
            String str2 = "</" + bubVar.o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str2.toLowerCase(locale);
            String upperCase = str2.toUpperCase(locale);
            if (ik1Var.p(lowerCase) <= -1 && ik1Var.p(upperCase) <= -1) {
                wtb d = bubVar.d(false);
                String str3 = bubVar.o;
                d.e = str3;
                if (str3 != null) {
                    str = str3.toLowerCase(locale);
                } else {
                    str = "";
                }
                d.f = str;
                bubVar.i = d;
                bubVar.k();
                ik1Var.q();
                bubVar.c = rwb.a;
                return;
            }
        }
        bubVar.h("<");
        bubVar.c = rwb.c;
    }
}
