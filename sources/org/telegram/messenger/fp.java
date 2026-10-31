package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;
public final class fp {
    public final long f15612a;
    public final long f15613b;
    public final byte[] f15614c;

    public fp(long j10, String str, long j11) {
        this.f15612a = j10;
        this.f15613b = j11;
        this.f15614c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fp)) {
            return false;
        }
        fp fpVar = (fp) obj;
        if (this.f15612a != fpVar.f15612a || this.f15613b != fpVar.f15613b || !Arrays.equals(this.f15614c, fpVar.f15614c)) {
            return false;
        }
        return true;
    }

    public fp(long j10, long j11, byte[] bArr) {
        this.f15612a = j10;
        this.f15613b = j11;
        this.f15614c = bArr;
    }
}
