package defpackage;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class cva {
    public final long a;
    public final int b;

    public cva(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static cva a(int i, long j) {
        return new cva(j, i);
    }

    public static cva b(k47 k47Var) {
        if (k47Var == null) {
            return null;
        }
        TLRPC.Message message = k47Var.k;
        if (message != null && ((message.isThreadMessage || k47Var.k3()) && k47Var.k.fwd_from != null)) {
            return new cva(k47Var.Z0(), k47Var.k.fwd_from.saved_from_msg_id);
        }
        return new cva(k47.B0(k47Var.k), k47Var.e1());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cva) {
            cva cvaVar = (cva) obj;
            if (cvaVar.a == this.a && cvaVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
