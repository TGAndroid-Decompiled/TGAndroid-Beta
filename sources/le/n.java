package le;

import b8.jd;
import java.util.List;
public final class n implements je.d {
    public final String f18209a;
    public final je.c f18210b;

    public n(String str, je.c kind) {
        kotlin.jvm.internal.j.e(kind, "kind");
        this.f18209a = str;
        this.f18210b = kind;
    }

    @Override
    public final String a() {
        return this.f18209a;
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
    public final jd e() {
        return this.f18210b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (kotlin.jvm.internal.j.a(this.f18209a, nVar.f18209a) && kotlin.jvm.internal.j.a(this.f18210b, nVar.f18210b)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final String g(int i3) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override
    public final List getAnnotations() {
        return ed.o.f9953a;
    }

    @Override
    public final List h(int i3) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f18210b.hashCode() * 31) + this.f18209a.hashCode();
    }

    @Override
    public final je.d i(int i3) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override
    public final boolean isInline() {
        return false;
    }

    @Override
    public final boolean j(int i3) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.f18209a + ')';
    }
}
