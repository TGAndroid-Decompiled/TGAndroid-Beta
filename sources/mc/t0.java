package mc;

public final enum t0 extends b2 {
    public t0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String strH = aVar.h(b2.D0);
        if (strH.length() > 0) {
            lVar.f18011i.g(strH);
        }
        char cD = aVar.d();
        if (cD == 0) {
            lVar.m(this);
            lVar.f18011i.f((char) 65533);
            return;
        }
        if (cD != ' ') {
            if (cD != '\"' && cD != '`') {
                w wVar = b2.f17954a;
                if (cD == 65535) {
                    lVar.l(this);
                    lVar.f18007c = wVar;
                    return;
                }
                if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r') {
                    if (cD == '&') {
                        int[] iArrC = lVar.c('>', true);
                        if (iArrC != null) {
                            lVar.f18011i.h(iArrC);
                            return;
                        } else {
                            lVar.f18011i.f('&');
                            return;
                        }
                    }
                    if (cD != '\'') {
                        switch (cD) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                lVar.k();
                                lVar.f18007c = wVar;
                                break;
                            default:
                                lVar.f18011i.f(cD);
                                break;
                        }
                        return;
                    }
                }
            }
            lVar.m(this);
            lVar.f18011i.f(cD);
            return;
        }
        lVar.f18007c = b2.S;
    }
}
