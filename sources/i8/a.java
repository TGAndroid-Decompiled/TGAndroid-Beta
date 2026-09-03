package i8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import j7.f5;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(8);
    public final PointF[] f7344a;
    public final int f7345b;

    public a(PointF[] pointFArr, int i10) {
        this.f7344a = pointFArr;
        this.f7345b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.o(parcel, 2, this.f7344a, i10);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f7345b);
        f5.r(parcel, q10);
    }
}
