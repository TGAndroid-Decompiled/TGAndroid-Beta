package f6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f11378a;
    public final g6.d0 f11379b;
    public final Bundle f11380c;
    public final String d = UUID.randomUUID().toString();

    public e(android.support.v4.media.session.a0 a0Var) {
        this.f11378a = (CastDevice) a0Var.f1705b;
        this.f11379b = (g6.d0) a0Var.f1706c;
        this.f11380c = (Bundle) a0Var.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: f6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11378a, this.f11380c, 0, this.d});
    }
}
