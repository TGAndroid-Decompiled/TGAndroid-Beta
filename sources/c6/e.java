package c6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f4344a;
    public final d6.d0 f4345b;
    public final Bundle f4346c;
    public final String d = UUID.randomUUID().toString();

    public e(aa.a aVar) {
        this.f4344a = (CastDevice) aVar.f384b;
        this.f4345b = (d6.d0) aVar.f385c;
        this.f4346c = (Bundle) aVar.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: c6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4344a, this.f4346c, 0, this.d});
    }
}
