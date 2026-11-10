package f6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f11252a;
    public final g6.e0 f11253b;
    public final Bundle f11254c;
    public final String d = UUID.randomUUID().toString();

    public e(android.support.v4.media.session.a0 a0Var) {
        this.f11252a = (CastDevice) a0Var.f1763b;
        this.f11253b = (g6.e0) a0Var.f1764c;
        this.f11254c = (Bundle) a0Var.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: f6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11252a, this.f11254c, 0, this.d});
    }
}
