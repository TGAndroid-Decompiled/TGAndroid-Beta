package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f8109a;
    public IconCompat f8110b;
    public final o0[] f8111c;
    public final boolean d;
    public final boolean e;
    public final int f8112f;
    public final int f8113g;
    public final CharSequence h;
    public final PendingIntent f8114i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, o0[] o0VarArr, o0[] o0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.f8110b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f8113g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f8114i = pendingIntent;
        this.f8109a = bundle == null ? new Bundle() : bundle;
        this.f8111c = o0VarArr;
        this.d = z10;
        this.f8112f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f8110b == null && (i10 = this.f8113g) != 0) {
            this.f8110b = IconCompat.e(null, "", i10);
        }
        return this.f8110b;
    }
}
