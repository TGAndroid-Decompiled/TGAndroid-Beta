package oe;

import c8.v9;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public final class o implements me.d, b {
    public final me.d f20938a;
    public final String f20939b;
    public final Set f20940c;

    public o(me.d original) {
        Set set;
        kotlin.jvm.internal.j.e(original, "original");
        this.f20938a = original;
        this.f20939b = original.a() + '?';
        kotlin.jvm.internal.j.e(original, "<this>");
        if (original instanceof b) {
            set = ((b) original).b();
        } else {
            HashSet hashSet = new HashSet(original.f());
            int f10 = original.f();
            for (int i7 = 0; i7 < f10; i7++) {
                hashSet.add(original.g(i7));
            }
            set = hashSet;
        }
        this.f20940c = set;
    }

    @Override
    public final String a() {
        return this.f20939b;
    }

    @Override
    public final Set b() {
        return this.f20940c;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final int d(String name) {
        kotlin.jvm.internal.j.e(name, "name");
        return this.f20938a.d(name);
    }

    @Override
    public final v9 e() {
        return this.f20938a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        if (kotlin.jvm.internal.j.a(this.f20938a, ((o) obj).f20938a)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f() {
        return this.f20938a.f();
    }

    @Override
    public final String g(int i7) {
        return this.f20938a.g(i7);
    }

    @Override
    public final List getAnnotations() {
        return this.f20938a.getAnnotations();
    }

    @Override
    public final List h(int i7) {
        return this.f20938a.h(i7);
    }

    public final int hashCode() {
        return this.f20938a.hashCode() * 31;
    }

    @Override
    public final me.d i(int i7) {
        return this.f20938a.i(i7);
    }

    @Override
    public final boolean isInline() {
        return this.f20938a.isInline();
    }

    @Override
    public final boolean j(int i7) {
        return this.f20938a.j(i7);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20938a);
        sb2.append('?');
        return sb2.toString();
    }
}
