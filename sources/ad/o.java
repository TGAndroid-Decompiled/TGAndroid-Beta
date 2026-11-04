package ad;

import java.util.Locale;
public enum o extends c2 {
    public o() {
        super("RcdataLessthanSign", 10);
    }

    @Override
    public final void d(m mVar, a aVar) {
        String str;
        if (aVar.m('/')) {
            mVar.e();
            mVar.a(c2.f346w);
            return;
        }
        if (aVar.o() && mVar.f380o != null) {
            String str2 = "</" + mVar.f380o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str2.toLowerCase(locale);
            String upperCase = str2.toUpperCase(locale);
            if (aVar.p(lowerCase) <= -1 && aVar.p(upperCase) <= -1) {
                k d = mVar.d(false);
                String str3 = mVar.f380o;
                d.f357c = str3;
                if (str3 != null) {
                    str = str3.toLowerCase(locale);
                } else {
                    str = "";
                }
                d.d = str;
                mVar.f374i = d;
                mVar.k();
                aVar.q();
                mVar.f370c = c2.f317a;
                return;
            }
        }
        mVar.h("<");
        mVar.f370c = c2.f321c;
    }
}
