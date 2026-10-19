package e9;
public final class v0 extends y0 {
    public final int d;
    public final w0 e;

    public v0(w0 w0Var, int i10) {
        this.d = i10;
        this.e = w0Var;
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                if (!(obj instanceof t1)) {
                    return false;
                }
                t1 t1Var = (t1) obj;
                if (t1Var.a() <= 0) {
                    return false;
                }
                if (((d2) this.e).e.b(t1Var.f8504a) != t1Var.a()) {
                    return false;
                }
                return true;
            default:
                return ((d2) this.e).contains(obj);
        }
    }

    @Override
    public int hashCode() {
        switch (this.d) {
            case 0:
                return this.e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override
    public final int m(int i10, Object[] objArr) {
        return h().m(i10, objArr);
    }

    @Override
    public final boolean q() {
        switch (this.d) {
            case 0:
                this.e.getClass();
                return false;
            default:
                return true;
        }
    }

    @Override
    public final m2 r() {
        return h().listIterator(0);
    }

    @Override
    public final int size() {
        switch (this.d) {
            case 0:
                return this.e.s().size();
            default:
                return ((d2) this.e).e.f8513c;
        }
    }

    @Override
    public final n0 v() {
        return new z0(this);
    }
}
