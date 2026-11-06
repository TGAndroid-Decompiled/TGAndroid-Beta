package h8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import f7.t0;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new t0(22);
    public final byte[] f14278a;

    public e(byte[] bArr) {
        this.f14278a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.c(parcel, 2, this.f14278a);
        wb.s(parcel, r10);
    }
}
