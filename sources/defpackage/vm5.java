package defpackage;
public final class vm5 extends ym5 {
    public final byte d;
    public final wm5 e;

    public vm5(wm5 wm5Var, byte b) {
        this.d = b;
        this.e = wm5Var;
    }

    @Override
    public final boolean contains(Object obj) {
        byte b = this.d;
        wm5 wm5Var = this.e;
        switch (b) {
            case 0:
                if (obj instanceof vn7) {
                    vn7 vn7Var = (vn7) obj;
                    if (vn7Var.a() > 0) {
                        if (((c69) wm5Var).e.b(vn7Var.a) == vn7Var.a()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return ((c69) wm5Var).contains(obj);
        }
    }

    @Override
    public final int hashCode() {
        switch (this.d) {
            case 0:
                return this.e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override
    public final int i(int i, Object[] objArr) {
        return h().i(i, objArr);
    }

    @Override
    public final boolean m() {
        switch (this.d) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override
    public final v5c iterator() {
        return h().listIterator(0);
    }

    @Override
    public final mm5 r() {
        return new kn5(this);
    }

    @Override
    public final int size() {
        byte b = this.d;
        wm5 wm5Var = this.e;
        switch (b) {
            case 0:
                c69 c69Var = (c69) wm5Var;
                vm5 vm5Var = c69Var.h;
                if (vm5Var == null) {
                    vm5Var = new vm5(c69Var, (byte) 1);
                    c69Var.h = vm5Var;
                }
                return vm5Var.size();
            default:
                return ((c69) wm5Var).e.c;
        }
    }
}
