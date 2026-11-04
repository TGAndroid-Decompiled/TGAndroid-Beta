package e6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f9690a;
    public final f6.e0 f9691b;
    public final Bundle f9692c;
    public final String d = UUID.randomUUID().toString();

    public e(android.support.v4.media.session.a0 a0Var) {
        this.f9690a = (CastDevice) a0Var.f1186b;
        this.f9691b = (f6.e0) a0Var.f1187c;
        this.f9692c = (Bundle) a0Var.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: e6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9690a, this.f9692c, 0, this.d});
    }
}
