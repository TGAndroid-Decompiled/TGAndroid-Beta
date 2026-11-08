package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;
public final class ap {
    public final long f21500a;
    public final long f21501b;
    public final byte[] f21502c;

    public ap(long j3, String str, long j10) {
        this.f21500a = j3;
        this.f21501b = j10;
        this.f21502c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        if (this.f21500a != apVar.f21500a || this.f21501b != apVar.f21501b || !Arrays.equals(this.f21502c, apVar.f21502c)) {
            return false;
        }
        return true;
    }

    public ap(long j3, long j10, byte[] bArr) {
        this.f21500a = j3;
        this.f21501b = j10;
        this.f21502c = bArr;
    }
}
