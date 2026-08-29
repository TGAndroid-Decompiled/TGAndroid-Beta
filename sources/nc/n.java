package nc;

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
            lVar.a(b2.v);
            return;
        }
        if (aVar.o() && lVar.f17300o != null) {
            String str2 = "</" + lVar.f17300o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str2.toLowerCase(locale);
            String upperCase = str2.toUpperCase(locale);
            if (aVar.p(lowerCase) <= -1 && aVar.p(upperCase) <= -1) {
                j d = lVar.d(false);
                String str3 = lVar.f17300o;
                d.f17277c = str3;
                if (str3 != null) {
                    str = str3.toLowerCase(locale);
                } else {
                    str = "";
                }
                d.d = str;
                lVar.f17294i = d;
                lVar.k();
                aVar.q();
                lVar.f17290c = b2.f17237a;
                return;
            }
        }
        lVar.g("<");
        lVar.f17290c = b2.f17241c;
    }
}
