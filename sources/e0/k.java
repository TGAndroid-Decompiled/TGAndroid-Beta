package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class k {
    public final Bundle f8638a;
    public IconCompat f8639b;
    public final r0[] f8640c;
    public final boolean d;
    public final boolean f8641e;
    public final int f8642f;
    public final int f8643g;
    public final CharSequence h;
    public final PendingIntent f8644i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r0[] r0VarArr, r0[] r0VarArr2, boolean z10, int i10, boolean z11) {
        this.f8641e = true;
        this.f8639b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f8643g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.f8644i = pendingIntent;
        this.f8638a = bundle == null ? new Bundle() : bundle;
        this.f8640c = r0VarArr;
        this.d = z10;
        this.f8642f = i10;
        this.f8641e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f8639b == null && (i10 = this.f8643g) != 0) {
            this.f8639b = IconCompat.e(null, "", i10);
        }
        return this.f8639b;
    }
}
