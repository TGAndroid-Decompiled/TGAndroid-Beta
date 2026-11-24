package defpackage;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
public final class u4d extends b4 {
    public static final Parcelable.Creator<u4d> CREATOR = new igd((byte) 4);
    public final PointF[] a;
    public final int b;

    public u4d(PointF[] pointFArr, int i) {
        this.a = pointFArr;
        this.b = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.o(parcel, 2, this.a, i);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        jte.s(parcel, r);
    }
}
