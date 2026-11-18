package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f10212a;
    public IconCompat f10213b;
    public final l0[] f10214c;
    public final boolean d;
    public final boolean f10215e;
    public final int f10216f;
    public final int f10217g;
    public final CharSequence h;
    public final PendingIntent f10218i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l0[] l0VarArr, l0[] l0VarArr2, boolean z10, int i7, boolean z11) {
        this.f10215e = true;
        this.f10213b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f10217g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f10218i = pendingIntent;
        this.f10212a = bundle == null ? new Bundle() : bundle;
        this.f10214c = l0VarArr;
        this.d = z10;
        this.f10216f = i7;
        this.f10215e = z11;
    }

    public final IconCompat a() {
        int i7;
        if (this.f10213b == null && (i7 = this.f10217g) != 0) {
            this.f10213b = IconCompat.e(null, "", i7);
        }
        return this.f10213b;
    }
}
