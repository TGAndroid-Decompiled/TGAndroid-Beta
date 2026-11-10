package bi;

import j$.util.Objects;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
public final class x9 {
    public final long f5045a;
    public final int f5046b;

    public x9(long j3, int i7) {
        this.f5045a = j3;
        this.f5046b = i7;
    }

    public static x9 a(int i7, long j3) {
        return new x9(j3, i7);
    }

    public static x9 b(ij ijVar) {
        if (ijVar == null) {
            return null;
        }
        TLRPC.Message message = ijVar.f23266k;
        if (message != null && ((message.isThreadMessage || ijVar.k3()) && ijVar.f23266k.fwd_from != null)) {
            return new x9(ijVar.Z0(), ijVar.f23266k.fwd_from.saved_from_msg_id);
        }
        return new x9(ij.B0(ijVar.f23266k), ijVar.e1());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x9) {
            x9 x9Var = (x9) obj;
            if (x9Var.f5045a == this.f5045a && x9Var.f5046b == this.f5046b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f5045a), Integer.valueOf(this.f5046b));
    }
}
