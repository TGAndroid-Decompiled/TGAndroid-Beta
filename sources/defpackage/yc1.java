package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class yc1 implements vn {
    public final CastDevice a;
    public final uhf b;
    public final Bundle c;
    public final String d = UUID.randomUUID().toString();

    public yc1(mv6 mv6Var) {
        this.a = (CastDevice) mv6Var.b;
        this.b = (uhf) mv6Var.c;
        this.c = (Bundle) mv6Var.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, 0, this.d});
    }
}
