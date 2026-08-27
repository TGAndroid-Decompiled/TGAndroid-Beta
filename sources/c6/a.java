package c6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class a extends z5.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(25);

    public final boolean f2450a;

    public final int f2451b;

    public a(int i10, boolean z10) {
        this.f2450a = z10;
        this.f2451b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f2450a ? 1 : 0);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f2451b);
        r8.r(parcel, iQ);
    }
}
