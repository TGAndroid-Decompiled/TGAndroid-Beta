package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class ma {
    public final long f24007a;
    public final int f24008b;

    public ma(TLRPC.Message message) {
        long B0 = ij.B0(message);
        int i7 = message.f26981id;
        this.f24007a = B0;
        this.f24008b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ma.class == obj.getClass()) {
            ma maVar = (ma) obj;
            if (this.f24007a == maVar.f24007a && this.f24008b == maVar.f24008b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f24007a), Integer.valueOf(this.f24008b));
    }
}
