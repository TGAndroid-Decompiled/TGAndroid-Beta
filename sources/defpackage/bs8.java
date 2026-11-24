package defpackage;
public final class bs8 implements Runnable {
    public final byte a;
    public final rs8 b;
    public final int c;

    public bs8(rs8 rs8Var, int i, byte b) {
        this.a = b;
        this.b = rs8Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        rs8 rs8Var = this.b;
        switch (b) {
            case 0:
                rs8Var.f.scrollBy(0, i);
                return;
            default:
                va vaVar = rs8Var.f;
                if (vaVar != null) {
                    vaVar.setSpanCount(i);
                    return;
                }
                return;
        }
    }
}
