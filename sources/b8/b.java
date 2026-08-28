package b8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new w.a(19);
    public int f1597a;
    public int f1598b;
    public int f1599c;
    public int d;
    public int f1600e;
    public int f1601f;
    public boolean h;
    public String f1602n;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.f1597a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.f1598b;
        p8.s(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f1599c;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        p8.s(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f1600e;
        p8.s(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f1601f;
        p8.s(parcel, 7, 4);
        parcel.writeInt(i15);
        boolean z10 = this.h;
        p8.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p8.l(parcel, 9, this.f1602n);
        p8.r(parcel, q10);
    }
}
