package mc;

public final enum n0 extends b2 {
    public n0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(l lVar, a aVar) {
        String strH = aVar.h(b2.C0);
        j jVar = lVar.f18011i;
        String str = jVar.f17995e;
        if (str != null) {
            strH = str.concat(strH);
        }
        jVar.f17995e = strH;
        char cD = aVar.d();
        if (cD == 0) {
            lVar.m(this);
            lVar.f18011i.e((char) 65533);
            return;
        }
        if (cD != ' ') {
            if (cD != '\"' && cD != '\'') {
                if (cD == '/') {
                    lVar.f18007c = b2.f17955a0;
                    return;
                }
                w wVar = b2.f17954a;
                if (cD == 65535) {
                    lVar.l(this);
                    lVar.f18007c = wVar;
                    return;
                }
                if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r') {
                    switch (cD) {
                        case '<':
                            break;
                        case '=':
                            lVar.f18007c = b2.V;
                            break;
                        case '>':
                            lVar.k();
                            lVar.f18007c = wVar;
                            break;
                        default:
                            lVar.f18011i.e(cD);
                            break;
                    }
                    return;
                }
            }
            lVar.m(this);
            lVar.f18011i.e(cD);
            return;
        }
        lVar.f18007c = b2.U;
    }
}
