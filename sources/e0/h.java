package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f9542a;
    public IconCompat f9543b;
    public final n0[] f9544c;
    public final boolean d;
    public final boolean e;
    public final int f9545f;
    public final int f9546g;
    public final CharSequence h;
    public final PendingIntent f9547i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, n0[] n0VarArr, n0[] n0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.f9543b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f9546g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f9547i = pendingIntent;
        this.f9542a = bundle == null ? new Bundle() : bundle;
        this.f9544c = n0VarArr;
        this.d = z10;
        this.f9545f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f9543b == null && (i10 = this.f9546g) != 0) {
            this.f9543b = IconCompat.e(null, "", i10);
        }
        return this.f9543b;
    }
}
