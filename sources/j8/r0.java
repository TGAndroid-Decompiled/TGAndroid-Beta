package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class r0 extends z5.a {
    public static final Parcelable.Creator<r0> CREATOR = new o0(3);

    public final int f12828a;

    public final m f12829b;

    public r0(int i10, m mVar) {
        this.f12828a = i10;
        this.f12829b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12828a);
        r8.k(parcel, 3, this.f12829b, i10);
        r8.r(parcel, iQ);
    }
}
