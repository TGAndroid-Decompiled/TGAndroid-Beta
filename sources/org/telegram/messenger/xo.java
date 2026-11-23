package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;
public final class xo {
    public final long f27909a;
    public final long f27910b;
    public final byte[] f27911c;

    public xo(long j3, String str, long j10) {
        this.f27909a = j3;
        this.f27910b = j10;
        this.f27911c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xo)) {
            return false;
        }
        xo xoVar = (xo) obj;
        if (this.f27909a != xoVar.f27909a || this.f27910b != xoVar.f27910b || !Arrays.equals(this.f27911c, xoVar.f27911c)) {
            return false;
        }
        return true;
    }

    public xo(long j3, long j10, byte[] bArr) {
        this.f27909a = j3;
        this.f27910b = j10;
        this.f27911c = bArr;
    }
}
