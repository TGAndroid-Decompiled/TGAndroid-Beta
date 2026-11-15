package dd;
public enum b1 extends b2 {
    public b1() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8054n;
        char d = aVar.d();
        a1 a1Var = b2.f8007k0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb2 = eVar.f8029c;
                    sb2.append('-');
                    sb2.append(d);
                    lVar.f8045c = a1Var;
                    return;
                }
                lVar.l(this);
                lVar.i();
                lVar.f8045c = b2.f7992a;
                return;
            }
            lVar.f8045c = b2.m0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f8029c;
        sb3.append('-');
        sb3.append((char) 65533);
        lVar.f8045c = a1Var;
    }
}
