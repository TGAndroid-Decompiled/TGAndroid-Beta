package gi;
public final class b9 implements Runnable {
    public final int f12462a;
    public final va f12463b;
    public final Runnable f12464c;

    public b9(va vaVar, Runnable runnable, int i3) {
        this.f12462a = i3;
        this.f12463b = vaVar;
        this.f12464c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f12462a) {
            case 0:
                this.f12464c.run();
                this.f12463b.o0();
                return;
            default:
                va vaVar = this.f12463b;
                vaVar.e(false);
                org.telegram.messenger.g0.r(vaVar.f13725h2);
                vaVar.f13725h2 = null;
                vaVar.T1 = false;
                this.f12464c.run();
                return;
        }
    }
}
