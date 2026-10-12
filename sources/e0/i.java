package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class i {
    public final Bundle f8228a;
    public IconCompat f8229b;
    public final p0[] f8230c;
    public final boolean d;
    public final boolean e;
    public final int f8231f;
    public final int f8232g;
    public final CharSequence h;
    public final PendingIntent f8233i;

    public i(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, p0[] p0VarArr, p0[] p0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.f8229b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f8232g = iconCompat.g();
        }
        this.h = r.d(charSequence);
        this.f8233i = pendingIntent;
        this.f8228a = bundle == null ? new Bundle() : bundle;
        this.f8230c = p0VarArr;
        this.d = z10;
        this.f8231f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f8229b == null && (i10 = this.f8232g) != 0) {
            this.f8229b = IconCompat.e(null, "", i10);
        }
        return this.f8229b;
    }
}
