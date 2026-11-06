package dd;

import java.util.Locale;
public enum n extends b2 {
    public n() {
        super("RcdataLessthanSign", 10);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String str;
        if (aVar.m('/')) {
            lVar.e();
            lVar.a(b2.f8631w);
            return;
        }
        if (aVar.o() && lVar.f8665o != null) {
            String str2 = "</" + lVar.f8665o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str2.toLowerCase(locale);
            String upperCase = str2.toUpperCase(locale);
            if (aVar.p(lowerCase) <= -1 && aVar.p(upperCase) <= -1) {
                j d = lVar.d(false);
                String str3 = lVar.f8665o;
                d.f8642c = str3;
                if (str3 != null) {
                    str = str3.toLowerCase(locale);
                } else {
                    str = "";
                }
                d.d = str;
                lVar.f8659i = d;
                lVar.k();
                aVar.q();
                lVar.f8655c = b2.f8602a;
                return;
            }
        }
        lVar.h("<");
        lVar.f8655c = b2.f8606c;
    }
}
