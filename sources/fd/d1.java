package fd;
public enum d1 extends a2 {
    public d1() {
        super("CommentEndBang", 49);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f10592n;
        char d = aVar.d();
        z0 z0Var = a2.f10549j0;
        if (d != 0) {
            if (d != '-') {
                v vVar = a2.f10536a;
                if (d != '>') {
                    if (d != 65535) {
                        StringBuilder sb2 = eVar.f10572c;
                        sb2.append("--!");
                        sb2.append(d);
                        kVar.f10584c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f10584c = vVar;
                    return;
                }
                kVar.i();
                kVar.f10584c = vVar;
                return;
            }
            eVar.f10572c.append("--!");
            kVar.f10584c = a2.f10550k0;
            return;
        }
        kVar.m(this);
        StringBuilder sb3 = eVar.f10572c;
        sb3.append("--!");
        sb3.append((char) 65533);
        kVar.f10584c = z0Var;
    }
}
