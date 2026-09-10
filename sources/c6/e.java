package c6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f4391a;
    public final d6.d0 f4392b;
    public final Bundle f4393c;
    public final String d = UUID.randomUUID().toString();

    public e(aa.a aVar) {
        this.f4391a = (CastDevice) aVar.f355b;
        this.f4392b = (d6.d0) aVar.f356c;
        this.f4393c = (Bundle) aVar.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: c6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4391a, this.f4393c, 0, this.d});
    }
}
