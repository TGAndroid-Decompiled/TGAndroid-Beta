package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f8107a;
    public IconCompat f8108b;
    public final o0[] f8109c;
    public final boolean d;
    public final boolean e;
    public final int f8110f;
    public final int f8111g;
    public final CharSequence h;
    public final PendingIntent f8112i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, o0[] o0VarArr, o0[] o0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.f8108b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f8111g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f8112i = pendingIntent;
        this.f8107a = bundle == null ? new Bundle() : bundle;
        this.f8109c = o0VarArr;
        this.d = z10;
        this.f8110f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f8108b == null && (i10 = this.f8111g) != 0) {
            this.f8108b = IconCompat.e(null, "", i10);
        }
        return this.f8108b;
    }
}
