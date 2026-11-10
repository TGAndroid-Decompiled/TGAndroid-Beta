package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f10066a;
    public IconCompat f10067b;
    public final l0[] f10068c;
    public final boolean d;
    public final boolean f10069e;
    public final int f10070f;
    public final int f10071g;
    public final CharSequence h;
    public final PendingIntent f10072i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l0[] l0VarArr, l0[] l0VarArr2, boolean z9, int i7, boolean z10) {
        this.f10069e = true;
        this.f10067b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f10071g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f10072i = pendingIntent;
        this.f10066a = bundle == null ? new Bundle() : bundle;
        this.f10068c = l0VarArr;
        this.d = z9;
        this.f10070f = i7;
        this.f10069e = z10;
    }

    public final IconCompat a() {
        int i7;
        if (this.f10067b == null && (i7 = this.f10071g) != 0) {
            this.f10067b = IconCompat.e(null, "", i7);
        }
        return this.f10067b;
    }
}
