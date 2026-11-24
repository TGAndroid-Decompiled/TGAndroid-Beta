package defpackage;
public final class fc implements Runnable {
    public final byte a;
    public final gc b;

    public fc(gc gcVar, byte b) {
        this.a = b;
        this.b = gcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        gc gcVar = this.b;
        switch (b) {
            case 0:
                gcVar.invalidateSelf();
                return;
            default:
                ((lm) gcVar.d).e(true, 0.0f);
                gcVar.invalidateSelf();
                return;
        }
    }
}
