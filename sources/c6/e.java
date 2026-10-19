package c6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f4833a;
    public final d6.d0 f4834b;
    public final Bundle f4835c;
    public final String d = UUID.randomUUID().toString();

    public e(androidx.biometric.e eVar) {
        this.f4833a = (CastDevice) eVar.f2815b;
        this.f4834b = (d6.d0) eVar.f2816c;
        this.f4835c = (Bundle) eVar.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: c6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4833a, this.f4835c, 0, this.d});
    }
}
