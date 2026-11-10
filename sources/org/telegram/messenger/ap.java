package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;
public final class ap {
    public final long f21505a;
    public final long f21506b;
    public final byte[] f21507c;

    public ap(long j3, String str, long j10) {
        this.f21505a = j3;
        this.f21506b = j10;
        this.f21507c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        if (this.f21505a != apVar.f21505a || this.f21506b != apVar.f21506b || !Arrays.equals(this.f21507c, apVar.f21507c)) {
            return false;
        }
        return true;
    }

    public ap(long j3, long j10, byte[] bArr) {
        this.f21505a = j3;
        this.f21506b = j10;
        this.f21507c = bArr;
    }
}
