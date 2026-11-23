package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;
public final class wo {
    public final long f27839a;
    public final long f27840b;
    public final byte[] f27841c;

    public wo(long j3, String str, long j10) {
        this.f27839a = j3;
        this.f27840b = j10;
        this.f27841c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        if (this.f27839a != woVar.f27839a || this.f27840b != woVar.f27840b || !Arrays.equals(this.f27841c, woVar.f27841c)) {
            return false;
        }
        return true;
    }

    public wo(long j3, long j10, byte[] bArr) {
        this.f27839a = j3;
        this.f27840b = j10;
        this.f27841c = bArr;
    }
}
