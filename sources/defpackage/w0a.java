package defpackage;
public final class w0a implements Runnable {
    public final byte a;
    public final b1a b;

    public w0a(b1a b1aVar, byte b) {
        this.a = b;
        this.b = b1aVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        b1a b1aVar = this.b;
        switch (b) {
            case 0:
                b1aVar.d1(true);
                return;
            case 1:
                b1aVar.i1(true, false);
                return;
            case 2:
                b1aVar.Y0();
                return;
            case 3:
                b1aVar.i1(true, false);
                return;
            case 4:
                b1aVar.i1(true, false);
                return;
            case 5:
                b1aVar.i1(true, false);
                return;
            case 6:
                b1aVar.Z1.clear();
                b1aVar.a2.clear();
                b1aVar.dismiss();
                return;
            default:
                b1aVar.dismiss();
                return;
        }
    }
}
