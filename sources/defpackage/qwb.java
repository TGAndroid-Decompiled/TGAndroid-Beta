package defpackage;
public enum qwb extends rwb {
    public qwb() {
        super("EndTagOpen", 8);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        boolean j = ik1Var.j();
        mub mubVar = rwb.a;
        if (j) {
            bubVar.l(this);
            bubVar.h("</");
            bubVar.c = mubVar;
        } else if (ik1Var.o()) {
            bubVar.d(false);
            bubVar.c = rwb.r;
        } else if (ik1Var.m('>')) {
            bubVar.m(this);
            bubVar.a(mubVar);
        } else {
            bubVar.m(this);
            bubVar.a(rwb.g0);
        }
    }
}
