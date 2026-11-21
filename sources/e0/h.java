package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f10241a;
    public IconCompat f10242b;
    public final l0[] f10243c;
    public final boolean d;
    public final boolean f10244e;
    public final int f10245f;
    public final int f10246g;
    public final CharSequence h;
    public final PendingIntent f10247i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l0[] l0VarArr, l0[] l0VarArr2, boolean z10, int i7, boolean z11) {
        this.f10244e = true;
        this.f10242b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f10246g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f10247i = pendingIntent;
        this.f10241a = bundle == null ? new Bundle() : bundle;
        this.f10243c = l0VarArr;
        this.d = z10;
        this.f10245f = i7;
        this.f10244e = z11;
    }

    public final IconCompat a() {
        int i7;
        if (this.f10242b == null && (i7 = this.f10246g) != 0) {
            this.f10242b = IconCompat.e(null, "", i7);
        }
        return this.f10242b;
    }
}
