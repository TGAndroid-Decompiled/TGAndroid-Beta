package fi;
public final class a9 implements Runnable {
    public final int f11621a;
    public final va f11622b;
    public final Runnable f11623c;

    public a9(va vaVar, Runnable runnable, int i7) {
        this.f11621a = i7;
        this.f11622b = vaVar;
        this.f11623c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f11621a) {
            case 0:
                this.f11623c.run();
                this.f11622b.o0();
                return;
            default:
                va vaVar = this.f11622b;
                vaVar.e(false);
                org.telegram.messenger.g0.r(vaVar.f12960g2);
                vaVar.f12960g2 = null;
                vaVar.S1 = false;
                this.f11623c.run();
                return;
        }
    }
}
