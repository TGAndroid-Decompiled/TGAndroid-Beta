package e8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new c.c(17);
    public final PointF[] f4978a;
    public final int f4979b;

    public a(PointF[] pointFArr, int i9) {
        this.f4978a = pointFArr;
        this.f4979b = i9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.o(parcel, 2, this.f4978a, i9);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f4979b);
        p8.r(parcel, q10);
    }
}
