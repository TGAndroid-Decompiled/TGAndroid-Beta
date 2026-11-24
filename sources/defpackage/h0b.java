package defpackage;
public final class h0b implements Runnable {
    public final byte a;
    public final u0b b;

    public h0b(u0b u0bVar, byte b) {
        this.a = b;
        this.b = u0bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        u0b u0bVar = this.b;
        switch (b) {
            case 0:
                u0bVar.n1.f();
                return;
            case 1:
                u0bVar.n1.f();
                return;
            case 2:
                u0bVar.dismiss();
                hq6.d0(u0bVar.a).h2(u0bVar.getContext(), u0bVar.M1, 1, u0bVar.F1, false, false);
                return;
            case 3:
                na7.q1(u0bVar.a).A3("stickers", u0bVar.F1, 1, null);
                return;
            default:
                u0bVar.dismiss();
                hq6.d0(u0bVar.a).h2(u0bVar.getContext(), u0bVar.M1, 1, u0bVar.F1, false, false);
                return;
        }
    }
}
