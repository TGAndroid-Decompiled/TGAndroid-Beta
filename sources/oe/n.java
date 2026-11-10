package oe;

import c8.v9;
import java.util.List;
public final class n implements me.d {
    public final String f20936a;
    public final me.c f20937b;

    public n(String str, me.c kind) {
        kotlin.jvm.internal.j.e(kind, "kind");
        this.f20936a = str;
        this.f20937b = kind;
    }

    @Override
    public final String a() {
        return this.f20936a;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int d(String name) {
        kotlin.jvm.internal.j.e(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override
    public final v9 e() {
        return this.f20937b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (kotlin.jvm.internal.j.a(this.f20936a, nVar.f20936a) && kotlin.jvm.internal.j.a(this.f20937b, nVar.f20937b)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final String g(int i7) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override
    public final List getAnnotations() {
        return hd.n.f14476a;
    }

    @Override
    public final List h(int i7) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f20937b.hashCode() * 31) + this.f20936a.hashCode();
    }

    @Override
    public final me.d i(int i7) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override
    public final boolean isInline() {
        return false;
    }

    @Override
    public final boolean j(int i7) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.f20936a + ')';
    }
}
