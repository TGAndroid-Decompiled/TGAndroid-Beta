package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f9897a;
    public IconCompat f9898b;
    public final l0[] f9899c;
    public final boolean d;
    public final boolean f9900e;
    public final int f9901f;
    public final int f9902g;
    public final CharSequence h;
    public final PendingIntent f9903i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l0[] l0VarArr, l0[] l0VarArr2, boolean z10, int i7, boolean z11) {
        this.f9900e = true;
        this.f9898b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f9902g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f9903i = pendingIntent;
        this.f9897a = bundle == null ? new Bundle() : bundle;
        this.f9899c = l0VarArr;
        this.d = z10;
        this.f9901f = i7;
        this.f9900e = z11;
    }

    public final IconCompat a() {
        int i7;
        if (this.f9898b == null && (i7 = this.f9902g) != 0) {
            this.f9898b = IconCompat.e(null, "", i7);
        }
        return this.f9898b;
    }
}
