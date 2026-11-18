package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;
public final class wo {
    public final long f27747a;
    public final long f27748b;
    public final byte[] f27749c;

    public wo(long j3, String str, long j10) {
        this.f27747a = j3;
        this.f27748b = j10;
        this.f27749c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        if (this.f27747a != woVar.f27747a || this.f27748b != woVar.f27748b || !Arrays.equals(this.f27749c, woVar.f27749c)) {
            return false;
        }
        return true;
    }

    public wo(long j3, long j10, byte[] bArr) {
        this.f27747a = j3;
        this.f27748b = j10;
        this.f27749c = bArr;
    }
}
