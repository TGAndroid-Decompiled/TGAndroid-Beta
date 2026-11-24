package defpackage;
public class rq9 extends b2 implements cx2 {
    public final fw2 e;

    public rq9(fw2 fw2Var, sw2 sw2Var) {
        super(sw2Var, true);
        this.e = fw2Var;
    }

    @Override
    public final boolean A() {
        return true;
    }

    @Override
    public void f(Object obj) {
        r3c.c(dle.a(this.e), zsd.a(obj));
    }

    @Override
    public void g(Object obj) {
        this.e.resumeWith(zsd.a(obj));
    }

    @Override
    public final cx2 getCallerFrame() {
        fw2 fw2Var = this.e;
        if (fw2Var instanceof cx2) {
            return (cx2) fw2Var;
        }
        return null;
    }
}
