package defpackage;
public final class vq7 implements mt8 {
    public static final fi7 c = new fi7((byte) 6);
    public static final cq2 d = new cq2((byte) 6);
    public yc3 a;
    public volatile mt8 b;

    public vq7(fi7 fi7Var, mt8 mt8Var) {
        this.a = fi7Var;
        this.b = mt8Var;
    }

    public final void a(yc3 yc3Var) {
        mt8 mt8Var;
        mt8 mt8Var2;
        mt8 mt8Var3 = this.b;
        cq2 cq2Var = d;
        if (mt8Var3 != cq2Var) {
            yc3Var.h(mt8Var3);
            return;
        }
        synchronized (this) {
            mt8Var = this.b;
            if (mt8Var != cq2Var) {
                mt8Var2 = mt8Var;
            } else {
                this.a = new dx6(this.a, yc3Var, (byte) 6);
                mt8Var2 = null;
            }
        }
        if (mt8Var2 != null) {
            yc3Var.h(mt8Var);
        }
    }

    @Override
    public final Object get() {
        return this.b.get();
    }
}
