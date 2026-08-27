package lh;

public final class ja implements Runnable {

    public final int f16206a;

    public final sb f16207b;

    public ja(sb sbVar, int i10) {
        this.f16206a = i10;
        this.f16207b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f16206a) {
            case 0:
                sb sbVar = this.f16207b;
                sbVar.getClass();
                sbVar.g(1.0f, true, new s9(sbVar, 6));
                sbVar.X0.b(true, true);
                break;
            default:
                sb sbVar2 = this.f16207b;
                sbVar2.f(false);
                sbVar2.f16772i2 = null;
                break;
        }
    }
}
