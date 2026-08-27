package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class s extends z5.a {
    public static final Parcelable.Creator<s> CREATOR = new c(14);

    public final int f12830a;

    public final boolean f12831b;

    public s(int i10, boolean z10) {
        this.f12830a = i10;
        this.f12831b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12830a);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f12831b ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
