package defpackage;
public final class m91 implements Runnable {
    public final byte a;
    public final o91 b;

    public m91(o91 o91Var, byte b) {
        this.a = b;
        this.b = o91Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        o91 o91Var = this.b;
        switch (b) {
            case 0:
                o91Var.x = false;
                o91Var.c();
                return;
            default:
                o91Var.a.setVisibility(4);
                return;
        }
    }
}
