package j7;

import android.os.Parcel;
import android.os.Parcelable;
public final class ag extends y5.a {
    public static final Parcelable.Creator<ag> CREATOR = new cg(0);
    public final int f13640a;
    public final int f13641b;
    public final int f13642c;
    public final int d;
    public final long f13643e;

    public ag(int i9, int i10, int i11, long j10, int i12) {
        this.f13640a = i9;
        this.f13641b = i10;
        this.f13642c = i11;
        this.d = i12;
        this.f13643e = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = g7.p8.q(parcel, 20293);
        g7.p8.s(parcel, 1, 4);
        parcel.writeInt(this.f13640a);
        g7.p8.s(parcel, 2, 4);
        parcel.writeInt(this.f13641b);
        g7.p8.s(parcel, 3, 4);
        parcel.writeInt(this.f13642c);
        g7.p8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g7.p8.s(parcel, 5, 8);
        parcel.writeLong(this.f13643e);
        g7.p8.r(parcel, q10);
    }
}
