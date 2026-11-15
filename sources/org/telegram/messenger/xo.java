package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;
public final class xo {
    public final long f27560a;
    public final long f27561b;
    public final byte[] f27562c;

    public xo(long j3, String str, long j10) {
        this.f27560a = j3;
        this.f27561b = j10;
        this.f27562c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xo)) {
            return false;
        }
        xo xoVar = (xo) obj;
        if (this.f27560a != xoVar.f27560a || this.f27561b != xoVar.f27561b || !Arrays.equals(this.f27562c, xoVar.f27562c)) {
            return false;
        }
        return true;
    }

    public xo(long j3, long j10, byte[] bArr) {
        this.f27560a = j3;
        this.f27561b = j10;
        this.f27562c = bArr;
    }
}
