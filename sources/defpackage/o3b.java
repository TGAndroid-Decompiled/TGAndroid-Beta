package defpackage;
public final class o3b implements Runnable {
    public final byte a;
    public final h4b b;

    public o3b(h4b h4bVar, byte b) {
        this.a = b;
        this.b = h4bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        h4b h4bVar = this.b;
        switch (b) {
            case 0:
            default:
                h4bVar.R = false;
                h4bVar.S = null;
                return;
            case 1:
                h4bVar.s = true;
                h4bVar.l.edit().putBoolean("read_loaded", true).apply();
                return;
        }
    }
}
