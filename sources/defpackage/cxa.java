package defpackage;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class cxa {
    public final long a;
    public final int b;

    public cxa(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static cxa a(int i, long j) {
        return new cxa(j, i);
    }

    public static cxa b(r47 r47Var) {
        if (r47Var == null) {
            return null;
        }
        TLRPC.Message message = r47Var.k;
        if (message != null && ((message.isThreadMessage || r47Var.k3()) && r47Var.k.fwd_from != null)) {
            return new cxa(r47Var.Z0(), r47Var.k.fwd_from.saved_from_msg_id);
        }
        return new cxa(r47.B0(r47Var.k), r47Var.e1());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cxa) {
            cxa cxaVar = (cxa) obj;
            if (cxaVar.a == this.a && cxaVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Integer.valueOf(this.b));
    }
}
