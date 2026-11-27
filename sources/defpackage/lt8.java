package defpackage;
public final class lt8 implements Runnable {
    public final byte a;
    public final au8 b;
    public final int c;

    public lt8(au8 au8Var, int i, byte b) {
        this.a = b;
        this.b = au8Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        au8 au8Var = this.b;
        switch (b) {
            case 0:
                au8Var.f.scrollBy(0, i);
                return;
            default:
                wa waVar = au8Var.f;
                if (waVar != null) {
                    waVar.setSpanCount(i);
                    return;
                }
                return;
        }
    }
}
