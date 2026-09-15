package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class k {
    public final Bundle f7795a;
    public IconCompat f7796b;
    public final r0[] f7797c;
    public final boolean d;
    public final boolean e;
    public final int f7798f;
    public final int f7799g;
    public final CharSequence h;
    public final PendingIntent f7800i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r0[] r0VarArr, r0[] r0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.f7796b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f7799g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.f7800i = pendingIntent;
        this.f7795a = bundle == null ? new Bundle() : bundle;
        this.f7797c = r0VarArr;
        this.d = z10;
        this.f7798f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f7796b == null && (i10 = this.f7799g) != 0) {
            this.f7796b = IconCompat.e(null, "", i10);
        }
        return this.f7796b;
    }
}
