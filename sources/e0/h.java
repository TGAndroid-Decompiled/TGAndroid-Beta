package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f8106a;
    public IconCompat f8107b;
    public final o0[] f8108c;
    public final boolean d;
    public final boolean e;
    public final int f8109f;
    public final int f8110g;
    public final CharSequence h;
    public final PendingIntent f8111i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, o0[] o0VarArr, o0[] o0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.f8107b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f8110g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f8111i = pendingIntent;
        this.f8106a = bundle == null ? new Bundle() : bundle;
        this.f8108c = o0VarArr;
        this.d = z10;
        this.f8109f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f8107b == null && (i10 = this.f8110g) != 0) {
            this.f8107b = IconCompat.e(null, "", i10);
        }
        return this.f8107b;
    }
}
