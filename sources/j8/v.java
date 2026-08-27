package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class v extends z5.a {
    public static final Parcelable.Creator<v> CREATOR = new c(17);

    public final int f12843a;

    public final String f12844b;

    public v(int i10, String str) {
        this.f12843a = i10;
        this.f12844b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12843a);
        r8.l(parcel, 3, this.f12844b);
        r8.r(parcel, iQ);
    }
}
