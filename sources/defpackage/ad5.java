package defpackage;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class ad5 {
    public final long a;
    public final int b;

    public ad5(TLRPC.Message message) {
        long B0 = k27.B0(message);
        int i = message.id;
        this.a = B0;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ad5.class == obj.getClass()) {
            ad5 ad5Var = (ad5) obj;
            if (this.a == ad5Var.a && this.b == ad5Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
