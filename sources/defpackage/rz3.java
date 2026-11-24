package defpackage;

import android.content.Context;
public final class rz3 extends u26 {
    public final int r;

    public rz3(Context context, int i) {
        super(context);
        this.r = i;
    }

    @Override
    public final int i(int i, int i2, int i3, int i4, int i5) {
        return super.i(i, i2, i3, i4, i5) + this.r;
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 4;
    }

    @Override
    public final int p() {
        return -1;
    }
}
