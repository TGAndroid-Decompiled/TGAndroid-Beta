package defpackage;
public enum cwb extends rwb {
    public cwb() {
        super("DoctypePublicIdentifier_singleQuoted", 57);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        stb stbVar = bubVar.m;
        char d = ik1Var.d();
        if (d != 0) {
            if (d != '\'') {
                mub mubVar = rwb.a;
                if (d != '>') {
                    if (d != 65535) {
                        stbVar.f.append(d);
                        return;
                    }
                    bubVar.l(this);
                    bubVar.j();
                    bubVar.c = mubVar;
                    return;
                }
                bubVar.m(this);
                bubVar.j();
                bubVar.c = mubVar;
                return;
            }
            bubVar.c = rwb.w0;
            return;
        }
        bubVar.m(this);
        stbVar.f.append((char) 65533);
    }
}
