package defpackage;
public enum wvb extends rwb {
    public wvb() {
        super("BeforeDoctypeName", 51);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        stb stbVar = bubVar.m;
        boolean o = ik1Var.o();
        xvb xvbVar = rwb.q0;
        if (o) {
            stbVar.s();
            bubVar.c = xvbVar;
            return;
        }
        char d = ik1Var.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != 65535) {
                    if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                        stbVar.s();
                        stbVar.e.append(d);
                        bubVar.c = xvbVar;
                        return;
                    }
                    return;
                }
                bubVar.l(this);
                stbVar.s();
                bubVar.j();
                bubVar.c = rwb.a;
                return;
            }
            return;
        }
        bubVar.m(this);
        stbVar.s();
        stbVar.e.append((char) 65533);
        bubVar.c = xvbVar;
    }
}
