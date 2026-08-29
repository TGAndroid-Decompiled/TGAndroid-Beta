package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new d6.d(3);
    public int f5471a;
    public int f5472b;
    public int f5473c;
    public int d;
    public int f5474e;
    public int f5475f;
    public boolean h;
    public String f5476n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        int i11 = this.f5471a;
        o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f5472b;
        o.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f5473c;
        o.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        o.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.f5474e;
        o.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f5475f;
        o.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z10 = this.h;
        o.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        o.l(parcel, 9, this.f5476n);
        o.r(parcel, q6);
    }
}
