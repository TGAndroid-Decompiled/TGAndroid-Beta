package defpackage;
public final class ka9 implements Runnable {
    public final byte a;
    public final la9 b;

    public ka9(la9 la9Var, byte b) {
        this.a = b;
        this.b = la9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        la9 la9Var = this.b;
        switch (b) {
            case 0:
                na9 na9Var = la9Var.b.d;
                if (na9Var != null) {
                    na9Var.postRunnable(na9Var.x);
                    return;
                }
                return;
            case 1:
                na9 na9Var2 = la9Var.b.d;
                if (na9Var2 != null) {
                    na9Var2.postRunnable(na9Var2.x);
                    return;
                }
                return;
            default:
                pa9 pa9Var = la9Var.b;
                na9 na9Var3 = pa9Var.d;
                na9Var3.getClass();
                na9Var3.postRunnable(new ma9(na9Var3, (byte) 1));
                pa9Var.d = null;
                return;
        }
    }
}
