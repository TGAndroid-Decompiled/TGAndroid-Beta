package g9;
public final class q0 extends t0 {
    public final int d;
    public final r0 f12128e;

    public q0(r0 r0Var, int i3) {
        this.d = i3;
        this.f12128e = r0Var;
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
                if (((y1) this.f12128e).f12173e.b(o1Var.f12114a) != o1Var.a()) {
                    return false;
                }
                return true;
            default:
                return ((y1) this.f12128e).contains(obj);
        }
    }

    @Override
    public int hashCode() {
        switch (this.d) {
            case 0:
                return this.f12128e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override
    public final int i(int i3, Object[] objArr) {
        return h().i(i3, objArr);
    }

    @Override
    public final boolean m() {
        switch (this.d) {
            case 0:
                this.f12128e.getClass();
                return false;
            default:
                return true;
        }
    }

    @Override
    public final g2 n() {
        return h().listIterator(0);
    }

    @Override
    public final i0 r() {
        return new u0(this);
    }

    @Override
    public final int size() {
        switch (this.d) {
            case 0:
                return this.f12128e.o().size();
            default:
                return ((y1) this.f12128e).f12173e.f12122c;
        }
    }
}
