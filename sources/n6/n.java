package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new m8.h(15);
    public final int f17220a;
    public final boolean f17221b;
    public final boolean f17222c;
    public final int d;
    public final int e;

    public n(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f17220a = i10;
        this.f17221b = z10;
        this.f17222c = z11;
        this.d = i11;
        this.e = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f17220a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f17221b ? 1 : 0);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f17222c ? 1 : 0);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        w7.f0.r(parcel, q6);
    }
}
