package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f9241a;
    public IconCompat f9242b;
    public final m0[] f9243c;
    public final boolean d;
    public final boolean f9244e;
    public final int f9245f;
    public final int f9246g;
    public final CharSequence h;
    public final PendingIntent f9247i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, m0[] m0VarArr, m0[] m0VarArr2, boolean z10, int i3, boolean z11) {
        this.f9244e = true;
        this.f9242b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f9246g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f9247i = pendingIntent;
        this.f9241a = bundle == null ? new Bundle() : bundle;
        this.f9243c = m0VarArr;
        this.d = z10;
        this.f9245f = i3;
        this.f9244e = z11;
    }

    public final IconCompat a() {
        int i3;
        if (this.f9242b == null && (i3 = this.f9246g) != 0) {
            this.f9242b = IconCompat.e(null, "", i3);
        }
        return this.f9242b;
    }
}
