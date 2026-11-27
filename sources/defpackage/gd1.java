package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class gd1 implements wn {
    public final CastDevice a;
    public final kmf b;
    public final Bundle c;
    public final String d = UUID.randomUUID().toString();

    public gd1(rx6 rx6Var) {
        this.a = (CastDevice) rx6Var.b;
        this.b = (kmf) rx6Var.c;
        this.c = (Bundle) rx6Var.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, 0, this.d});
    }
}
