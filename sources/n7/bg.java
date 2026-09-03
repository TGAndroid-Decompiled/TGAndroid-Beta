package n7;

import android.os.Parcel;
import android.os.Parcelable;
public final class bg extends c6.a {
    public static final Parcelable.Creator<bg> CREATOR = new dg(0);
    public final int f15283a;
    public final int f15284b;
    public final int f15285c;
    public final int d;
    public final long f15286e;

    public bg(int i10, int i11, int i12, long j10, int i13) {
        this.f15283a = i10;
        this.f15284b = i11;
        this.f15285c = i12;
        this.d = i13;
        this.f15286e = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.g5.q(parcel, 20293);
        j7.g5.s(parcel, 1, 4);
        parcel.writeInt(this.f15283a);
        j7.g5.s(parcel, 2, 4);
        parcel.writeInt(this.f15284b);
        j7.g5.s(parcel, 3, 4);
        parcel.writeInt(this.f15285c);
        j7.g5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        j7.g5.s(parcel, 5, 8);
        parcel.writeLong(this.f15286e);
        j7.g5.r(parcel, q10);
    }
}
