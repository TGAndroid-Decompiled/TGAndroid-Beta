package defpackage;

import java.util.List;
public final class bj8 implements w4a {
    public final String a;
    public final aj8 b;

    public bj8(String str, aj8 aj8Var) {
        aj8Var.getClass();
        this.a = str;
        this.b = aj8Var;
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
    public final vte e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bj8) {
                bj8 bj8Var = (bj8) obj;
                if (this.a.equals(bj8Var.a) && rp5.a(this.b, bj8Var.b)) {
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
        return c24.a;
    }

    @Override
    public final List h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override
    public final w4a i(int i) {
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
