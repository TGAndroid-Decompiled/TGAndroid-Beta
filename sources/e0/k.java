package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class k {
    public final Bundle f4990a;
    public IconCompat f4991b;
    public final q0[] f4992c;
    public final boolean d;
    public final boolean e;
    public final int f4993f;
    public final int f4994g;
    public final CharSequence h;
    public final PendingIntent f4995i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, q0[] q0VarArr, q0[] q0VarArr2, boolean z4, int i10, boolean z10) {
        this.e = true;
        this.f4991b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f4994g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.f4995i = pendingIntent;
        this.f4990a = bundle == null ? new Bundle() : bundle;
        this.f4992c = q0VarArr;
        this.d = z4;
        this.f4993f = i10;
        this.e = z10;
    }

    public final IconCompat a() {
        int i10;
        if (this.f4991b == null && (i10 = this.f4994g) != 0) {
            this.f4991b = IconCompat.e(null, "", i10);
        }
        return this.f4991b;
    }
}
