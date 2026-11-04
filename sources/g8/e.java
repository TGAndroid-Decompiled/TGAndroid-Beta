package g8;

import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
public final class e extends q6.a {
    public static final Parcelable.Creator<e> CREATOR = new c0(7);
    public final byte[] f12037a;

    public e(byte[] bArr) {
        this.f12037a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.d(parcel, 2, this.f12037a);
        j8.a.t(parcel, s6);
    }
}
