package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class k {
    public final Bundle f8666a;
    public IconCompat f8667b;
    public final r0[] f8668c;
    public final boolean d;
    public final boolean f8669e;
    public final int f8670f;
    public final int f8671g;
    public final CharSequence h;
    public final PendingIntent f8672i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r0[] r0VarArr, r0[] r0VarArr2, boolean z10, int i10, boolean z11) {
        this.f8669e = true;
        this.f8667b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f8671g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.f8672i = pendingIntent;
        this.f8666a = bundle == null ? new Bundle() : bundle;
        this.f8668c = r0VarArr;
        this.d = z10;
        this.f8670f = i10;
        this.f8669e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f8667b == null && (i10 = this.f8671g) != 0) {
            this.f8667b = IconCompat.e(null, "", i10);
        }
        return this.f8667b;
    }
}
