package le;

import b8.jd;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public final class o implements je.d, b {
    public final je.d f18211a;
    public final String f18212b;
    public final Set f18213c;

    public o(je.d original) {
        Set set;
        kotlin.jvm.internal.j.e(original, "original");
        this.f18211a = original;
        this.f18212b = original.a() + '?';
        kotlin.jvm.internal.j.e(original, "<this>");
        if (original instanceof b) {
            set = ((b) original).b();
        } else {
            HashSet hashSet = new HashSet(original.f());
            int f10 = original.f();
            for (int i3 = 0; i3 < f10; i3++) {
                hashSet.add(original.g(i3));
            }
            set = hashSet;
        }
        this.f18213c = set;
    }

    @Override
    public final String a() {
        return this.f18212b;
    }

    @Override
    public final Set b() {
        return this.f18213c;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final int d(String name) {
        kotlin.jvm.internal.j.e(name, "name");
        return this.f18211a.d(name);
    }

    @Override
    public final jd e() {
        return this.f18211a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        if (kotlin.jvm.internal.j.a(this.f18211a, ((o) obj).f18211a)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f() {
        return this.f18211a.f();
    }

    @Override
    public final String g(int i3) {
        return this.f18211a.g(i3);
    }

    @Override
    public final List getAnnotations() {
        return this.f18211a.getAnnotations();
    }

    @Override
    public final List h(int i3) {
        return this.f18211a.h(i3);
    }

    public final int hashCode() {
        return this.f18211a.hashCode() * 31;
    }

    @Override
    public final je.d i(int i3) {
        return this.f18211a.i(i3);
    }

    @Override
    public final boolean isInline() {
        return this.f18211a.isInline();
    }

    @Override
    public final boolean j(int i3) {
        return this.f18211a.j(i3);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18211a);
        sb2.append('?');
        return sb2.toString();
    }
}
