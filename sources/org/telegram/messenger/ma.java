package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class ma {
    public final long f23997a;
    public final int f23998b;

    public ma(TLRPC.Message message) {
        long B0 = ij.B0(message);
        int i7 = message.f26974id;
        this.f23997a = B0;
        this.f23998b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ma.class == obj.getClass()) {
            ma maVar = (ma) obj;
            if (this.f23997a == maVar.f23997a && this.f23998b == maVar.f23998b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f23997a), Integer.valueOf(this.f23998b));
    }
}
