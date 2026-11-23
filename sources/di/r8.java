package di;

import j$.util.Objects;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
public final class r8 {
    public final long f9660a;
    public final int f9661b;

    public r8(long j3, int i7) {
        this.f9660a = j3;
        this.f9661b = i7;
    }

    public static r8 a(int i7, long j3) {
        return new r8(j3, i7);
    }

    public static r8 b(fj fjVar) {
        if (fjVar == null) {
            return null;
        }
        TLRPC.Message message = fjVar.f24073k;
        if (message != null && ((message.isThreadMessage || fjVar.k3()) && fjVar.f24073k.fwd_from != null)) {
            return new r8(fjVar.Z0(), fjVar.f24073k.fwd_from.saved_from_msg_id);
        }
        return new r8(fj.B0(fjVar.f24073k), fjVar.e1());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r8) {
            r8 r8Var = (r8) obj;
            if (r8Var.f9660a == this.f9660a && r8Var.f9661b == this.f9661b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f9660a), Integer.valueOf(this.f9661b));
    }
}
