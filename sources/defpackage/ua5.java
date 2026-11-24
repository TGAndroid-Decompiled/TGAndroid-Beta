package defpackage;
public final class ua5 implements Runnable {
    public final byte a;
    public final va5 b;

    public ua5(va5 va5Var, byte b) {
        this.a = b;
        this.b = va5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        va5 va5Var = this.b;
        switch (b) {
            case 0:
                int width = va5Var.getWidth();
                int height = va5Var.getHeight();
                if (va5Var.w && !va5Var.y && width > 0 && height > 0 && !va5Var.a.isEmpty() && va5Var.F > 0.0f && va5Var.b() && Math.abs(Math.log((width / height) / va5Var.F)) > 0.06d) {
                    va5Var.f(true);
                    return;
                }
                return;
            default:
                if (va5Var.y) {
                    va5Var.g();
                    va5Var.post(new ua5(va5Var, (byte) 0));
                    return;
                }
                return;
        }
    }
}
