package f6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f11372a;
    public final g6.d0 f11373b;
    public final Bundle f11374c;
    public final String d = UUID.randomUUID().toString();

    public e(android.support.v4.media.session.a0 a0Var) {
        this.f11372a = (CastDevice) a0Var.f1676b;
        this.f11373b = (g6.d0) a0Var.f1677c;
        this.f11374c = (Bundle) a0Var.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: f6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11372a, this.f11374c, 0, this.d});
    }
}
