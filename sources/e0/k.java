package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class k {
    public final Bundle f7783a;
    public IconCompat f7784b;
    public final r0[] f7785c;
    public final boolean d;
    public final boolean e;
    public final int f7786f;
    public final int f7787g;
    public final CharSequence h;
    public final PendingIntent f7788i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r0[] r0VarArr, r0[] r0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.f7784b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f7787g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.f7788i = pendingIntent;
        this.f7783a = bundle == null ? new Bundle() : bundle;
        this.f7785c = r0VarArr;
        this.d = z10;
        this.f7786f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f7784b == null && (i10 = this.f7787g) != 0) {
            this.f7784b = IconCompat.e(null, "", i10);
        }
        return this.f7784b;
    }
}
