package h8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import f7.t0;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(21);
    public final byte[] f13983a;

    public d(byte[] bArr) {
        this.f13983a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.c(parcel, 2, this.f13983a);
        bc.s(parcel, r10);
    }
}
