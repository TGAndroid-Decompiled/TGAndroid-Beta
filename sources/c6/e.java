package c6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f4838a;
    public final d6.d0 f4839b;
    public final Bundle f4840c;
    public final String d = UUID.randomUUID().toString();

    public e(androidx.biometric.e eVar) {
        this.f4838a = (CastDevice) eVar.f2822b;
        this.f4839b = (d6.d0) eVar.f2823c;
        this.f4840c = (Bundle) eVar.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: c6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4838a, this.f4840c, 0, this.d});
    }
}
