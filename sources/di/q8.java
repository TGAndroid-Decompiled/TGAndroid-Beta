package di;

import j$.util.Objects;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
public final class q8 {
    public final long f9599a;
    public final int f9600b;

    public q8(long j3, int i7) {
        this.f9599a = j3;
        this.f9600b = i7;
    }

    public static q8 a(int i7, long j3) {
        return new q8(j3, i7);
    }

    public static q8 b(fj fjVar) {
        if (fjVar == null) {
            return null;
        }
        TLRPC.Message message = fjVar.f23968k;
        if (message != null && ((message.isThreadMessage || fjVar.k3()) && fjVar.f23968k.fwd_from != null)) {
            return new q8(fjVar.Z0(), fjVar.f23968k.fwd_from.saved_from_msg_id);
        }
        return new q8(fj.B0(fjVar.f23968k), fjVar.e1());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q8) {
            q8 q8Var = (q8) obj;
            if (q8Var.f9599a == this.f9599a && q8Var.f9600b == this.f9600b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f9599a), Integer.valueOf(this.f9600b));
    }
}
