package gi;
public final class n9 implements Runnable {
    public final int f13309a;
    public final va f13310b;

    public n9(va vaVar, int i3) {
        this.f13309a = i3;
        this.f13310b = vaVar;
    }

    @Override
    public final void run() {
        switch (this.f13309a) {
            case 0:
                va vaVar = this.f13310b;
                vaVar.getClass();
                vaVar.f(1.0f, true, new v8(vaVar, 6));
                vaVar.f13708c1.b(true, true);
                return;
            default:
                va vaVar2 = this.f13310b;
                vaVar2.e(false);
                vaVar2.f13741n2 = null;
                return;
        }
    }
}
