package defpackage;

import java.util.Arrays;
public final class z4f {
    public final String a;
    public final String b;
    public final boolean c;

    public z4f(String str, String str2, boolean z) {
        ite.f(str);
        this.a = str;
        ite.f(str2);
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4f)) {
            return false;
        }
        z4f z4fVar = (z4f) obj;
        if (fse.a(this.a, z4fVar.a) && fse.a(this.b, z4fVar.b) && fse.a(null, null) && this.c == z4fVar.c) {
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
        ite.h(null);
        throw null;
    }
}
