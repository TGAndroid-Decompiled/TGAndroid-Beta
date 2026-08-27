package c6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class c extends z5.a {
    public static final Parcelable.Creator<c> CREATOR = new w.a(27);

    public final int f2453a;

    public final boolean f2454b;

    public c(int i10, boolean z10) {
        this.f2453a = i10;
        this.f2454b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f2453a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f2454b ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
