package defpackage;
public final class s7 extends ho {
    public final byte e0;
    public final Object f0;

    public s7(Runnable runnable) {
        super(false, true, true, true, false);
        this.e0 = (byte) 2;
        this.f0 = runnable;
    }

    @Override
    public final void invalidateSelf() {
        byte b = this.e0;
        Object obj = this.f0;
        switch (b) {
            case 0:
                ((w7) obj).invalidate();
                return;
            case 1:
                ((w7) obj).invalidate();
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }

    public s7(w7 w7Var, byte b) {
        super(false, true, true);
        this.e0 = b;
        this.f0 = w7Var;
    }
}
