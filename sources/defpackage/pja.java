package defpackage;
public final class pja implements Runnable {
    public final byte a;
    public final rja b;

    public pja(rja rjaVar, byte b) {
        this.a = b;
        this.b = rjaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        rja rjaVar = this.b;
        switch (b) {
            case 0:
                rjaVar.W0 = false;
                if (!rjaVar.Z0 && rjaVar.X0) {
                    rjaVar.x(true);
                    return;
                }
                return;
            case 1:
                rjaVar.W0 = false;
                return;
            case 2:
                rjaVar.Z0 = false;
                if (!rjaVar.W0 && rjaVar.X0) {
                    rjaVar.x(true);
                    return;
                }
                return;
            default:
                rjaVar.Z0 = false;
                return;
        }
    }
}
