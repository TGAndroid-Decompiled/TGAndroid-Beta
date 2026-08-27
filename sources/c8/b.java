package c8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new o(0);

    public int f2503a;

    public int f2504b;

    public int f2505c;
    public int d;

    public int f2506e;

    public int f2507f;
    public boolean h;

    public String f2508n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        int i11 = this.f2503a;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f2504b;
        r8.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f2505c;
        r8.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        r8.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.f2506e;
        r8.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f2507f;
        r8.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z10 = this.h;
        r8.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        r8.l(parcel, 9, this.f2508n);
        r8.r(parcel, iQ);
    }
}
