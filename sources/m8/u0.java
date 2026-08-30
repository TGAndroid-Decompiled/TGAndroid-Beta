package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class u0 extends c6.a {
    public static final Parcelable.Creator<u0> CREATOR = new o0(6);
    public final int f13864a;
    public final int f13865b;

    public u0(int i10, int i11) {
        this.f13864a = i10;
        this.f13865b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13864a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f13865b);
        f5.r(parcel, q10);
    }
}
