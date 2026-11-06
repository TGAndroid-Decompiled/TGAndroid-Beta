package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;
public final class ap {
    public final long f21484a;
    public final long f21485b;
    public final byte[] f21486c;

    public ap(long j3, String str, long j10) {
        this.f21484a = j3;
        this.f21485b = j10;
        this.f21486c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        if (this.f21484a != apVar.f21484a || this.f21485b != apVar.f21485b || !Arrays.equals(this.f21486c, apVar.f21486c)) {
            return false;
        }
        return true;
    }

    public ap(long j3, long j10, byte[] bArr) {
        this.f21484a = j3;
        this.f21485b = j10;
        this.f21486c = bArr;
    }
}
