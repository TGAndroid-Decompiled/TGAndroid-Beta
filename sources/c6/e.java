package c6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f4342a;
    public final d6.d0 f4343b;
    public final Bundle f4344c;
    public final String d = UUID.randomUUID().toString();

    public e(aa.a aVar) {
        this.f4342a = (CastDevice) aVar.f386b;
        this.f4343b = (d6.d0) aVar.f387c;
        this.f4344c = (Bundle) aVar.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: c6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4342a, this.f4344c, 0, this.d});
    }
}
