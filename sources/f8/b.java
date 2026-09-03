package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new b9.e(22);
    public int f6039a;
    public int f6040b;
    public int f6041c;
    public int d;
    public int e;
    public int f6042f;
    public boolean h;
    public String f6043n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.f6039a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f6040b;
        f5.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f6041c;
        f5.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        f5.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.e;
        f5.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f6042f;
        f5.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z4 = this.h;
        f5.s(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        f5.l(parcel, 9, this.f6043n);
        f5.r(parcel, q10);
    }
}
