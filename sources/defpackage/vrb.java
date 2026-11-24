package defpackage;
public enum vrb extends qsb {
    public vrb() {
        super("BeforeDoctypeName", 51);
    }

    @Override
    public final void c(aqb aqbVar, zj1 zj1Var) {
        rpb rpbVar = aqbVar.m;
        boolean o = zj1Var.o();
        wrb wrbVar = qsb.q0;
        if (o) {
            rpbVar.s();
            aqbVar.c = wrbVar;
            return;
        }
        char d = zj1Var.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != 65535) {
                    if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                        rpbVar.s();
                        rpbVar.e.append(d);
                        aqbVar.c = wrbVar;
                        return;
                    }
                    return;
                }
                aqbVar.l(this);
                rpbVar.s();
                aqbVar.j();
                aqbVar.c = qsb.a;
                return;
            }
            return;
        }
        aqbVar.m(this);
        rpbVar.s();
        rpbVar.e.append((char) 65533);
        aqbVar.c = wrbVar;
    }
}
