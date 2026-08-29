package nh;
public final class x9 implements Runnable {
    public final int f18839a;
    public final gb f18840b;

    public x9(gb gbVar, int i10) {
        this.f18839a = i10;
        this.f18840b = gbVar;
    }

    @Override
    public final void run() {
        switch (this.f18839a) {
            case 0:
                gb gbVar = this.f18840b;
                gbVar.getClass();
                gbVar.g(1.0f, true, new g9(gbVar, 6));
                gbVar.X0.b(true, true);
                return;
            default:
                gb gbVar2 = this.f18840b;
                gbVar2.f(false);
                gbVar2.f17766i2 = null;
                return;
        }
    }
}
