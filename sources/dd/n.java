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
            lVar.a(b2.f8295w);
            return;
        }
        if (aVar.o() && lVar.f8329o != null) {
            String str2 = "</" + lVar.f8329o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str2.toLowerCase(locale);
            String upperCase = str2.toUpperCase(locale);
            if (aVar.p(lowerCase) <= -1 && aVar.p(upperCase) <= -1) {
                j d = lVar.d(false);
                String str3 = lVar.f8329o;
                d.f8306c = str3;
                if (str3 != null) {
                    str = str3.toLowerCase(locale);
                } else {
                    str = "";
                }
                d.d = str;
                lVar.f8323i = d;
                lVar.k();
                aVar.q();
                lVar.f8319c = b2.f8266a;
                return;
            }
        }
        lVar.h("<");
        lVar.f8319c = b2.f8270c;
    }
}
