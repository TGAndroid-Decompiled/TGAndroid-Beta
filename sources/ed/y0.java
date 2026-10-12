package ed;
public enum y0 extends b2 {
    public y0() {
        super("CommentStart", 44);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8892n;
        char d = aVar.d();
        a1 a1Var = b2.f8844j0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f8830a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f8867c.append(d);
                        lVar.f8883c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8883c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f8883c = wVar;
                return;
            }
            lVar.f8883c = b2.f8843i0;
            return;
        }
        lVar.m(this);
        eVar.f8867c.append((char) 65533);
        lVar.f8883c = a1Var;
    }
}
