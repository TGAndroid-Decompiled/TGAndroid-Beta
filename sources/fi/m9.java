package fi;
public final class m9 implements Runnable {
    public final int f12462a;
    public final va f12463b;

    public m9(va vaVar, int i7) {
        this.f12462a = i7;
        this.f12463b = vaVar;
    }

    @Override
    public final void run() {
        switch (this.f12462a) {
            case 0:
                va vaVar = this.f12463b;
                vaVar.getClass();
                vaVar.f(1.0f, true, new u8(vaVar, 6));
                vaVar.f12940b1.b(true, true);
                return;
            default:
                va vaVar2 = this.f12463b;
                vaVar2.e(false);
                vaVar2.f12974m2 = null;
                return;
        }
    }
}
