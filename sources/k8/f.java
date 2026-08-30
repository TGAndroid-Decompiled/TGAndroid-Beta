package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import j8.t;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new t(22);
    public long f10058a;
    public long f10059b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        long j10 = this.f10058a;
        f5.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.f10059b;
        f5.s(parcel, 3, 8);
        parcel.writeLong(j11);
        f5.r(parcel, q10);
    }
}
