package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class i {
    public final Bundle f8424a;
    public IconCompat f8425b;
    public final p0[] f8426c;
    public final boolean d;
    public final boolean f8427e;
    public final int f8428f;
    public final int f8429g;
    public final CharSequence h;
    public final PendingIntent f8430i;

    public i(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, p0[] p0VarArr, p0[] p0VarArr2, boolean z10, int i10, boolean z11) {
        this.f8427e = true;
        this.f8425b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f8429g = iconCompat.g();
        }
        this.h = r.d(charSequence);
        this.f8430i = pendingIntent;
        this.f8424a = bundle == null ? new Bundle() : bundle;
        this.f8426c = p0VarArr;
        this.d = z10;
        this.f8428f = i10;
        this.f8427e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f8425b == null && (i10 = this.f8429g) != 0) {
            this.f8425b = IconCompat.e(null, "", i10);
        }
        return this.f8425b;
    }
}
