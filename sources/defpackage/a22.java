package defpackage;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class a22 {
    public final int a;
    public final long b;

    public a22(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public static a22 a(Object obj) {
        if (obj instanceof nu2) {
            return new a22(2, ((nu2) obj).a);
        }
        if (obj instanceof TLRPC.User) {
            return new a22(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a22.class == obj.getClass()) {
                a22 a22Var = (a22) obj;
                if (this.b == a22Var.b && this.a == a22Var.a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(ug8.b(this.a), Long.valueOf(this.b));
    }
}
