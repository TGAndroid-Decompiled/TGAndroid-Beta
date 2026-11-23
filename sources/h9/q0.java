package h9;
public final class q0 extends t0 {
    public final int d;
    public final r0 f14040e;

    public q0(r0 r0Var, int i7) {
        this.d = i7;
        this.f14040e = r0Var;
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
                if (((y1) this.f14040e).f14085e.b(o1Var.f14026a) != o1Var.a()) {
                    return false;
                }
                return true;
            default:
                return ((y1) this.f14040e).contains(obj);
        }
    }

    @Override
    public int hashCode() {
        switch (this.d) {
            case 0:
                return this.f14040e.hashCode();
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
                this.f14040e.getClass();
                return false;
            default:
                return true;
        }
    }

    @Override
    public final g2 n() {
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
                return this.f14040e.o().size();
            default:
                return ((y1) this.f14040e).f14085e.f14034c;
        }
    }
}
