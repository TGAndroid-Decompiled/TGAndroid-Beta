package defpackage;

import android.content.Context;
public final class pj extends lp7 {
    public final int[] z0;

    public pj(Context context, ylb ylbVar, int[] iArr) {
        super(context, ylbVar);
        this.z0 = iArr;
    }

    @Override
    public final CharSequence d(int i) {
        int i2 = this.z0[i];
        if (i2 == 0) {
            return jb6.M0(2131753814, null);
        }
        if (i2 < 10080) {
            return jb6.G(i2 / 1440, "Days", new Object[0]);
        }
        if (i2 < 44640) {
            return jb6.G(i2 / 1440, "Weeks", new Object[0]);
        }
        if (i2 < 525600) {
            return jb6.G(i2 / 10080, "Months", new Object[0]);
        }
        return jb6.G(((i2 * 5) / 31) * 1440, "Years", new Object[0]);
    }
}
