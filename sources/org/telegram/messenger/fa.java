package org.telegram.messenger;

import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class fa {
    public final long f22472a;
    public final int f22473b;

    public fa(TLRPC.Message message) {
        long B0 = zi.B0(message);
        int i3 = message.f27022id;
        this.f22472a = B0;
        this.f22473b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fa.class == obj.getClass()) {
            fa faVar = (fa) obj;
            if (this.f22472a == faVar.f22472a && this.f22473b == faVar.f22473b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f22472a), Integer.valueOf(this.f22473b));
    }
}
