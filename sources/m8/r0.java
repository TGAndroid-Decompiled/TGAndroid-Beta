package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class r0 extends c6.a {
    public static final Parcelable.Creator<r0> CREATOR = new o0(3);
    public final int f13567a;
    public final m f13568b;

    public r0(int i10, m mVar) {
        this.f13567a = i10;
        this.f13568b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13567a);
        g5.k(parcel, 3, this.f13568b, i10);
        g5.r(parcel, q10);
    }
}
