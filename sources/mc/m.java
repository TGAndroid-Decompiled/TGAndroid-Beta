package mc;

public final enum m extends b2 {
    public m() {
        super("TagName", 9);
    }

    @Override
    public final void d(l lVar, a aVar) {
        int i10;
        char c10;
        aVar.b();
        int i11 = aVar.f17951e;
        int i12 = aVar.f17950c;
        char[] cArr = aVar.f17948a;
        while (true) {
            i10 = aVar.f17951e;
            if (i10 >= i12 || (c10 = cArr[i10]) == '\t' || c10 == '\n' || c10 == '\r' || c10 == '\f' || c10 == ' ' || c10 == '/' || c10 == '>' || c10 == 0) {
                break;
            } else {
                aVar.f17951e = i10 + 1;
            }
        }
        lVar.f18011i.i(i10 > i11 ? a.c(cArr, aVar.h, i11, i10 - i11) : "");
        char cD = aVar.d();
        if (cD == 0) {
            lVar.f18011i.i(b2.E0);
            return;
        }
        if (cD != ' ') {
            if (cD == '/') {
                lVar.f18007c = b2.f17955a0;
                return;
            }
            w wVar = b2.f17954a;
            if (cD == '>') {
                lVar.k();
                lVar.f18007c = wVar;
                return;
            }
            if (cD == 65535) {
                lVar.l(this);
                lVar.f18007c = wVar;
                return;
            } else if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r') {
                j jVar = lVar.f18011i;
                jVar.getClass();
                jVar.i(String.valueOf(cD));
                return;
            }
        }
        lVar.f18007c = b2.S;
    }
}
