package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f10061a;
    public IconCompat f10062b;
    public final l0[] f10063c;
    public final boolean d;
    public final boolean f10064e;
    public final int f10065f;
    public final int f10066g;
    public final CharSequence h;
    public final PendingIntent f10067i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l0[] l0VarArr, l0[] l0VarArr2, boolean z9, int i7, boolean z10) {
        this.f10064e = true;
        this.f10062b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f10066g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f10067i = pendingIntent;
        this.f10061a = bundle == null ? new Bundle() : bundle;
        this.f10063c = l0VarArr;
        this.d = z9;
        this.f10065f = i7;
        this.f10064e = z10;
    }

    public final IconCompat a() {
        int i7;
        if (this.f10062b == null && (i7 = this.f10066g) != 0) {
            this.f10062b = IconCompat.e(null, "", i7);
        }
        return this.f10062b;
    }
}
