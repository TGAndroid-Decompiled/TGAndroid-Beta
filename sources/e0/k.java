package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class k {
    public final Bundle f8438a;
    public IconCompat f8439b;
    public final r0[] f8440c;
    public final boolean d;
    public final boolean f8441e;
    public final int f8442f;
    public final int f8443g;
    public final CharSequence h;
    public final PendingIntent f8444i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r0[] r0VarArr, r0[] r0VarArr2, boolean z10, int i10, boolean z11) {
        this.f8441e = true;
        this.f8439b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f8443g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.f8444i = pendingIntent;
        this.f8438a = bundle == null ? new Bundle() : bundle;
        this.f8440c = r0VarArr;
        this.d = z10;
        this.f8442f = i10;
        this.f8441e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f8439b == null && (i10 = this.f8443g) != 0) {
            this.f8439b = IconCompat.e(null, "", i10);
        }
        return this.f8439b;
    }
}
