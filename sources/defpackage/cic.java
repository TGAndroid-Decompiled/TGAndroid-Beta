package defpackage;

import android.content.Context;
public final class cic extends um8 {
    public final iic W;

    public cic(iic iicVar, Context context, float f, float f2) {
        super(context, f, f2);
        this.W = iicVar;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        iic iicVar = this.W;
        iicVar.Z.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], iicVar.Z.getMeasuredWidth()};
    }
}
