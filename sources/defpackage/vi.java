package defpackage;

import android.content.Context;
public final class vi extends hn7 {
    public final int[] z0;

    public vi(Context context, wjb wjbVar, int[] iArr) {
        super(context, wjbVar);
        this.z0 = iArr;
    }

    @Override
    public final CharSequence d(int i) {
        int i2 = this.z0[i];
        if (i2 == 0) {
            return k96.M0(2131748115, null);
        }
        if (i2 < 60) {
            return k96.G(i2, "Minutes", new Object[0]);
        }
        if (i2 < 1440) {
            return k96.G(i2 / 60, "Hours", new Object[0]);
        }
        if (i2 < 10080) {
            return k96.G(i2 / 1440, "Days", new Object[0]);
        }
        if (i2 < 44640) {
            return k96.G(i2 / 10080, "Weeks", new Object[0]);
        }
        if (i2 < 525600) {
            return k96.G(i2 / 44640, "Months", new Object[0]);
        }
        return k96.G(i2 / 525600, "Years", new Object[0]);
    }
}
