package o5;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
import l3.g0;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f19249a;
    public final p5.d0 f19250b;
    public final Bundle f19251c;
    public final String d = UUID.randomUUID().toString();

    public e(g0 g0Var) {
        this.f19249a = (CastDevice) g0Var.f14096b;
        this.f19250b = (p5.d0) g0Var.f14097c;
        this.f19251c = (Bundle) g0Var.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: o5.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19249a, this.f19251c, 0, this.d});
    }
}
