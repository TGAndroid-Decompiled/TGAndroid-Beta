package g8;

import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
public final class d extends q6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(6);
    public final byte[] f12036a;

    public d(byte[] bArr) {
        this.f12036a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.d(parcel, 2, this.f12036a);
        j8.a.t(parcel, s6);
    }
}
