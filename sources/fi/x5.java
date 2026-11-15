package fi;
public final class x5 implements Runnable {
    public final int f12501a;
    public final s6 f12502b;

    public x5(s6 s6Var, int i7) {
        this.f12501a = i7;
        this.f12502b = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f12501a) {
            case 0:
                s6 s6Var = this.f12502b;
                s6Var.R = false;
                s6Var.S = null;
                return;
            case 1:
                s6 s6Var2 = this.f12502b;
                s6Var2.f12335s = true;
                s6Var2.f12328l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                s6 s6Var3 = this.f12502b;
                s6Var3.R = false;
                s6Var3.S = null;
                return;
        }
    }
}
