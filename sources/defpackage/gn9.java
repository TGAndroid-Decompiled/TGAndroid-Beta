package defpackage;
public final class gn9 {
    public final byte a;
    public final pq8 b;

    public gn9(pq8 pq8Var, byte b) {
        this.a = b;
        this.b = pq8Var;
    }

    public final void a(Exception exc) {
        byte b = this.a;
        pq8 pq8Var = this.b;
        switch (b) {
            case 0:
                ((jp9) pq8Var.b).i.post(new zo9(pq8Var, exc, (byte) 0));
                return;
            default:
                ((jp9) pq8Var.b).i.post(new zo9(pq8Var, exc, (byte) 1));
                return;
        }
    }
}
