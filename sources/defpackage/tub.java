package defpackage;
public enum tub extends rwb {
    public tub() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.o()) {
            bubVar.d(false);
            wtb wtbVar = bubVar.i;
            char i = ik1Var.i();
            wtbVar.getClass();
            wtbVar.y(String.valueOf(i));
            bubVar.h.append(ik1Var.i());
            bubVar.a(rwb.Q);
            return;
        }
        bubVar.h("</");
        bubVar.c = rwb.L;
    }
}
