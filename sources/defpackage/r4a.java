package defpackage;
public final class r4a implements Runnable {
    public final byte a;
    public final a5a b;

    public r4a(a5a a5aVar, byte b) {
        this.a = b;
        this.b = a5aVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        a5a a5aVar = this.b;
        switch (b) {
            case 0:
                a5aVar.b1(false);
                return;
            case 1:
                a5aVar.b1(true);
                return;
            case 2:
                wua wuaVar = new wua(a5aVar.getContext(), a5aVar.T1, a5aVar.U1, a5aVar.J0, null);
                long j = a5aVar.X1.id;
                String str = a5aVar.a2;
                wuaVar.l3 = true;
                jxa.v(wuaVar.a, false).H(j, new ku9(wuaVar, str, (byte) 8));
                return;
            case 3:
                fz.c1(a5aVar.J0, a5aVar.getContext(), a5aVar.X1);
                return;
            case 4:
                new eza(a5aVar.getContext(), a5aVar.J0).show();
                return;
            default:
                a5aVar.dismiss();
                return;
        }
    }
}
