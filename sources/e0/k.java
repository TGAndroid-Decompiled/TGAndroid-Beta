package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class k {
    public final Bundle f4720a;
    public IconCompat f4721b;
    public final r0[] f4722c;
    public final boolean d;
    public final boolean f4723e;
    public final int f4724f;
    public final int f4725g;
    public final CharSequence h;
    public final PendingIntent f4726i;

    public k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r0[] r0VarArr, r0[] r0VarArr2, boolean z10, int i9, boolean z11) {
        this.f4723e = true;
        this.f4721b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.f4725g = iconCompat.g();
        }
        this.h = t.d(charSequence);
        this.f4726i = pendingIntent;
        this.f4720a = bundle == null ? new Bundle() : bundle;
        this.f4722c = r0VarArr;
        this.d = z10;
        this.f4724f = i9;
        this.f4723e = z11;
    }

    public final IconCompat a() {
        int i9;
        if (this.f4721b == null && (i9 = this.f4725g) != 0) {
            this.f4721b = IconCompat.e(null, "", i9);
        }
        return this.f4721b;
    }
}
