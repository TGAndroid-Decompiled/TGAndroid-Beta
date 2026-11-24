package defpackage;
public final class m1b implements Runnable {
    public final byte a;
    public final g2b b;

    public m1b(g2b g2bVar, byte b) {
        this.a = b;
        this.b = g2bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        g2b g2bVar = this.b;
        switch (b) {
            case 0:
            default:
                g2bVar.R = false;
                g2bVar.S = null;
                return;
            case 1:
                g2bVar.s = true;
                g2bVar.l.edit().putBoolean("read_loaded", true).apply();
                return;
        }
    }
}
