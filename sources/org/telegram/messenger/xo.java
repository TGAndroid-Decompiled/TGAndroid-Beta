package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;
public final class xo {
    public final long f27945a;
    public final long f27946b;
    public final byte[] f27947c;

    public xo(long j3, String str, long j10) {
        this.f27945a = j3;
        this.f27946b = j10;
        this.f27947c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xo)) {
            return false;
        }
        xo xoVar = (xo) obj;
        if (this.f27945a != xoVar.f27945a || this.f27946b != xoVar.f27946b || !Arrays.equals(this.f27947c, xoVar.f27947c)) {
            return false;
        }
        return true;
    }

    public xo(long j3, long j10, byte[] bArr) {
        this.f27945a = j3;
        this.f27946b = j10;
        this.f27947c = bArr;
    }
}
