package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new m8.h(17);
    public final int f13900a;
    public final boolean f13901b;
    public final boolean f13902c;
    public final int d;
    public final int e;

    public n(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f13900a = i10;
        this.f13901b = z10;
        this.f13902c = z11;
        this.d = i11;
        this.e = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f13900a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f13901b ? 1 : 0);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f13902c ? 1 : 0);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        w7.e0.r(parcel, q6);
    }
}
