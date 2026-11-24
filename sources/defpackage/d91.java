package defpackage;
public final class d91 implements Runnable {
    public final byte a;
    public final f91 b;

    public d91(f91 f91Var, byte b) {
        this.a = b;
        this.b = f91Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        f91 f91Var = this.b;
        switch (b) {
            case 0:
                f91Var.x = false;
                f91Var.c();
                return;
            default:
                f91Var.a.setVisibility(4);
                return;
        }
    }
}
