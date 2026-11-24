package defpackage;
public final class r7a implements Runnable {
    public final byte a;
    public final d8a b;

    public r7a(d8a d8aVar, byte b) {
        this.a = b;
        this.b = d8aVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        d8a d8aVar = this.b;
        switch (b) {
            case 0:
                d8aVar.b0();
                return;
            case 1:
                d01.t(d8aVar.getParentActivity(), k96.M0(2131752142, null));
                return;
            default:
                d8aVar.c.g3.O(true);
                return;
        }
    }
}
