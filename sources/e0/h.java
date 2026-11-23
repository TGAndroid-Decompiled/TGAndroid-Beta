package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f10205a;
    public IconCompat f10206b;
    public final l0[] f10207c;
    public final boolean d;
    public final boolean f10208e;
    public final int f10209f;
    public final int f10210g;
    public final CharSequence h;
    public final PendingIntent f10211i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l0[] l0VarArr, l0[] l0VarArr2, boolean z10, int i7, boolean z11) {
        this.f10208e = true;
        this.f10206b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f10210g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f10211i = pendingIntent;
        this.f10205a = bundle == null ? new Bundle() : bundle;
        this.f10207c = l0VarArr;
        this.d = z10;
        this.f10209f = i7;
        this.f10208e = z11;
    }

    public final IconCompat a() {
        int i7;
        if (this.f10206b == null && (i7 = this.f10210g) != 0) {
            this.f10206b = IconCompat.e(null, "", i7);
        }
        return this.f10206b;
    }
}
