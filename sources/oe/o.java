package oe;

import c8.w9;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public final class o implements me.d, b {
    public final me.d f21844a;
    public final String f21845b;
    public final Set f21846c;

    public o(me.d original) {
        Set set;
        kotlin.jvm.internal.j.e(original, "original");
        this.f21844a = original;
        this.f21845b = original.a() + '?';
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
        this.f21846c = set;
    }

    @Override
    public final String a() {
        return this.f21845b;
    }

    @Override
    public final Set b() {
        return this.f21846c;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final int d(String name) {
        kotlin.jvm.internal.j.e(name, "name");
        return this.f21844a.d(name);
    }

    @Override
    public final w9 e() {
        return this.f21844a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        if (kotlin.jvm.internal.j.a(this.f21844a, ((o) obj).f21844a)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f() {
        return this.f21844a.f();
    }

    @Override
    public final String g(int i7) {
        return this.f21844a.g(i7);
    }

    @Override
    public final List getAnnotations() {
        return this.f21844a.getAnnotations();
    }

    @Override
    public final List h(int i7) {
        return this.f21844a.h(i7);
    }

    public final int hashCode() {
        return this.f21844a.hashCode() * 31;
    }

    @Override
    public final me.d i(int i7) {
        return this.f21844a.i(i7);
    }

    @Override
    public final boolean isInline() {
        return this.f21844a.isInline();
    }

    @Override
    public final boolean j(int i7) {
        return this.f21844a.j(i7);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21844a);
        sb2.append('?');
        return sb2.toString();
    }
}
