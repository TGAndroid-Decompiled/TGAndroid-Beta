package c6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f4462a;
    public final d6.d0 f4463b;
    public final Bundle f4464c;
    public final String d = UUID.randomUUID().toString();

    public e(androidx.biometric.e eVar) {
        this.f4462a = (CastDevice) eVar.f1196b;
        this.f4463b = (d6.d0) eVar.f1197c;
        this.f4464c = (Bundle) eVar.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: c6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4462a, this.f4464c, 0, this.d});
    }
}
