package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class xg7 extends q3 {
    public final q3 e;
    public final gi3 f;

    public xg7(q3 q3Var, gi3 gi3Var) {
        q3Var.getClass();
        this.e = q3Var;
        this.f = gi3Var;
    }

    @Override
    public final void b() {
        this.e.b();
    }

    @Override
    public final Map d() {
        return new oi6(this.e.a(), new im6(this, (byte) 10));
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
        return new ks5(this.e.g().iterator(), new li6(this.f));
    }

    @Override
    public final Collection i(Object obj) {
        return tne.b((List) this.e.i(obj), new ji6(this.f, obj));
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
