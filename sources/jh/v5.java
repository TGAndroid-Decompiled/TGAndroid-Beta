package jh;

public final class v5 implements Runnable {

    public final int f14048a;

    public final s6 f14049b;

    public v5(s6 s6Var, int i10) {
        this.f14048a = i10;
        this.f14049b = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f14048a) {
            case 0:
                s6 s6Var = this.f14049b;
                s6Var.R = false;
                s6Var.S = null;
                break;
            case 1:
                s6 s6Var2 = this.f14049b;
                s6Var2.f13971s = true;
                s6Var2.f13964l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                s6 s6Var3 = this.f14049b;
                s6Var3.R = false;
                s6Var3.S = null;
                break;
        }
    }
}
