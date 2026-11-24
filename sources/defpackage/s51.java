package defpackage;
public final class s51 implements gv5 {
    public final byte a;
    public final v51 b;
    public final m51 c;

    public s51(v51 v51Var, m51 m51Var, byte b) {
        this.a = b;
        this.b = v51Var;
        this.c = m51Var;
    }

    @Override
    public final void a(int i) {
        byte b = this.a;
        m51 m51Var = this.c;
        v51 v51Var = this.b;
        switch (b) {
            case 0:
                if (i == 4) {
                    v51Var.d.remove(m51Var);
                    v51Var.Y();
                } else {
                    m51Var.b = i;
                    gl.V3(v51Var.b);
                }
                v51Var.getMessagesController().h4.h(v51Var.e, v51Var.d);
                return;
            default:
                m51Var.b = i;
                v51Var.getMessagesController().h4.h(v51Var.e, v51Var.d);
                gl.V3(v51Var.b);
                return;
        }
    }
}
