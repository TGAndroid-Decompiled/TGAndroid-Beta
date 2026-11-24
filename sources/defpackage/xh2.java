package defpackage;
public final class xh2 implements Runnable {
    public final byte a;
    public final yh2 b;

    public xh2(yh2 yh2Var, byte b) {
        this.a = b;
        this.b = yh2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yh2 yh2Var = this.b;
        switch (b) {
            case 0:
                va vaVar = yh2Var.a;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                    return;
                }
                return;
            default:
                va vaVar2 = yh2Var.a;
                if (vaVar2 != null) {
                    vaVar2.g3.O(true);
                    return;
                }
                return;
        }
    }
}
