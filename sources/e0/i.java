package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class i {
    public final Bundle f8422a;
    public IconCompat f8423b;
    public final p0[] f8424c;
    public final boolean d;
    public final boolean f8425e;
    public final int f8426f;
    public final int f8427g;
    public final CharSequence h;
    public final PendingIntent f8428i;

    public i(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, p0[] p0VarArr, p0[] p0VarArr2, boolean z10, int i10, boolean z11) {
        this.f8425e = true;
        this.f8423b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f8427g = iconCompat.g();
        }
        this.h = r.d(charSequence);
        this.f8428i = pendingIntent;
        this.f8422a = bundle == null ? new Bundle() : bundle;
        this.f8424c = p0VarArr;
        this.d = z10;
        this.f8426f = i10;
        this.f8425e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f8423b == null && (i10 = this.f8427g) != 0) {
            this.f8423b = IconCompat.e(null, "", i10);
        }
        return this.f8423b;
    }
}
