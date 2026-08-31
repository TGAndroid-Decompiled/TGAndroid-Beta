package n7;

import android.os.Parcel;
import android.os.Parcelable;
public final class bg extends c6.a {
    public static final Parcelable.Creator<bg> CREATOR = new dg(0);
    public final int f15281a;
    public final int f15282b;
    public final int f15283c;
    public final int d;
    public final long f15284e;

    public bg(int i10, int i11, int i12, long j10, int i13) {
        this.f15281a = i10;
        this.f15282b = i11;
        this.f15283c = i12;
        this.d = i13;
        this.f15284e = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.g5.q(parcel, 20293);
        j7.g5.s(parcel, 1, 4);
        parcel.writeInt(this.f15281a);
        j7.g5.s(parcel, 2, 4);
        parcel.writeInt(this.f15282b);
        j7.g5.s(parcel, 3, 4);
        parcel.writeInt(this.f15283c);
        j7.g5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        j7.g5.s(parcel, 5, 8);
        parcel.writeLong(this.f15284e);
        j7.g5.r(parcel, q10);
    }
}
