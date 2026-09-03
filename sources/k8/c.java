package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import j8.t;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new t(20);
    public String f10029a;
    public d f10030b;
    public f f10031c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f10029a);
        f5.k(parcel, 3, this.f10030b, i10);
        f5.k(parcel, 5, this.f10031c, i10);
        f5.r(parcel, q10);
    }
}
