package defpackage;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class m32 {
    public final int a;
    public final long b;

    public m32(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public static m32 a(Object obj) {
        if (obj instanceof yv2) {
            return new m32(2, ((yv2) obj).a);
        }
        if (obj instanceof TLRPC.User) {
            return new m32(1, ((TLRPC.User) obj).id);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && m32.class == obj.getClass()) {
                m32 m32Var = (m32) obj;
                if (this.b == m32Var.b && this.a == m32Var.a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(wi8.b(this.a), Long.valueOf(this.b));
    }
}
