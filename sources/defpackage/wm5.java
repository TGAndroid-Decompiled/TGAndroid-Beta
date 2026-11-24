package defpackage;

import j$.util.Collection;
import java.util.Arrays;
public abstract class wm5 extends gm5 implements Collection, java.util.Collection {
    public static final int d = 0;
    public transient w59 b;
    public transient ym5 c;

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof wm5) {
                wm5 wm5Var = (wm5) obj;
                c69 c69Var = (c69) this;
                if (c69Var.size() == wm5Var.size() && o().size() == wm5Var.o().size()) {
                    for (vn7 vn7Var : wm5Var.o()) {
                        if (c69Var.e.b(vn7Var.a) != vn7Var.a()) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public final mm5 h() {
        w59 w59Var = this.b;
        if (w59Var == null) {
            mm5 h = super.h();
            this.b = (w59) h;
            return h;
        }
        return w59Var;
    }

    @Override
    public final int hashCode() {
        return yte.c(o());
    }

    @Override
    public final int i(int i, Object[] objArr) {
        v5c n = o().n();
        while (n.hasNext()) {
            vn7 vn7Var = (vn7) n.next();
            Arrays.fill(objArr, i, vn7Var.a() + i, vn7Var.a);
            i += vn7Var.a();
        }
        return i;
    }

    @Override
    public final v5c iterator() {
        return new tm5(o().n());
    }

    public final ym5 o() {
        ym5 ym5Var = this.c;
        if (ym5Var == null) {
            if (isEmpty()) {
                ym5Var = d69.s;
            } else {
                ym5Var = new vm5(this, (byte) 0);
            }
            this.c = ym5Var;
        }
        return ym5Var;
    }

    @Override
    public final String toString() {
        return o().toString();
    }
}
