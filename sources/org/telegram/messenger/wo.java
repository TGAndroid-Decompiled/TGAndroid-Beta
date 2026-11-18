package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;
public final class wo {
    public final long f27745a;
    public final long f27746b;
    public final byte[] f27747c;

    public wo(long j3, String str, long j10) {
        this.f27745a = j3;
        this.f27746b = j10;
        this.f27747c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        if (this.f27745a != woVar.f27745a || this.f27746b != woVar.f27746b || !Arrays.equals(this.f27747c, woVar.f27747c)) {
            return false;
        }
        return true;
    }

    public wo(long j3, long j10, byte[] bArr) {
        this.f27745a = j3;
        this.f27746b = j10;
        this.f27747c = bArr;
    }
}
