package defpackage;
public final class cua implements Runnable {
    public final byte a;
    public final Runnable b;
    public final Runnable c;

    public cua(Runnable runnable, Runnable runnable2, byte b) {
        this.a = b;
        this.b = runnable;
        this.c = runnable2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.c;
        Runnable runnable2 = this.b;
        switch (b) {
            case 0:
                runnable2.run();
                runnable.run();
                return;
            default:
                ijb.b(runnable2);
                if (runnable != null) {
                    gl.c3(runnable);
                    return;
                }
                return;
        }
    }
}
