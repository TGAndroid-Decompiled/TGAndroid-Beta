package k7;

import android.os.Parcel;
import android.os.Parcelable;

public final class ag extends z5.a {
    public static final Parcelable.Creator<ag> CREATOR = new cg(0);

    public final int f14494a;

    public final int f14495b;

    public final int f14496c;
    public final int d;

    public final long f14497e;

    public ag(int i10, int i11, int i12, long j10, int i13) {
        this.f14494a = i10;
        this.f14495b = i11;
        this.f14496c = i12;
        this.d = i13;
        this.f14497e = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = h7.r8.q(parcel, 20293);
        h7.r8.s(parcel, 1, 4);
        parcel.writeInt(this.f14494a);
        h7.r8.s(parcel, 2, 4);
        parcel.writeInt(this.f14495b);
        h7.r8.s(parcel, 3, 4);
        parcel.writeInt(this.f14496c);
        h7.r8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        h7.r8.s(parcel, 5, 8);
        parcel.writeLong(this.f14497e);
        h7.r8.r(parcel, iQ);
    }
}
