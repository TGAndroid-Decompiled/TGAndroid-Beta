package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f10207a;
    public IconCompat f10208b;
    public final l0[] f10209c;
    public final boolean d;
    public final boolean f10210e;
    public final int f10211f;
    public final int f10212g;
    public final CharSequence h;
    public final PendingIntent f10213i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l0[] l0VarArr, l0[] l0VarArr2, boolean z10, int i7, boolean z11) {
        this.f10210e = true;
        this.f10208b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f10212g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f10213i = pendingIntent;
        this.f10207a = bundle == null ? new Bundle() : bundle;
        this.f10209c = l0VarArr;
        this.d = z10;
        this.f10211f = i7;
        this.f10210e = z11;
    }

    public final IconCompat a() {
        int i7;
        if (this.f10208b == null && (i7 = this.f10212g) != 0) {
            this.f10208b = IconCompat.e(null, "", i7);
        }
        return this.f10208b;
    }
}
