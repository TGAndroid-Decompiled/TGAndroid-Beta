package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class ma {
    public final long f24003a;
    public final int f24004b;

    public ma(TLRPC.Message message) {
        long B0 = ij.B0(message);
        int i7 = message.f26977id;
        this.f24003a = B0;
        this.f24004b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ma.class == obj.getClass()) {
            ma maVar = (ma) obj;
            if (this.f24003a == maVar.f24003a && this.f24004b == maVar.f24004b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f24003a), Integer.valueOf(this.f24004b));
    }
}
