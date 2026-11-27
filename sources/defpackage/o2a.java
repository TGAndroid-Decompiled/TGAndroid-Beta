package defpackage;
public final class o2a implements Runnable {
    public final byte a;
    public final t2a b;

    public o2a(t2a t2aVar, byte b) {
        this.a = b;
        this.b = t2aVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        t2a t2aVar = this.b;
        switch (b) {
            case 0:
                t2aVar.e1(true);
                return;
            case 1:
                t2aVar.j1(true, false);
                return;
            case 2:
                t2aVar.Z0();
                return;
            case 3:
                t2aVar.j1(true, false);
                return;
            case 4:
                t2aVar.j1(true, false);
                return;
            case 5:
                t2aVar.j1(true, false);
                return;
            case 6:
                t2aVar.Z1.clear();
                t2aVar.a2.clear();
                t2aVar.dismiss();
                return;
            default:
                t2aVar.dismiss();
                return;
        }
    }
}
