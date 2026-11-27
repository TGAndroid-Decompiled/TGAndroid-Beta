package defpackage;
public final class f4b implements Runnable {
    public final byte a;
    public final s4b b;

    public f4b(s4b s4bVar, byte b) {
        this.a = b;
        this.b = s4bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        s4b s4bVar = this.b;
        switch (b) {
            case 0:
                s4bVar.n1.f();
                return;
            case 1:
                s4bVar.n1.f();
                return;
            case 2:
                s4bVar.dismiss();
                ls6.d0(s4bVar.a).h2(s4bVar.getContext(), s4bVar.M1, 1, s4bVar.F1, false, false);
                return;
            case 3:
                uc7.s1(s4bVar.a).H3("stickers", s4bVar.F1, 1, null);
                return;
            default:
                s4bVar.dismiss();
                ls6.d0(s4bVar.a).h2(s4bVar.getContext(), s4bVar.M1, 1, s4bVar.F1, false, false);
                return;
        }
    }
}
