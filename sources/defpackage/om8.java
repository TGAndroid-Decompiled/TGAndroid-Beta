package defpackage;

import java.util.List;
public final class om8 implements o8a {
    public final String a;
    public final nm8 b;

    public om8(String str, nm8 nm8Var) {
        nm8Var.getClass();
        this.a = str;
        this.b = nm8Var;
    }

    @Override
    public final String a() {
        return this.a;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int d(String str) {
        str.getClass();
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override
    public final nye e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof om8) {
                om8 om8Var = (om8) obj;
                if (this.a.equals(om8Var.a) && ur5.a(this.b, om8Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final String g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override
    public final List getAnnotations() {
        return x24.a;
    }

    @Override
    public final List h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override
    public final o8a i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.a + ')';
    }
}
