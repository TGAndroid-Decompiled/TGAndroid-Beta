package defpackage;

import android.content.Context;
public final class bgc extends sk8 {
    public final hgc W;

    public bgc(hgc hgcVar, Context context, float f, float f2) {
        super(context, f, f2);
        this.W = hgcVar;
    }

    @Override
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        hgc hgcVar = this.W;
        hgcVar.Z.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], hgcVar.Z.getMeasuredWidth()};
    }
}
