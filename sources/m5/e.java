package m5;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class e implements com.google.android.gms.common.api.b {
    public final CastDevice f17389a;
    public final n5.f0 f17390b;
    public final Bundle f17391c;
    public final String d = UUID.randomUUID().toString();

    public e(j4.c cVar) {
        this.f17389a = (CastDevice) cVar.f13431b;
        this.f17390b = (n5.f0) cVar.f13432c;
        this.f17391c = (Bundle) cVar.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: m5.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17389a, this.f17391c, 0, this.d});
    }
}
