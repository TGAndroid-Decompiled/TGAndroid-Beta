package fd;
public enum a1 extends a2 {
    public a1() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f10578n;
        char d = aVar.d();
        z0 z0Var = a2.f10535j0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb2 = eVar.f10558c;
                    sb2.append('-');
                    sb2.append(d);
                    kVar.f10570c = z0Var;
                    return;
                }
                kVar.l(this);
                kVar.i();
                kVar.f10570c = a2.f10522a;
                return;
            }
            kVar.f10570c = a2.f10537l0;
            return;
        }
        kVar.m(this);
        StringBuilder sb3 = eVar.f10558c;
        sb3.append('-');
        sb3.append((char) 65533);
        kVar.f10570c = z0Var;
    }
}
