package oe;

import c8.u9;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public final class o implements me.d, b {
    public final me.d f21456a;
    public final String f21457b;
    public final Set f21458c;

    public o(me.d original) {
        Set set;
        kotlin.jvm.internal.j.e(original, "original");
        this.f21456a = original;
        this.f21457b = original.a() + '?';
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
        this.f21458c = set;
    }

    @Override
    public final String a() {
        return this.f21457b;
    }

    @Override
    public final Set b() {
        return this.f21458c;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final int d(String name) {
        kotlin.jvm.internal.j.e(name, "name");
        return this.f21456a.d(name);
    }

    @Override
    public final u9 e() {
        return this.f21456a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        if (kotlin.jvm.internal.j.a(this.f21456a, ((o) obj).f21456a)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f() {
        return this.f21456a.f();
    }

    @Override
    public final String g(int i7) {
        return this.f21456a.g(i7);
    }

    @Override
    public final List getAnnotations() {
        return this.f21456a.getAnnotations();
    }

    @Override
    public final List h(int i7) {
        return this.f21456a.h(i7);
    }

    public final int hashCode() {
        return this.f21456a.hashCode() * 31;
    }

    @Override
    public final me.d i(int i7) {
        return this.f21456a.i(i7);
    }

    @Override
    public final boolean isInline() {
        return this.f21456a.isInline();
    }

    @Override
    public final boolean j(int i7) {
        return this.f21456a.j(i7);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21456a);
        sb2.append('?');
        return sb2.toString();
    }
}
