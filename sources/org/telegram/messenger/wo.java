package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;
public final class wo {
    public final long f27773a;
    public final long f27774b;
    public final byte[] f27775c;

    public wo(long j3, String str, long j10) {
        this.f27773a = j3;
        this.f27774b = j10;
        this.f27775c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        if (this.f27773a != woVar.f27773a || this.f27774b != woVar.f27774b || !Arrays.equals(this.f27775c, woVar.f27775c)) {
            return false;
        }
        return true;
    }

    public wo(long j3, long j10, byte[] bArr) {
        this.f27773a = j3;
        this.f27774b = j10;
        this.f27775c = bArr;
    }
}
