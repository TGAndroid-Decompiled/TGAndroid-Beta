package defpackage;

import java.util.List;
public final class el8 implements y6a {
    public final String a;
    public final dl8 b;

    public el8(String str, dl8 dl8Var) {
        dl8Var.getClass();
        this.a = str;
        this.b = dl8Var;
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
    public final yve e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof el8) {
                el8 el8Var = (el8) obj;
                if (this.a.equals(el8Var.a) && rr5.a(this.b, el8Var.b)) {
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
        return n34.a;
    }

    @Override
    public final List h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override
    public final y6a i(int i) {
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
