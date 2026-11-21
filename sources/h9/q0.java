package h9;
public final class q0 extends t0 {
    public final int d;
    public final r0 f14073e;

    public q0(r0 r0Var, int i7) {
        this.d = i7;
        this.f14073e = r0Var;
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                if (!(obj instanceof p1)) {
                    return false;
                }
                p1 p1Var = (p1) obj;
                if (p1Var.a() <= 0) {
                    return false;
                }
                if (((z1) this.f14073e).f14126e.b(p1Var.f14068a) != p1Var.a()) {
                    return false;
                }
                return true;
            default:
                return ((z1) this.f14073e).contains(obj);
        }
    }

    @Override
    public int hashCode() {
        switch (this.d) {
            case 0:
                return this.f14073e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override
    public final int i(int i7, Object[] objArr) {
        return f().i(i7, objArr);
    }

    @Override
    public final boolean m() {
        switch (this.d) {
            case 0:
                this.f14073e.getClass();
                return false;
            default:
                return true;
        }
    }

    @Override
    public final h2 n() {
        return f().listIterator(0);
    }

    @Override
    public final i0 r() {
        return new u0(this);
    }

    @Override
    public final int size() {
        switch (this.d) {
            case 0:
                return this.f14073e.o().size();
            default:
                return ((z1) this.f14073e).f14126e.f14076c;
        }
    }
}
