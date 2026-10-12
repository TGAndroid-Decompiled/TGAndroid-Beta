package ai;
public final class k8 implements Runnable {
    public final int f1242a;
    public final m9 f1243b;

    public k8(m9 m9Var, int i10) {
        this.f1242a = i10;
        this.f1243b = m9Var;
    }

    @Override
    public final void run() {
        switch (this.f1242a) {
            case 0:
                m9 m9Var = this.f1243b;
                m9Var.R = false;
                m9Var.S = null;
                return;
            case 1:
                m9 m9Var2 = this.f1243b;
                m9Var2.f1420s = true;
                m9Var2.f1413l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                m9 m9Var3 = this.f1243b;
                m9Var3.R = false;
                m9Var3.S = null;
                return;
        }
    }
}
