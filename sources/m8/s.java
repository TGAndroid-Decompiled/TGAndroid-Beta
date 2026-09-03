package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class s extends c6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(14);
    public final int f13571a;
    public final boolean f13572b;

    public s(int i10, boolean z4) {
        this.f13571a = i10;
        this.f13572b = z4;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13571a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f13572b ? 1 : 0);
        g5.r(parcel, q10);
    }
}
