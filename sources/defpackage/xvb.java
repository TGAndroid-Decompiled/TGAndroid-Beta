package defpackage;
public enum xvb extends rwb {
    public xvb() {
        super("DoctypeName", 52);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        stb stbVar = bubVar.m;
        if (ik1Var.o()) {
            stbVar.e.append(ik1Var.e());
            return;
        }
        char d = ik1Var.d();
        if (d != 0) {
            if (d != ' ') {
                mub mubVar = rwb.a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            stbVar.e.append(d);
                            return;
                        }
                    } else {
                        bubVar.l(this);
                        bubVar.j();
                        bubVar.c = mubVar;
                        return;
                    }
                } else {
                    bubVar.j();
                    bubVar.c = mubVar;
                    return;
                }
            }
            bubVar.c = rwb.r0;
            return;
        }
        bubVar.m(this);
        stbVar.e.append((char) 65533);
    }
}
