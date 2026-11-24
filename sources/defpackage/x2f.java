package defpackage;

import java.util.Arrays;
public final class x2f {
    public final String a;
    public final String b;
    public final boolean c;

    public x2f(String str, String str2, boolean z) {
        fre.f(str);
        this.a = str;
        fre.f(str2);
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2f)) {
            return false;
        }
        x2f x2fVar = (x2f) obj;
        if (cqe.a(this.a, x2fVar.a) && cqe.a(this.b, x2fVar.b) && cqe.a(null, null) && this.c == x2fVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        fre.h(null);
        throw null;
    }
}
