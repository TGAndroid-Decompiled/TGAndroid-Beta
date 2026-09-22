package c6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f3976a;
    public final d6.d0 f3977b;
    public final Bundle f3978c;
    public final String d = UUID.randomUUID().toString();

    public e(aa.a aVar) {
        this.f3976a = (CastDevice) aVar.f356b;
        this.f3977b = (d6.d0) aVar.f357c;
        this.f3978c = (Bundle) aVar.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: c6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3976a, this.f3978c, 0, this.d});
    }
}
