package defpackage;
public final class b67 implements Runnable {
    public final byte a;
    public final q67 b;

    public b67(q67 q67Var, byte b) {
        this.a = b;
        this.b = q67Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        q67 q67Var = this.b;
        switch (b) {
            case 0:
                q67Var.l();
                return;
            case 1:
                q67Var.getClass();
                mpa.f(false);
                mpa mpaVar = q67Var.i0;
                if (mpaVar != null) {
                    mpaVar.b(q67Var.F);
                }
                hl.c3(new b67(q67Var, (byte) 0));
                return;
            case 2:
                mpa.f(false);
                mpa mpaVar2 = q67Var.i0;
                if (mpaVar2 != null) {
                    mpaVar2.b(q67Var.F);
                }
                hl.c3(new b67(q67Var, (byte) 3));
                return;
            default:
                q67Var.k();
                return;
        }
    }
}
