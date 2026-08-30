package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class r0 extends c6.a {
    public static final Parcelable.Creator<r0> CREATOR = new o0(3);
    public final int f13851a;
    public final m f13852b;

    public r0(int i10, m mVar) {
        this.f13851a = i10;
        this.f13852b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13851a);
        f5.k(parcel, 3, this.f13852b, i10);
        f5.r(parcel, q10);
    }
}
