package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class k {
    public final Bundle f7100a;
    public IconCompat f7101b;
    public final r0[] f7102c;
    public final boolean d;
    public final boolean e;
    public final int f7103f;
    public final int f7104g;
    public final CharSequence h;
    public final PendingIntent f7105i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r0[] r0VarArr, r0[] r0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.f7101b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f7104g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.f7105i = pendingIntent;
        this.f7100a = bundle == null ? new Bundle() : bundle;
        this.f7102c = r0VarArr;
        this.d = z10;
        this.f7103f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f7101b == null && (i10 = this.f7104g) != 0) {
            this.f7101b = IconCompat.e(null, "", i10);
        }
        return this.f7101b;
    }
}
