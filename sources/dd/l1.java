package dd;
public enum l1 extends b2 {
    public l1() {
        super("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f8663m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                w wVar = b2.f8602a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.d.append(d);
                        return;
                    }
                    lVar.l(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f8655c = wVar;
                    return;
                }
                lVar.m(this);
                fVar.getClass();
                lVar.j();
                lVar.f8655c = wVar;
                return;
            }
            lVar.f8655c = b2.f8630v0;
            return;
        }
        lVar.m(this);
        fVar.d.append((char) 65533);
    }
}
