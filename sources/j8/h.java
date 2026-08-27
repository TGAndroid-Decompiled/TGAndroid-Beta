package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new c(4);

    public final int f12787a;

    public h(int i10) {
        this.f12787a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12787a);
        r8.r(parcel, iQ);
    }
}
