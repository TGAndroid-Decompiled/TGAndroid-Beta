package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class g extends z5.a {
    public static final Parcelable.Creator<g> CREATOR = new c(3);

    public final int f12785a;

    public g(int i10) {
        this.f12785a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12785a);
        r8.r(parcel, iQ);
    }
}
