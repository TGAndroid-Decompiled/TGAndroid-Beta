package h8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import f7.t0;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(21);
    public final byte[] f14277a;

    public d(byte[] bArr) {
        this.f14277a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.c(parcel, 2, this.f14277a);
        wb.s(parcel, r10);
    }
}
