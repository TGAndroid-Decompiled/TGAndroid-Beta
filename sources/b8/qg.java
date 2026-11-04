package b8;

import android.os.Parcel;
import android.os.Parcelable;
public final class qg extends q6.a {
    public static final Parcelable.Creator<qg> CREATOR = new sg(0);
    public final int f3029a;
    public final int f3030b;
    public final int f3031c;
    public final int d;
    public final long f3032e;

    public qg(int i3, int i10, int i11, long j10, int i12) {
        this.f3029a = i3;
        this.f3030b = i10;
        this.f3031c = i11;
        this.d = i12;
        this.f3032e = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f3029a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f3030b);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f3031c);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        j8.a.r(parcel, 5, 8);
        parcel.writeLong(this.f3032e);
        j8.a.t(parcel, s6);
    }
}
