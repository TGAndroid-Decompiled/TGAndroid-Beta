package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class i {
    public final Bundle f8231a;
    public IconCompat f8232b;
    public final p0[] f8233c;
    public final boolean d;
    public final boolean e;
    public final int f8234f;
    public final int f8235g;
    public final CharSequence h;
    public final PendingIntent f8236i;

    public i(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, p0[] p0VarArr, p0[] p0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.f8232b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f8235g = iconCompat.g();
        }
        this.h = r.d(charSequence);
        this.f8236i = pendingIntent;
        this.f8231a = bundle == null ? new Bundle() : bundle;
        this.f8233c = p0VarArr;
        this.d = z10;
        this.f8234f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f8232b == null && (i10 = this.f8235g) != 0) {
            this.f8232b = IconCompat.e(null, "", i10);
        }
        return this.f8232b;
    }
}
