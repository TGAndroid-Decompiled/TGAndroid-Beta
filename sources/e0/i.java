package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class i {
    public final Bundle f8425a;
    public IconCompat f8426b;
    public final p0[] f8427c;
    public final boolean d;
    public final boolean f8428e;
    public final int f8429f;
    public final int f8430g;
    public final CharSequence h;
    public final PendingIntent f8431i;

    public i(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, p0[] p0VarArr, p0[] p0VarArr2, boolean z10, int i10, boolean z11) {
        this.f8428e = true;
        this.f8426b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f8430g = iconCompat.g();
        }
        this.h = r.d(charSequence);
        this.f8431i = pendingIntent;
        this.f8425a = bundle == null ? new Bundle() : bundle;
        this.f8427c = p0VarArr;
        this.d = z10;
        this.f8429f = i10;
        this.f8428e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f8426b == null && (i10 = this.f8430g) != 0) {
            this.f8426b = IconCompat.e(null, "", i10);
        }
        return this.f8426b;
    }
}
