package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import j8.t;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new t(20);
    public String f10783a;
    public d f10784b;
    public f f10785c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f10783a);
        g5.k(parcel, 3, this.f10784b, i10);
        g5.k(parcel, 5, this.f10785c, i10);
        g5.r(parcel, q10);
    }
}
