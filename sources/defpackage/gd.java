package defpackage;
public final class gd implements Runnable {
    public final byte a;
    public final hd b;

    public gd(hd hdVar, byte b) {
        this.a = b;
        this.b = hdVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hd hdVar = this.b;
        switch (b) {
            case 0:
                hdVar.invalidateSelf();
                return;
            default:
                ((ln) hdVar.d).e(true, 0.0f);
                hdVar.invalidateSelf();
                return;
        }
    }
}
