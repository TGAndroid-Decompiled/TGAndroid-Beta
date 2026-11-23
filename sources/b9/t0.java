package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class t0 extends r6.a {
    public static final Parcelable.Creator<t0> CREATOR = new o0(5);
    public final int f3078a;
    public final int f3079b;
    public final byte[] f3080c;

    public t0(int i7, int i10, byte[] bArr) {
        this.f3078a = i7;
        this.f3079b = i10;
        this.f3080c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f3078a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3079b);
        bc.c(parcel, 3, this.f3080c);
        bc.s(parcel, r10);
    }
}
