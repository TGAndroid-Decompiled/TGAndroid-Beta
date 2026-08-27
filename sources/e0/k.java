package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

public final class k {

    public final Bundle f5077a;

    public IconCompat f5078b;

    public final r0[] f5079c;
    public final boolean d;

    public final boolean f5080e;

    public final int f5081f;

    public final int f5082g;
    public final CharSequence h;

    public final PendingIntent f5083i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r0[] r0VarArr, r0[] r0VarArr2, boolean z10, int i10, boolean z11) {
        this.f5080e = true;
        this.f5078b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f5082g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.f5083i = pendingIntent;
        this.f5077a = bundle == null ? new Bundle() : bundle;
        this.f5079c = r0VarArr;
        this.d = z10;
        this.f5081f = i10;
        this.f5080e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f5078b == null && (i10 = this.f5082g) != 0) {
            this.f5078b = IconCompat.e(null, "", i10);
        }
        return this.f5078b;
    }
}
