package defpackage;

import java.util.Arrays;
public final class p3f {
    public final m3f a;
    public final Integer b;

    public p3f(aec aecVar) {
        this.a = (m3f) aecVar.b;
        this.b = (Integer) aecVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p3f)) {
            return false;
        }
        p3f p3fVar = (p3f) obj;
        if (cqe.a(this.a, p3fVar.a) && cqe.a(this.b, p3fVar.b) && cqe.a(null, null) && cqe.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
