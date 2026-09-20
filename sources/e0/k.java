package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class k {
    public final Bundle f7800a;
    public IconCompat f7801b;
    public final r0[] f7802c;
    public final boolean d;
    public final boolean e;
    public final int f7803f;
    public final int f7804g;
    public final CharSequence h;
    public final PendingIntent f7805i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r0[] r0VarArr, r0[] r0VarArr2, boolean z10, int i10, boolean z11) {
        this.e = true;
        this.f7801b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f7804g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.f7805i = pendingIntent;
        this.f7800a = bundle == null ? new Bundle() : bundle;
        this.f7802c = r0VarArr;
        this.d = z10;
        this.f7803f = i10;
        this.e = z11;
    }

    public final IconCompat a() {
        int i10;
        if (this.f7801b == null && (i10 = this.f7804g) != 0) {
            this.f7801b = IconCompat.e(null, "", i10);
        }
        return this.f7801b;
    }
}
