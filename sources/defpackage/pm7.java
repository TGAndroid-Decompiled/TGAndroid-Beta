package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
public final class pm7 {
    public final Bundle a;
    public IconCompat b;
    public final i89[] c;
    public final boolean d;
    public final boolean e;
    public final byte f;
    public final int g;
    public final CharSequence h;
    public final PendingIntent i;

    public pm7(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, i89[] i89VarArr, boolean z, int i, boolean z2) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.g = iconCompat.g();
        }
        this.h = an7.c(charSequence);
        this.i = pendingIntent;
        this.a = bundle;
        this.c = i89VarArr;
        this.d = z;
        this.f = i;
        this.e = z2;
    }

    public final IconCompat a() {
        int i;
        IconCompat iconCompat = this.b;
        if (iconCompat == null && (i = this.g) != 0) {
            IconCompat e = IconCompat.e(null, "", i);
            this.b = e;
            return e;
        }
        return iconCompat;
    }
}
