package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class k {
    public final Bundle f4808a;
    public IconCompat f4809b;
    public final q0[] f4810c;
    public final boolean d;
    public final boolean f4811e;
    public final int f4812f;
    public final int f4813g;
    public final CharSequence h;
    public final PendingIntent f4814i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, q0[] q0VarArr, q0[] q0VarArr2, boolean z4, int i10, boolean z10) {
        this.f4811e = true;
        this.f4809b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f4813g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.f4814i = pendingIntent;
        this.f4808a = bundle == null ? new Bundle() : bundle;
        this.f4810c = q0VarArr;
        this.d = z4;
        this.f4812f = i10;
        this.f4811e = z10;
    }

    public final IconCompat a() {
        int i10;
        if (this.f4809b == null && (i10 = this.f4813g) != 0) {
            this.f4809b = IconCompat.e(null, "", i10);
        }
        return this.f4809b;
    }
}
