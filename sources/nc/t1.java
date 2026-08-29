package nc;
public enum t1 extends b2 {
    public t1() {
        super("DoctypeSystemIdentifier_singleQuoted", 63);
    }

    @Override
    public final void d(l lVar, a aVar) {
        f fVar = lVar.f17298m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\'') {
                w wVar = b2.f17237a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.f17276e.append(d);
                        return;
                    }
                    lVar.l(this);
                    fVar.getClass();
                    lVar.j();
                    lVar.f17290c = wVar;
                    return;
                }
                lVar.m(this);
                fVar.getClass();
                lVar.j();
                lVar.f17290c = wVar;
                return;
            }
            lVar.f17290c = b2.f17269x0;
            return;
        }
        lVar.m(this);
        fVar.f17276e.append((char) 65533);
    }
}
