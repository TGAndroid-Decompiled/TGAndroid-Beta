package g8;

import android.os.Parcel;
import android.os.Parcelable;
import f8.r;
import g7.p8;
public final class f extends y5.a {
    public static final Parcelable.Creator<f> CREATOR = new r(26);
    public long f7438a;
    public long f7439b;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        long j10 = this.f7438a;
        p8.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.f7439b;
        p8.s(parcel, 3, 8);
        parcel.writeLong(j11);
        p8.r(parcel, q10);
    }
}
