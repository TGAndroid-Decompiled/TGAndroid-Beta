package fd;
public enum b1 extends a2 {
    public b1() {
        super("CommentEnd", 48);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f10577n;
        char d = aVar.d();
        z0 z0Var = a2.f10534j0;
        if (d != 0) {
            if (d != '!') {
                if (d != '-') {
                    v vVar = a2.f10521a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            StringBuilder sb2 = eVar.f10557c;
                            sb2.append("--");
                            sb2.append(d);
                            kVar.f10569c = z0Var;
                            return;
                        }
                        kVar.l(this);
                        kVar.i();
                        kVar.f10569c = vVar;
                        return;
                    }
                    kVar.i();
                    kVar.f10569c = vVar;
                    return;
                }
                kVar.m(this);
                eVar.f10557c.append('-');
                return;
            }
            kVar.m(this);
            kVar.f10569c = a2.m0;
            return;
        }
        kVar.m(this);
        StringBuilder sb3 = eVar.f10557c;
        sb3.append("--");
        sb3.append((char) 65533);
        kVar.f10569c = z0Var;
    }
}
