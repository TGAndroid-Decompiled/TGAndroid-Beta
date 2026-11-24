package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class mk7 {
    public final Bundle a;
    public IconCompat b;
    public final g69[] c;
    public final boolean d;
    public final boolean e;
    public final byte f;
    public final int g;
    public final CharSequence h;
    public final PendingIntent i;

    public mk7(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, g69[] g69VarArr, boolean z, int i, boolean z2) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.g = iconCompat.g();
        }
        this.h = xk7.c(charSequence);
        this.i = pendingIntent;
        this.a = bundle;
        this.c = g69VarArr;
        this.d = z;
        this.f = i;
        this.e = z2;
    }

    public final IconCompat a() {
        int i;
        IconCompat iconCompat = this.b;
        if (iconCompat == null && (i = this.g) != 0) {
            IconCompat e = IconCompat.e(null, "", i);
            this.b = e;
            return e;
        }
        return iconCompat;
    }
}
