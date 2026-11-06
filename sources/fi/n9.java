package fi;
public final class n9 implements Runnable {
    public final int f12496a;
    public final va f12497b;

    public n9(va vaVar, int i7) {
        this.f12496a = i7;
        this.f12497b = vaVar;
    }

    @Override
    public final void run() {
        switch (this.f12496a) {
            case 0:
                va vaVar = this.f12497b;
                vaVar.getClass();
                vaVar.f(1.0f, true, new u8(vaVar, 6));
                vaVar.f12940b1.b(true, true);
                return;
            default:
                va vaVar2 = this.f12497b;
                vaVar2.e(false);
                vaVar2.f12974m2 = null;
                return;
        }
    }
}
