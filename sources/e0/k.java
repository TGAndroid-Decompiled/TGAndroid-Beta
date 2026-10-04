package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class k {
    public final Bundle f8439a;
    public IconCompat f8440b;
    public final r0[] f8441c;
    public final boolean d;
    public final boolean f8442e;
    public final int f8443f;
    public final int f8444g;
    public final CharSequence h;
    public final PendingIntent f8445i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r0[] r0VarArr, r0[] r0VarArr2, boolean z10, int i10, boolean z11) {
        this.f8442e = true;
        this.f8440b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f8444g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.f8445i = pendingIntent;
        this.f8439a = bundle == null ? new Bundle() : bundle;
        this.f8441c = r0VarArr;
        this.d = z10;
        this.f8443f = i10;
        this.f8442e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f8440b == null && (i10 = this.f8444g) != 0) {
            this.f8440b = IconCompat.e(null, "", i10);
        }
        return this.f8440b;
    }
}
