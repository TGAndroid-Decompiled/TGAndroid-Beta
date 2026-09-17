package c6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f4514a;
    public final d6.d0 f4515b;
    public final Bundle f4516c;
    public final String d = UUID.randomUUID().toString();

    public e(aa.a aVar) {
        this.f4514a = (CastDevice) aVar.f383b;
        this.f4515b = (d6.d0) aVar.f384c;
        this.f4516c = (Bundle) aVar.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: c6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4514a, this.f4516c, 0, this.d});
    }
}
