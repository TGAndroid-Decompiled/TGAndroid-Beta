package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f10244a;
    public IconCompat f10245b;
    public final l0[] f10246c;
    public final boolean d;
    public final boolean f10247e;
    public final int f10248f;
    public final int f10249g;
    public final CharSequence h;
    public final PendingIntent f10250i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l0[] l0VarArr, l0[] l0VarArr2, boolean z10, int i7, boolean z11) {
        this.f10247e = true;
        this.f10245b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f10249g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f10250i = pendingIntent;
        this.f10244a = bundle == null ? new Bundle() : bundle;
        this.f10246c = l0VarArr;
        this.d = z10;
        this.f10248f = i7;
        this.f10247e = z11;
    }

    public final IconCompat a() {
        int i7;
        if (this.f10245b == null && (i7 = this.f10249g) != 0) {
            this.f10245b = IconCompat.e(null, "", i7);
        }
        return this.f10245b;
    }
}
