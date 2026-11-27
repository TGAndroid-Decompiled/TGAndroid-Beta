package defpackage;
public final class f5b implements Runnable {
    public final byte a;
    public final c6b b;

    public f5b(c6b c6bVar, byte b) {
        this.a = b;
        this.b = c6bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        c6b c6bVar = this.b;
        switch (b) {
            case 0:
                c6bVar.s = true;
                c6bVar.l.edit().putBoolean("read_loaded", true).apply();
                return;
            case 1:
            default:
                c6bVar.R = false;
                c6bVar.S = null;
                return;
        }
    }
}
