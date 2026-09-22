package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class k {
    public final Bundle f7799a;
    public IconCompat f7800b;
    public final r0[] f7801c;
    public final boolean d;
    public final boolean e;
    public final int f7802f;
    public final int f7803g;
    public final CharSequence h;
    public final PendingIntent f7804i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r0[] r0VarArr, r0[] r0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.f7800b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f7803g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.f7804i = pendingIntent;
        this.f7799a = bundle == null ? new Bundle() : bundle;
        this.f7801c = r0VarArr;
        this.d = z10;
        this.f7802f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f7800b == null && (i10 = this.f7803g) != 0) {
            this.f7800b = IconCompat.e(null, "", i10);
        }
        return this.f7800b;
    }
}
