package defpackage;

import java.util.Arrays;
public final class tqe {
    public final jqe a;
    public final Integer b;

    public tqe(v8b v8bVar) {
        this.a = (jqe) v8bVar.b;
        this.b = (Integer) v8bVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tqe)) {
            return false;
        }
        tqe tqeVar = (tqe) obj;
        if (cqe.a(this.a, tqeVar.a) && cqe.a(this.b, tqeVar.b) && cqe.a(null, null) && cqe.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
