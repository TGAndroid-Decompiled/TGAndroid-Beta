package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import j7.f5;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new t(2);
    public String f9244a;
    public String f9245b;
    public String f9246c;
    public int d;
    public UserAddress e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f9244a);
        f5.l(parcel, 2, this.f9245b);
        f5.l(parcel, 3, this.f9246c);
        int i11 = this.d;
        f5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f5.k(parcel, 5, this.e, i10);
        f5.r(parcel, q10);
    }
}
