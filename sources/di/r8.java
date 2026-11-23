package di;

import j$.util.Objects;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
public final class r8 {
    public final long f9699a;
    public final int f9700b;

    public r8(long j3, int i7) {
        this.f9699a = j3;
        this.f9700b = i7;
    }

    public static r8 a(int i7, long j3) {
        return new r8(j3, i7);
    }

    public static r8 b(gj gjVar) {
        if (gjVar == null) {
            return null;
        }
        TLRPC.Message message = gjVar.f24213k;
        if (message != null && ((message.isThreadMessage || gjVar.k3()) && gjVar.f24213k.fwd_from != null)) {
            return new r8(gjVar.Z0(), gjVar.f24213k.fwd_from.saved_from_msg_id);
        }
        return new r8(gj.B0(gjVar.f24213k), gjVar.e1());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r8) {
            r8 r8Var = (r8) obj;
            if (r8Var.f9699a == this.f9699a && r8Var.f9700b == this.f9700b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f9699a), Integer.valueOf(this.f9700b));
    }
}
