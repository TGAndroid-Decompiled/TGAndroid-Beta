package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class j extends c6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f13532a;
    public final boolean f13533b;
    public final boolean f13534c;
    public final boolean d;
    public final boolean f13535e;

    public j(int i10, boolean z4, boolean z10, boolean z11, boolean z12) {
        this.f13532a = i10;
        this.f13533b = z4;
        this.f13534c = z10;
        this.d = z11;
        this.f13535e = z12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f13532a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13533b ? 1 : 0);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f13534c ? 1 : 0);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.f13535e ? 1 : 0);
        g5.r(parcel, q10);
    }
}
