package i8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import j7.g5;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(8);
    public final PointF[] f7923a;
    public final int f7924b;

    public a(PointF[] pointFArr, int i10) {
        this.f7923a = pointFArr;
        this.f7924b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.o(parcel, 2, this.f7923a, i10);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f7924b);
        g5.r(parcel, q10);
    }
}
