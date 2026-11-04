package ci;

import j$.util.Objects;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
public final class x8 {
    public final long f6364a;
    public final int f6365b;

    public x8(long j10, int i3) {
        this.f6364a = j10;
        this.f6365b = i3;
    }

    public static x8 a(int i3, long j10) {
        return new x8(j10, i3);
    }

    public static x8 b(zi ziVar) {
        if (ziVar == null) {
            return null;
        }
        TLRPC.Message message = ziVar.f26868k;
        if (message != null && ((message.isThreadMessage || ziVar.l3()) && ziVar.f26868k.fwd_from != null)) {
            return new x8(ziVar.Z0(), ziVar.f26868k.fwd_from.saved_from_msg_id);
        }
        return new x8(zi.B0(ziVar.f26868k), ziVar.f1());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x8) {
            x8 x8Var = (x8) obj;
            if (x8Var.f6364a == this.f6364a && x8Var.f6365b == this.f6365b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f6364a), Integer.valueOf(this.f6365b));
    }
}
