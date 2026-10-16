package c6;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f4465a;
    public final d6.d0 f4466b;
    public final Bundle f4467c;
    public final String d = UUID.randomUUID().toString();

    public e(androidx.biometric.e eVar) {
        this.f4465a = (CastDevice) eVar.f1200b;
        this.f4466b = (d6.d0) eVar.f1201c;
        this.f4467c = (Bundle) eVar.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: c6.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4465a, this.f4467c, 0, this.d});
    }
}
