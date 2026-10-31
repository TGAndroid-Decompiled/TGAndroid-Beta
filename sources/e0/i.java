package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class i {
    public final Bundle f6026a;
    public IconCompat f6027b;
    public final n0[] f6028c;
    public final boolean d;
    public final boolean e;
    public final int f6029f;
    public final int f6030g;
    public final CharSequence h;
    public final PendingIntent f6031i;

    public i(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, n0[] n0VarArr, n0[] n0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.f6027b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f6030g = iconCompat.g();
        }
        this.h = r.d(charSequence);
        this.f6031i = pendingIntent;
        this.f6026a = bundle == null ? new Bundle() : bundle;
        this.f6028c = n0VarArr;
        this.d = z10;
        this.f6029f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f6027b == null && (i10 = this.f6030g) != 0) {
            this.f6027b = IconCompat.e(null, "", i10);
        }
        return this.f6027b;
    }
}
