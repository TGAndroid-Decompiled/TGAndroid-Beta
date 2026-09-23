package c6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f3969a;
    public final d6.d0 f3970b;
    public final Bundle f3971c;
    public final String d = UUID.randomUUID().toString();

    public e(aa.a aVar) {
        this.f3969a = (CastDevice) aVar.f359b;
        this.f3970b = (d6.d0) aVar.f360c;
        this.f3971c = (Bundle) aVar.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: c6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3969a, this.f3971c, 0, this.d});
    }
}
