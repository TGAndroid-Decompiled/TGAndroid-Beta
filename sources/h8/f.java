package h8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import f7.t0;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new t0(23);
    public final byte[] f13982a;

    public f(byte[] bArr) {
        this.f13982a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.c(parcel, 1, this.f13982a);
        bc.s(parcel, r10);
    }
}
