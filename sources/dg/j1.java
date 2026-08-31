package dg;
public final class j1 implements Runnable {
    public final int f4567a;
    public final k1 f4568b;

    public j1(k1 k1Var, int i10) {
        this.f4567a = i10;
        this.f4568b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f4567a) {
            case 0:
                m1 m1Var = this.f4568b.f4575b.d;
                if (m1Var != null) {
                    m1Var.postRunnable(m1Var.f4613w);
                    return;
                }
                return;
            case 1:
                m1 m1Var2 = this.f4568b.f4575b.d;
                if (m1Var2 != null) {
                    m1Var2.postRunnable(m1Var2.f4613w);
                    return;
                }
                return;
            default:
                o1 o1Var = this.f4568b.f4575b;
                m1 m1Var3 = o1Var.d;
                m1Var3.getClass();
                m1Var3.postRunnable(new l1(m1Var3, 2));
                o1Var.d = null;
                return;
        }
    }
}
