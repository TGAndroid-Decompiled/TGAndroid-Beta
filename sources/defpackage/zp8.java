package defpackage;
public final class zp8 implements Runnable {
    public final byte a;
    public final pq8 b;
    public final int c;

    public zp8(pq8 pq8Var, int i, byte b) {
        this.a = b;
        this.b = pq8Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        pq8 pq8Var = this.b;
        switch (b) {
            case 0:
                pq8Var.f.scrollBy(0, i);
                return;
            default:
                va vaVar = pq8Var.f;
                if (vaVar != null) {
                    vaVar.setSpanCount(i);
                    return;
                }
                return;
        }
    }
}
