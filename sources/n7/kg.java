package n7;

import android.os.Parcel;
import android.os.Parcelable;
public final class kg extends c6.a {
    public static final Parcelable.Creator<kg> CREATOR = new dg(3);
    public final boolean f15635a;
    public final boolean f15636b;
    public final boolean f15637c;
    public final boolean d;
    public final boolean f15638e;

    public kg(boolean z4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15635a = z4;
        this.f15636b = z10;
        this.f15637c = z11;
        this.d = z12;
        this.f15638e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.g5.q(parcel, 20293);
        j7.g5.s(parcel, 1, 4);
        parcel.writeInt(this.f15635a ? 1 : 0);
        j7.g5.s(parcel, 2, 4);
        parcel.writeInt(this.f15636b ? 1 : 0);
        j7.g5.s(parcel, 3, 4);
        parcel.writeInt(this.f15637c ? 1 : 0);
        j7.g5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j7.g5.s(parcel, 5, 4);
        parcel.writeInt(this.f15638e ? 1 : 0);
        j7.g5.r(parcel, q10);
    }
}
