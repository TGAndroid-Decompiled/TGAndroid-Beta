package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;
public final class ro {
    public final long f25193a;
    public final long f25194b;
    public final byte[] f25195c;

    public ro(long j10, String str, long j11) {
        this.f25193a = j10;
        this.f25194b = j11;
        this.f25195c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ro)) {
            return false;
        }
        ro roVar = (ro) obj;
        if (this.f25193a != roVar.f25193a || this.f25194b != roVar.f25194b || !Arrays.equals(this.f25195c, roVar.f25195c)) {
            return false;
        }
        return true;
    }

    public ro(long j10, long j11, byte[] bArr) {
        this.f25193a = j10;
        this.f25194b = j11;
        this.f25195c = bArr;
    }
}
