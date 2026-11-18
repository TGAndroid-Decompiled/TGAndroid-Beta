package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class h {
    public final Bundle f10215a;
    public IconCompat f10216b;
    public final l0[] f10217c;
    public final boolean d;
    public final boolean f10218e;
    public final int f10219f;
    public final int f10220g;
    public final CharSequence h;
    public final PendingIntent f10221i;

    public h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l0[] l0VarArr, l0[] l0VarArr2, boolean z10, int i7, boolean z11) {
        this.f10218e = true;
        this.f10216b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f10220g = iconCompat.g();
        }
        this.h = q.d(charSequence);
        this.f10221i = pendingIntent;
        this.f10215a = bundle == null ? new Bundle() : bundle;
        this.f10217c = l0VarArr;
        this.d = z10;
        this.f10219f = i7;
        this.f10218e = z11;
    }

    public final IconCompat a() {
        int i7;
        if (this.f10216b == null && (i7 = this.f10220g) != 0) {
            this.f10216b = IconCompat.e(null, "", i7);
        }
        return this.f10216b;
    }
}
