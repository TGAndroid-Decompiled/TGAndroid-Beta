package dd;
public enum l1 extends b2 {
    public l1() {
        super("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8326m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                w wVar = b2.f8265a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.d.append(d);
                        return;
                    }
                    lVar.l(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f8318c = wVar;
                    return;
                }
                lVar.m(this);
                fVar.getClass();
                lVar.j();
                lVar.f8318c = wVar;
                return;
            }
            lVar.f8318c = b2.f8295w0;
            return;
        }
        lVar.m(this);
        fVar.d.append((char) 65533);
    }
}
