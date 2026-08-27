package mc;

import java.util.Locale;

public final enum n extends b2 {
    public n() {
        super("RcdataLessthanSign", 10);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.m('/')) {
            lVar.e();
            lVar.a(b2.v);
            return;
        }
        if (aVar.o() && lVar.f18017o != null) {
            String str = "</" + lVar.f18017o;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String upperCase = str.toUpperCase(locale);
            if (aVar.p(lowerCase) <= -1 && aVar.p(upperCase) <= -1) {
                j jVarD = lVar.d(false);
                String str2 = lVar.f18017o;
                jVarD.f17994c = str2;
                jVarD.d = str2 != null ? str2.toLowerCase(locale) : "";
                lVar.f18011i = jVarD;
                lVar.k();
                aVar.q();
                lVar.f18007c = b2.f17954a;
                return;
            }
        }
        lVar.g("<");
        lVar.f18007c = b2.f17958c;
    }
}
