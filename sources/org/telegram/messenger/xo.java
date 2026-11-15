package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;
public final class xo {
    public final long f27559a;
    public final long f27560b;
    public final byte[] f27561c;

    public xo(long j3, String str, long j10) {
        this.f27559a = j3;
        this.f27560b = j10;
        this.f27561c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xo)) {
            return false;
        }
        xo xoVar = (xo) obj;
        if (this.f27559a != xoVar.f27559a || this.f27560b != xoVar.f27560b || !Arrays.equals(this.f27561c, xoVar.f27561c)) {
            return false;
        }
        return true;
    }

    public xo(long j3, long j10, byte[] bArr) {
        this.f27559a = j3;
        this.f27560b = j10;
        this.f27561c = bArr;
    }
}
