package defpackage;
public enum jwb extends rwb {
    public jwb() {
        super("DoctypeSystemIdentifier_singleQuoted", 63);
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
                        stbVar.g.append(d);
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
            bubVar.c = rwb.C0;
            return;
        }
        bubVar.m(this);
        stbVar.g.append((char) 65533);
    }
}
