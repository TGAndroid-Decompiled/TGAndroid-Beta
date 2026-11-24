package defpackage;
public final class vo5 extends yo5 {
    public final byte d;
    public final wo5 e;

    public vo5(wo5 wo5Var, byte b) {
        this.d = b;
        this.e = wo5Var;
    }

    @Override
    public final boolean contains(Object obj) {
        byte b = this.d;
        wo5 wo5Var = this.e;
        switch (b) {
            case 0:
                if (obj instanceof yp7) {
                    yp7 yp7Var = (yp7) obj;
                    if (yp7Var.a() > 0) {
                        if (((e89) wo5Var).e.b(yp7Var.a) == yp7Var.a()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return ((e89) wo5Var).contains(obj);
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
    public final v7c iterator() {
        return h().listIterator(0);
    }

    @Override
    public final mo5 r() {
        return new kp5(this);
    }

    @Override
    public final int size() {
        byte b = this.d;
        wo5 wo5Var = this.e;
        switch (b) {
            case 0:
                e89 e89Var = (e89) wo5Var;
                vo5 vo5Var = e89Var.h;
                if (vo5Var == null) {
                    vo5Var = new vo5(e89Var, (byte) 1);
                    e89Var.h = vo5Var;
                }
                return vo5Var.size();
            default:
                return ((e89) wo5Var).e.c;
        }
    }
}
