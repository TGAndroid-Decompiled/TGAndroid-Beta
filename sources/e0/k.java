package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class k {
    public final Bundle f4984a;
    public IconCompat f4985b;
    public final q0[] f4986c;
    public final boolean d;
    public final boolean e;
    public final int f4987f;
    public final int f4988g;
    public final CharSequence h;
    public final PendingIntent f4989i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, q0[] q0VarArr, q0[] q0VarArr2, boolean z4, int i10, boolean z10) {
        this.e = true;
        this.f4985b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f4988g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.f4989i = pendingIntent;
        this.f4984a = bundle == null ? new Bundle() : bundle;
        this.f4986c = q0VarArr;
        this.d = z4;
        this.f4987f = i10;
        this.e = z10;
    }

    public final IconCompat a() {
        int i10;
        if (this.f4985b == null && (i10 = this.f4988g) != 0) {
            this.f4985b = IconCompat.e(null, "", i10);
        }
        return this.f4985b;
    }
}
