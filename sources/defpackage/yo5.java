package defpackage;
public final class yo5 extends bp5 {
    public final byte d;
    public final zo5 e;

    public yo5(zo5 zo5Var, byte b) {
        this.d = b;
        this.e = zo5Var;
    }

    @Override
    public final boolean contains(Object obj) {
        byte b = this.d;
        zo5 zo5Var = this.e;
        switch (b) {
            case 0:
                if (obj instanceof vq7) {
                    vq7 vq7Var = (vq7) obj;
                    if (vq7Var.a() > 0) {
                        if (((p99) zo5Var).e.b(vq7Var.a) == vq7Var.a()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return ((p99) zo5Var).contains(obj);
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
    public final v9c iterator() {
        return h().listIterator(0);
    }

    @Override
    public final po5 r() {
        return new np5(this);
    }

    @Override
    public final int size() {
        byte b = this.d;
        zo5 zo5Var = this.e;
        switch (b) {
            case 0:
                p99 p99Var = (p99) zo5Var;
                yo5 yo5Var = p99Var.h;
                if (yo5Var == null) {
                    yo5Var = new yo5(p99Var, (byte) 1);
                    p99Var.h = yo5Var;
                }
                return yo5Var.size();
            default:
                return ((p99) zo5Var).e.c;
        }
    }
}
