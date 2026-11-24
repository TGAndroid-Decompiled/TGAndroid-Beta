package defpackage;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class zsa {
    public final long a;
    public final int b;

    public zsa(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static zsa a(int i, long j) {
        return new zsa(j, i);
    }

    public static zsa b(k27 k27Var) {
        if (k27Var == null) {
            return null;
        }
        TLRPC.Message message = k27Var.k;
        if (message != null && ((message.isThreadMessage || k27Var.k3()) && k27Var.k.fwd_from != null)) {
            return new zsa(k27Var.Z0(), k27Var.k.fwd_from.saved_from_msg_id);
        }
        return new zsa(k27.B0(k27Var.k), k27Var.e1());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zsa) {
            zsa zsaVar = (zsa) obj;
            if (zsaVar.a == this.a && zsaVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
