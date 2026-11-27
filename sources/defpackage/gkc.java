package defpackage;

import android.content.Context;
public final class gkc extends fo8 {
    public final mkc W;

    public gkc(mkc mkcVar, Context context, float f, float f2) {
        super(context, f, f2);
        this.W = mkcVar;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        mkc mkcVar = this.W;
        mkcVar.Z.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], mkcVar.Z.getMeasuredWidth()};
    }
}
