package c6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f4293a;
    public final d6.d0 f4294b;
    public final Bundle f4295c;
    public final String d = UUID.randomUUID().toString();

    public e(aa.a aVar) {
        this.f4293a = (CastDevice) aVar.f386b;
        this.f4294b = (d6.d0) aVar.f387c;
        this.f4295c = (Bundle) aVar.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: c6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4293a, this.f4295c, 0, this.d});
    }
}
