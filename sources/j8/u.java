package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class u extends z5.a {
    public static final Parcelable.Creator<u> CREATOR = new c(16);

    public final int f12839a;

    public final boolean f12840b;

    public u(int i10, boolean z10) {
        this.f12839a = i10;
        this.f12840b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12839a);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f12840b ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
