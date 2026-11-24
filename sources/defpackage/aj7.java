package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class aj7 extends q3 {
    public final q3 e;
    public final lj4 f;

    public aj7(q3 q3Var, lj4 lj4Var) {
        q3Var.getClass();
        this.e = q3Var;
        this.f = lj4Var;
    }

    @Override
    public final void b() {
        this.e.b();
    }

    @Override
    public final Map d() {
        return new qk6(this.e.a(), new cj6(this, (byte) 13));
    }

    @Override
    public final Collection e() {
        return new p3(this, (byte) 0);
    }

    @Override
    public final Set f() {
        return this.e.j();
    }

    @Override
    public final Iterator h() {
        return new ju5(this.e.g().iterator(), new nk6(this.f));
    }

    @Override
    public final Collection i(Object obj) {
        return wpe.b((List) this.e.i(obj), new lk6(this.f, obj));
    }

    @Override
    public final boolean k(Object obj, Object obj2) {
        return i(obj).remove(obj2);
    }

    @Override
    public final int l() {
        return this.e.l();
    }
}
