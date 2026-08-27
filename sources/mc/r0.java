package mc;

public final enum r0 extends b2 {
    public r0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String strG = aVar.g(b2.A0);
        if (strG.length() > 0) {
            lVar.f18011i.g(strG);
        } else {
            lVar.f18011i.h = true;
        }
        char cD = aVar.d();
        if (cD == 0) {
            lVar.m(this);
            lVar.f18011i.f((char) 65533);
            return;
        }
        if (cD == 65535) {
            lVar.l(this);
            lVar.f18007c = b2.f17954a;
            return;
        }
        if (cD != '&') {
            if (cD != '\'') {
                lVar.f18011i.f(cD);
                return;
            } else {
                lVar.f18007c = b2.Z;
                return;
            }
        }
        int[] iArrC = lVar.c('\'', true);
        if (iArrC != null) {
            lVar.f18011i.h(iArrC);
        } else {
            lVar.f18011i.f('&');
        }
    }
}
