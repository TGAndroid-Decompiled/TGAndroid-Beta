package bi;

import j$.util.Objects;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
public final class x9 {
    public final long f5040a;
    public final int f5041b;

    public x9(long j3, int i7) {
        this.f5040a = j3;
        this.f5041b = i7;
    }

    public static x9 a(int i7, long j3) {
        return new x9(j3, i7);
    }

    public static x9 b(ij ijVar) {
        if (ijVar == null) {
            return null;
        }
        TLRPC.Message message = ijVar.f23262k;
        if (message != null && ((message.isThreadMessage || ijVar.k3()) && ijVar.f23262k.fwd_from != null)) {
            return new x9(ijVar.Z0(), ijVar.f23262k.fwd_from.saved_from_msg_id);
        }
        return new x9(ij.B0(ijVar.f23262k), ijVar.e1());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x9) {
            x9 x9Var = (x9) obj;
            if (x9Var.f5040a == this.f5040a && x9Var.f5041b == this.f5041b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f5040a), Integer.valueOf(this.f5041b));
    }
}
