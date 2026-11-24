package defpackage;

import j$.util.Collection;
import java.util.Arrays;
public abstract class wo5 extends go5 implements Collection, java.util.Collection {
    public static final int d = 0;
    public transient y79 b;
    public transient yo5 c;

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof wo5) {
                wo5 wo5Var = (wo5) obj;
                e89 e89Var = (e89) this;
                if (e89Var.size() == wo5Var.size() && o().size() == wo5Var.o().size()) {
                    for (yp7 yp7Var : wo5Var.o()) {
                        if (e89Var.e.b(yp7Var.a) != yp7Var.a()) {
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
    public final mo5 h() {
        y79 y79Var = this.b;
        if (y79Var == null) {
            mo5 h = super.h();
            this.b = (y79) h;
            return h;
        }
        return y79Var;
    }

    @Override
    public final int hashCode() {
        return bwe.c(o());
    }

    @Override
    public final int i(int i, Object[] objArr) {
        v7c n = o().n();
        while (n.hasNext()) {
            yp7 yp7Var = (yp7) n.next();
            Arrays.fill(objArr, i, yp7Var.a() + i, yp7Var.a);
            i += yp7Var.a();
        }
        return i;
    }

    @Override
    public final v7c iterator() {
        return new to5(o().n());
    }

    public final yo5 o() {
        yo5 yo5Var = this.c;
        if (yo5Var == null) {
            if (isEmpty()) {
                yo5Var = f89.s;
            } else {
                yo5Var = new vo5(this, (byte) 0);
            }
            this.c = yo5Var;
        }
        return yo5Var;
    }

    @Override
    public final String toString() {
        return o().toString();
    }
}
