package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f8108a;
    public IconCompat f8109b;
    public final o0[] f8110c;
    public final boolean d;
    public final boolean e;
    public final int f8111f;
    public final int f8112g;
    public final CharSequence h;
    public final PendingIntent f8113i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, o0[] o0VarArr, o0[] o0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.f8109b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f8112g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f8113i = pendingIntent;
        this.f8108a = bundle == null ? new Bundle() : bundle;
        this.f8110c = o0VarArr;
        this.d = z10;
        this.f8111f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f8109b == null && (i10 = this.f8112g) != 0) {
            this.f8109b = IconCompat.e(null, "", i10);
        }
        return this.f8109b;
    }
}
