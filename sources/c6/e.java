package c6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f3971a;
    public final d6.d0 f3972b;
    public final Bundle f3973c;
    public final String d = UUID.randomUUID().toString();

    public e(aa.a aVar) {
        this.f3971a = (CastDevice) aVar.f359b;
        this.f3972b = (d6.d0) aVar.f360c;
        this.f3973c = (Bundle) aVar.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: c6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3971a, this.f3973c, 0, this.d});
    }
}
