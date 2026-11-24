package defpackage;

import java.util.Arrays;
public final class r5f {
    public final o5f a;
    public final Integer b;

    public r5f(rhb rhbVar) {
        this.a = (o5f) rhbVar.b;
        this.b = (Integer) rhbVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r5f)) {
            return false;
        }
        r5f r5fVar = (r5f) obj;
        if (fse.a(this.a, r5fVar.a) && fse.a(this.b, r5fVar.b) && fse.a(null, null) && fse.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
