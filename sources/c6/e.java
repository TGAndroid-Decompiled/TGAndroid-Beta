package c6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f4835a;
    public final d6.d0 f4836b;
    public final Bundle f4837c;
    public final String d = UUID.randomUUID().toString();

    public e(androidx.biometric.e eVar) {
        this.f4835a = (CastDevice) eVar.f2817b;
        this.f4836b = (d6.d0) eVar.f2818c;
        this.f4837c = (Bundle) eVar.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: c6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4835a, this.f4837c, 0, this.d});
    }
}
