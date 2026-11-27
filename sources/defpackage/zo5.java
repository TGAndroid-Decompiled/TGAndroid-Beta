package defpackage;

import j$.util.Collection;
import java.util.Arrays;
public abstract class zo5 extends jo5 implements Collection, java.util.Collection {
    public static final int d = 0;
    public transient j99 b;
    public transient bp5 c;

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof zo5) {
                zo5 zo5Var = (zo5) obj;
                p99 p99Var = (p99) this;
                if (p99Var.size() == zo5Var.size() && o().size() == zo5Var.o().size()) {
                    for (vq7 vq7Var : zo5Var.o()) {
                        if (p99Var.e.b(vq7Var.a) != vq7Var.a()) {
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
    public final po5 h() {
        j99 j99Var = this.b;
        if (j99Var == null) {
            po5 h = super.h();
            this.b = (j99) h;
            return h;
        }
        return j99Var;
    }

    @Override
    public final int hashCode() {
        return qye.c(o());
    }

    @Override
    public final int i(int i, Object[] objArr) {
        v9c n = o().n();
        while (n.hasNext()) {
            vq7 vq7Var = (vq7) n.next();
            Arrays.fill(objArr, i, vq7Var.a() + i, vq7Var.a);
            i += vq7Var.a();
        }
        return i;
    }

    @Override
    public final v9c iterator() {
        return new wo5(o().n());
    }

    public final bp5 o() {
        bp5 bp5Var = this.c;
        if (bp5Var == null) {
            if (isEmpty()) {
                bp5Var = q99.s;
            } else {
                bp5Var = new yo5(this, (byte) 0);
            }
            this.c = bp5Var;
        }
        return bp5Var;
    }

    @Override
    public final String toString() {
        return o().toString();
    }
}
