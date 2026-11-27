package defpackage;
public final class vrc implements Runnable {
    public final byte a;
    public final yrc b;

    public vrc(yrc yrcVar, byte b) {
        this.a = b;
        this.b = yrcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yrc yrcVar = this.b;
        switch (b) {
            case 0:
                yrcVar.i();
                return;
            default:
                Runnable runnable = yrcVar.d0;
                yrcVar.d0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
