package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class i extends z5.a {
    public static final Parcelable.Creator<i> CREATOR = new c(5);

    public final int f12788a;

    public i(int i10) {
        this.f12788a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12788a);
        r8.r(parcel, iQ);
    }
}
