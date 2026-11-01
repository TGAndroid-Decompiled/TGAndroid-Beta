package org.telegram.messenger;

import android.util.Base64;
import java.util.Arrays;
public final class gp {
    public final long f15953a;
    public final long f15954b;
    public final byte[] f15955c;

    public gp(long j10, String str, long j11) {
        this.f15953a = j10;
        this.f15954b = j11;
        this.f15955c = Base64.decode(str, 8);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gp)) {
            return false;
        }
        gp gpVar = (gp) obj;
        if (this.f15953a != gpVar.f15953a || this.f15954b != gpVar.f15954b || !Arrays.equals(this.f15955c, gpVar.f15955c)) {
            return false;
        }
        return true;
    }

    public gp(long j10, long j11, byte[] bArr) {
        this.f15953a = j10;
        this.f15954b = j11;
        this.f15955c = bArr;
    }
}
