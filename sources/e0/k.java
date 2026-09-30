package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class k {
    public final Bundle f7794a;
    public IconCompat f7795b;
    public final r0[] f7796c;
    public final boolean d;
    public final boolean e;
    public final int f7797f;
    public final int f7798g;
    public final CharSequence h;
    public final PendingIntent f7799i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r0[] r0VarArr, r0[] r0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.f7795b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f7798g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.f7799i = pendingIntent;
        this.f7794a = bundle == null ? new Bundle() : bundle;
        this.f7796c = r0VarArr;
        this.d = z10;
        this.f7797f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f7795b == null && (i10 = this.f7798g) != 0) {
            this.f7795b = IconCompat.e(null, "", i10);
        }
        return this.f7795b;
    }
}
