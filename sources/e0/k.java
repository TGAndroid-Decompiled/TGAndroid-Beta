package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class k {
    public final Bundle f5690a;
    public IconCompat f5691b;
    public final r0[] f5692c;
    public final boolean d;
    public final boolean f5693e;
    public final int f5694f;
    public final int f5695g;
    public final CharSequence h;
    public final PendingIntent f5696i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r0[] r0VarArr, r0[] r0VarArr2, boolean z10, int i10, boolean z11) {
        this.f5693e = true;
        this.f5691b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f5695g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.f5696i = pendingIntent;
        this.f5690a = bundle == null ? new Bundle() : bundle;
        this.f5692c = r0VarArr;
        this.d = z10;
        this.f5694f = i10;
        this.f5693e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f5691b == null && (i10 = this.f5695g) != 0) {
            this.f5691b = IconCompat.e(null, "", i10);
        }
        return this.f5691b;
    }
}
