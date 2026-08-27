package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class z extends z5.a {
    public static final Parcelable.Creator<z> CREATOR = new c(21);

    public final int f12858a;

    public final m f12859b;

    public z(int i10, m mVar) {
        this.f12858a = i10;
        this.f12859b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12858a);
        r8.k(parcel, 3, this.f12859b, i10);
        r8.r(parcel, iQ);
    }
}
