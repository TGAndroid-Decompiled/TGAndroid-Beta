package l7;

import android.os.Parcel;
import android.os.Parcelable;
public final class jg extends a6.a {
    public static final Parcelable.Creator<jg> CREATOR = new cg(3);
    public final boolean f14851a;
    public final boolean f14852b;
    public final boolean f14853c;
    public final boolean d;
    public final boolean f14854e;

    public jg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f14851a = z10;
        this.f14852b = z11;
        this.f14853c = z12;
        this.d = z13;
        this.f14854e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f14851a ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f14852b ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f14853c ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.f14854e ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
