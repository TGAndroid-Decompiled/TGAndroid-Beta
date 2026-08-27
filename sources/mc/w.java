package mc;

public final enum w extends b2 {
    public w() {
        super("Data", 0);
    }

    @Override
    public final void d(l lVar, a aVar) {
        int i10;
        char c10;
        char cI = aVar.i();
        if (cI == 0) {
            lVar.m(this);
            lVar.f(aVar.d());
            return;
        }
        if (cI == '&') {
            lVar.a(b2.f17956b);
            return;
        }
        if (cI == '<') {
            lVar.a(b2.h);
            return;
        }
        if (cI == 65535) {
            lVar.h(new g());
            return;
        }
        aVar.b();
        int i11 = aVar.f17951e;
        int i12 = aVar.f17950c;
        char[] cArr = aVar.f17948a;
        while (true) {
            i10 = aVar.f17951e;
            if (i10 >= i12 || (c10 = cArr[i10]) == '&' || c10 == '<' || c10 == 0) {
                break;
            } else {
                aVar.f17951e = i10 + 1;
            }
        }
        lVar.g(i10 > i11 ? a.c(cArr, aVar.h, i11, i10 - i11) : "");
    }
}
