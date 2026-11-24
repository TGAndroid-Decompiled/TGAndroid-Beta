package defpackage;
public final class vbc implements Runnable {
    public final byte a;
    public final v8b b;
    public final w83 c;

    public vbc(v8b v8bVar, w83 w83Var, byte b) {
        this.a = b;
        this.b = v8bVar;
        this.c = w83Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                v8b v8bVar = this.b;
                w83 w83Var = this.c;
                String str = g8c.a;
                l93 l93Var = ((t54) ((xbc) v8bVar.c)).a.s;
                tj U = l93Var.U();
                l93Var.V(U, 1015, new i93(U, w83Var, (byte) 16));
                return;
            default:
                v8b v8bVar2 = this.b;
                w83 w83Var2 = this.c;
                synchronized (w83Var2) {
                }
                String str2 = g8c.a;
                y54 y54Var = ((t54) ((xbc) v8bVar2.c)).a;
                l93 l93Var2 = y54Var.s;
                tj R = l93Var2.R((rx6) l93Var2.d.e);
                l93Var2.V(R, 1020, new vu2(R, w83Var2, (byte) 15));
                y54Var.S = null;
                return;
        }
    }
}
