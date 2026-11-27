package defpackage;
public final class vy implements Runnable {
    public final byte a;
    public final fz b;

    public vy(fz fzVar, byte b) {
        this.a = b;
        this.b = fzVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fz fzVar = this.b;
        switch (b) {
            case 0:
                fzVar.onBackPressed();
                return;
            default:
                fzVar.b1();
                return;
        }
    }
}
