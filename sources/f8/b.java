package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new b9.e(22);
    public int f6163a;
    public int f6164b;
    public int f6165c;
    public int d;
    public int f6166e;
    public int f6167f;
    public boolean h;
    public String f6168n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.f6163a;
        g5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f6164b;
        g5.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f6165c;
        g5.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        g5.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.f6166e;
        g5.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f6167f;
        g5.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z4 = this.h;
        g5.s(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        g5.l(parcel, 9, this.f6168n);
        g5.r(parcel, q10);
    }
}
