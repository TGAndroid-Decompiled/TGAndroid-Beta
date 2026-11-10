package fi;
public final class m9 implements Runnable {
    public final int f12466a;
    public final va f12467b;

    public m9(va vaVar, int i7) {
        this.f12466a = i7;
        this.f12467b = vaVar;
    }

    @Override
    public final void run() {
        switch (this.f12466a) {
            case 0:
                va vaVar = this.f12467b;
                vaVar.getClass();
                vaVar.f(1.0f, true, new u8(vaVar, 6));
                vaVar.f12942b1.b(true, true);
                return;
            default:
                va vaVar2 = this.f12467b;
                vaVar2.e(false);
                vaVar2.f12976m2 = null;
                return;
        }
    }
}
