package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class gj7 extends r3 {
    public final r3 e;
    public final kj4 f;

    public gj7(r3 r3Var, kj4 kj4Var) {
        r3Var.getClass();
        this.e = r3Var;
        this.f = kj4Var;
    }

    @Override
    public final void b() {
        this.e.b();
    }

    @Override
    public final Map d() {
        return new sk6(this.e.a(), new bm6(this, (byte) 14));
    }

    @Override
    public final Collection e() {
        return new q3(this, (byte) 0);
    }

    @Override
    public final Set f() {
        return this.e.j();
    }

    @Override
    public final Iterator h() {
        return new nu5(this.e.g().iterator(), new pk6(this.f));
    }

    @Override
    public final Collection i(Object obj) {
        return ose.b((List) this.e.i(obj), new nk6(this.f, obj));
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
