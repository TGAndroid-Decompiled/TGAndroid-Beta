package f8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class a extends z5.a {
    public static final Parcelable.Creator<a> CREATOR = new f4.e(1);

    public final PointF[] f5907a;

    public final int f5908b;

    public a(PointF[] pointFArr, int i10) {
        this.f5907a = pointFArr;
        this.f5908b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.o(parcel, 2, this.f5907a, i10);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f5908b);
        r8.r(parcel, iQ);
    }
}
