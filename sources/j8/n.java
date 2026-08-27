package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class n extends z5.a {
    public static final Parcelable.Creator<n> CREATOR = new c(9);

    public final int f12810a;

    public final int f12811b;

    public n(int i10, int i11) {
        this.f12810a = i10;
        this.f12811b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12810a);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f12811b);
        r8.r(parcel, iQ);
    }
}
