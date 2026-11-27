package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
public final class p8a implements o8a, x71 {
    public final o8a a;
    public final String b;
    public final Set c;

    public p8a(o8a o8aVar) {
        Set set;
        o8aVar.getClass();
        this.a = o8aVar;
        this.b = o8aVar.a() + '?';
        if (o8aVar instanceof x71) {
            set = ((x71) o8aVar).b();
        } else {
            HashSet hashSet = new HashSet(o8aVar.f());
            int f = o8aVar.f();
            for (int i = 0; i < f; i++) {
                hashSet.add(o8aVar.g(i));
            }
            set = hashSet;
        }
        this.c = set;
    }

    @Override
    public final String a() {
        return this.b;
    }

    @Override
    public final Set b() {
        return this.c;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override
    public final nye e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8a)) {
            return false;
        }
        if (ur5.a(this.a, ((p8a) obj).a)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f() {
        return this.a.f();
    }

    @Override
    public final String g(int i) {
        return this.a.g(i);
    }

    @Override
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override
    public final List h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override
    public final o8a i(int i) {
        return this.a.i(i);
    }

    @Override
    public final boolean isInline() {
        return this.a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
