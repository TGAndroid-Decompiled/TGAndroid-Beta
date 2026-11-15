package di;

import j$.util.Objects;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
public final class o8 {
    public final long f9181a;
    public final int f9182b;

    public o8(long j3, int i7) {
        this.f9181a = j3;
        this.f9182b = i7;
    }

    public static o8 a(int i7, long j3) {
        return new o8(j3, i7);
    }

    public static o8 b(gj gjVar) {
        if (gjVar == null) {
            return null;
        }
        TLRPC.Message message = gjVar.f23817k;
        if (message != null && ((message.isThreadMessage || gjVar.k3()) && gjVar.f23817k.fwd_from != null)) {
            return new o8(gjVar.Z0(), gjVar.f23817k.fwd_from.saved_from_msg_id);
        }
        return new o8(gj.B0(gjVar.f23817k), gjVar.e1());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o8) {
            o8 o8Var = (o8) obj;
            if (o8Var.f9181a == this.f9181a && o8Var.f9182b == this.f9182b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f9181a), Integer.valueOf(this.f9182b));
    }
}
