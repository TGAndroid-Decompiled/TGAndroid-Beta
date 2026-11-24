package defpackage;
public final class i2b implements Runnable {
    public final byte a;
    public final x2b b;

    public i2b(x2b x2bVar, byte b) {
        this.a = b;
        this.b = x2bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        x2b x2bVar = this.b;
        switch (b) {
            case 0:
                x2bVar.n1.f();
                return;
            case 1:
                x2bVar.n1.f();
                return;
            case 2:
                x2bVar.dismiss();
                hs6.d0(x2bVar.a).h2(x2bVar.getContext(), x2bVar.M1, 1, x2bVar.F1, false, false);
                return;
            case 3:
                oc7.r1(x2bVar.a).C3("stickers", x2bVar.F1, 1, null);
                return;
            default:
                x2bVar.dismiss();
                hs6.d0(x2bVar.a).h2(x2bVar.getContext(), x2bVar.M1, 1, x2bVar.F1, false, false);
                return;
        }
    }
}
