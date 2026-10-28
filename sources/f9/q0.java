package f9;
public final class q0 extends t0 {
    public final int d;
    public final r0 e;

    public q0(r0 r0Var, int i10) {
        this.d = i10;
        this.e = r0Var;
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.d) {
            case 0:
                if (!(obj instanceof o1)) {
                    return false;
                }
                o1 o1Var = (o1) obj;
                if (o1Var.a() <= 0) {
                    return false;
                }
                if (((y1) this.e).e.b(o1Var.f10313a) != o1Var.a()) {
                    return false;
                }
                return true;
            default:
                return ((y1) this.e).contains(obj);
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
    public final g2 r() {
        return h().listIterator(0);
    }

    @Override
    public final int size() {
        switch (this.d) {
            case 0:
                return this.e.s().size();
            default:
                return ((y1) this.e).e.f10321c;
        }
    }

    @Override
    public final i0 v() {
        return new u0(this);
    }
}
