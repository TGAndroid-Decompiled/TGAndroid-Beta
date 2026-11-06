package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class s0 extends r6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int f3101a;
    public final int f3102b;
    public final byte[] f3103c;

    public s0(int i7, int i10, byte[] bArr) {
        this.f3101a = i7;
        this.f3102b = i10;
        this.f3103c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f3101a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3102b);
        wb.c(parcel, 3, this.f3103c);
        wb.s(parcel, r10);
    }
}
