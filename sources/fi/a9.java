package fi;
public final class a9 implements Runnable {
    public final int f11616a;
    public final va f11617b;
    public final Runnable f11618c;

    public a9(va vaVar, Runnable runnable, int i7) {
        this.f11616a = i7;
        this.f11617b = vaVar;
        this.f11618c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f11616a) {
            case 0:
                this.f11618c.run();
                this.f11617b.o0();
                return;
            default:
                va vaVar = this.f11617b;
                vaVar.e(false);
                org.telegram.messenger.g0.r(vaVar.f12958g2);
                vaVar.f12958g2 = null;
                vaVar.S1 = false;
                this.f11618c.run();
                return;
        }
    }
}
