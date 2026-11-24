package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
public final class x4a implements w4a, p71 {
    public final w4a a;
    public final String b;
    public final Set c;

    public x4a(w4a w4aVar) {
        Set set;
        w4aVar.getClass();
        this.a = w4aVar;
        this.b = w4aVar.a() + '?';
        if (w4aVar instanceof p71) {
            set = ((p71) w4aVar).b();
        } else {
            HashSet hashSet = new HashSet(w4aVar.f());
            int f = w4aVar.f();
            for (int i = 0; i < f; i++) {
                hashSet.add(w4aVar.g(i));
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
    public final vte e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4a)) {
            return false;
        }
        if (rp5.a(this.a, ((x4a) obj).a)) {
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
    public final w4a i(int i) {
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
