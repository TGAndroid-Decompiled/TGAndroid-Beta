package n7;

import android.os.Parcel;
import android.os.Parcelable;
public final class kg extends c6.a {
    public static final Parcelable.Creator<kg> CREATOR = new dg(3);
    public final boolean f15633a;
    public final boolean f15634b;
    public final boolean f15635c;
    public final boolean d;
    public final boolean f15636e;

    public kg(boolean z4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15633a = z4;
        this.f15634b = z10;
        this.f15635c = z11;
        this.d = z12;
        this.f15636e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.g5.q(parcel, 20293);
        j7.g5.s(parcel, 1, 4);
        parcel.writeInt(this.f15633a ? 1 : 0);
        j7.g5.s(parcel, 2, 4);
        parcel.writeInt(this.f15634b ? 1 : 0);
        j7.g5.s(parcel, 3, 4);
        parcel.writeInt(this.f15635c ? 1 : 0);
        j7.g5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j7.g5.s(parcel, 5, 4);
        parcel.writeInt(this.f15636e ? 1 : 0);
        j7.g5.r(parcel, q10);
    }
}
