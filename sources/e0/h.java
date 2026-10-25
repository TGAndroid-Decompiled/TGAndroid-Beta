package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f9543a;
    public IconCompat f9544b;
    public final n0[] f9545c;
    public final boolean d;
    public final boolean e;
    public final int f9546f;
    public final int f9547g;
    public final CharSequence h;
    public final PendingIntent f9548i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, n0[] n0VarArr, n0[] n0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.f9544b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f9547g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f9548i = pendingIntent;
        this.f9543a = bundle == null ? new Bundle() : bundle;
        this.f9545c = n0VarArr;
        this.d = z10;
        this.f9546f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f9544b == null && (i10 = this.f9547g) != 0) {
            this.f9544b = IconCompat.e(null, "", i10);
        }
        return this.f9544b;
    }
}
