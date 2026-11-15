package di;

import j$.util.Objects;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
public final class n8 {
    public final long f9113a;
    public final int f9114b;

    public n8(long j3, int i7) {
        this.f9113a = j3;
        this.f9114b = i7;
    }

    public static n8 a(int i7, long j3) {
        return new n8(j3, i7);
    }

    public static n8 b(gj gjVar) {
        if (gjVar == null) {
            return null;
        }
        TLRPC.Message message = gjVar.f23819k;
        if (message != null && ((message.isThreadMessage || gjVar.k3()) && gjVar.f23819k.fwd_from != null)) {
            return new n8(gjVar.Z0(), gjVar.f23819k.fwd_from.saved_from_msg_id);
        }
        return new n8(gj.B0(gjVar.f23819k), gjVar.e1());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n8) {
            n8 n8Var = (n8) obj;
            if (n8Var.f9113a == this.f9113a && n8Var.f9114b == this.f9114b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f9113a), Integer.valueOf(this.f9114b));
    }
}
