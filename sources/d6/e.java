package d6;

import a8.h0;
import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f8061a;
    public final e6.d0 f8062b;
    public final Bundle f8063c;
    public final String d = UUID.randomUUID().toString();

    public e(h0 h0Var) {
        this.f8061a = (CastDevice) h0Var.f511b;
        this.f8062b = (e6.d0) h0Var.f512c;
        this.f8063c = (Bundle) h0Var.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: d6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8061a, this.f8063c, 0, this.d});
    }
}
