package defpackage;
public class ss9 extends b2 implements my2 {
    public final px2 e;

    public ss9(px2 px2Var, cy2 cy2Var) {
        super(cy2Var, true);
        this.e = px2Var;
    }

    @Override
    public final boolean A() {
        return true;
    }

    @Override
    public void f(Object obj) {
        r5c.c(fne.a(this.e), cvd.a(obj));
    }

    @Override
    public void g(Object obj) {
        this.e.resumeWith(cvd.a(obj));
    }

    @Override
    public final my2 getCallerFrame() {
        px2 px2Var = this.e;
        if (px2Var instanceof my2) {
            return (my2) px2Var;
        }
        return null;
    }
}
