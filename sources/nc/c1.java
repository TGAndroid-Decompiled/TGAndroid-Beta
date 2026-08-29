package nc;
public enum c1 extends b2 {
    public c1() {
        super("CommentEnd", 48);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f17299n;
        char d = aVar.d();
        a1 a1Var = b2.f17247f0;
        if (d != 0) {
            if (d != '!') {
                if (d != '-') {
                    w wVar = b2.f17237a;
                    if (d != '>') {
                        if (d != 65535) {
                            lVar.m(this);
                            StringBuilder sb2 = eVar.f17274c;
                            sb2.append("--");
                            sb2.append(d);
                            lVar.f17290c = a1Var;
                            return;
                        }
                        lVar.l(this);
                        lVar.i();
                        lVar.f17290c = wVar;
                        return;
                    }
                    lVar.i();
                    lVar.f17290c = wVar;
                    return;
                }
                lVar.m(this);
                eVar.f17274c.append('-');
                return;
            }
            lVar.m(this);
            lVar.f17290c = b2.f17250i0;
            return;
        }
        lVar.m(this);
        StringBuilder sb3 = eVar.f17274c;
        sb3.append("--");
        sb3.append((char) 65533);
        lVar.f17290c = a1Var;
    }
}
