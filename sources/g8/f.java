package g8;

import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
public final class f extends q6.a {
    public static final Parcelable.Creator<f> CREATOR = new c0(8);
    public final byte[] f12038a;

    public f(byte[] bArr) {
        this.f12038a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.d(parcel, 1, this.f12038a);
        j8.a.t(parcel, s6);
    }
}
