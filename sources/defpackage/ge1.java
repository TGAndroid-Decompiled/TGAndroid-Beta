package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;
public final class ge1 implements wo {
    public final CastDevice a;
    public final vjf b;
    public final Bundle c;
    public final String d = UUID.randomUUID().toString();

    public ge1(mx6 mx6Var) {
        this.a = (CastDevice) mx6Var.b;
        this.b = (vjf) mx6Var.c;
        this.c = (Bundle) mx6Var.d;
    }

    public final boolean equals(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ge1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, 0, this.d});
    }
}
