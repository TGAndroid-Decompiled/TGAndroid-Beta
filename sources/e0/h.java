package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f8113a;
    public IconCompat f8114b;
    public final o0[] f8115c;
    public final boolean d;
    public final boolean e;
    public final int f8116f;
    public final int f8117g;
    public final CharSequence h;
    public final PendingIntent f8118i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, o0[] o0VarArr, o0[] o0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.f8114b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f8117g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f8118i = pendingIntent;
        this.f8113a = bundle == null ? new Bundle() : bundle;
        this.f8115c = o0VarArr;
        this.d = z10;
        this.f8116f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f8114b == null && (i10 = this.f8117g) != 0) {
            this.f8114b = IconCompat.e(null, "", i10);
        }
        return this.f8114b;
    }
}
