package c6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f3972a;
    public final d6.d0 f3973b;
    public final Bundle f3974c;
    public final String d = UUID.randomUUID().toString();

    public e(aa.a aVar) {
        this.f3972a = (CastDevice) aVar.f357b;
        this.f3973b = (d6.d0) aVar.f358c;
        this.f3974c = (Bundle) aVar.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: c6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3972a, this.f3974c, 0, this.d});
    }
}
