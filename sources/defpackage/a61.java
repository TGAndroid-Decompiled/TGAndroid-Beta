package defpackage;
public final class a61 implements lx5 {
    public final byte a;
    public final d61 b;
    public final u51 c;

    public a61(d61 d61Var, u51 u51Var, byte b) {
        this.a = b;
        this.b = d61Var;
        this.c = u51Var;
    }

    @Override
    public final void a(int i) {
        byte b = this.a;
        u51 u51Var = this.c;
        d61 d61Var = this.b;
        switch (b) {
            case 0:
                u51Var.b = i;
                d61Var.getMessagesController().i4.h(d61Var.e, d61Var.d);
                hl.V3(d61Var.b);
                return;
            default:
                if (i == 4) {
                    d61Var.d.remove(u51Var);
                    d61Var.Y();
                } else {
                    u51Var.b = i;
                    hl.V3(d61Var.b);
                }
                d61Var.getMessagesController().i4.h(d61Var.e, d61Var.d);
                return;
        }
    }
}
