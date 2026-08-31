package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import j7.g5;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new t(2);
    public String f9869a;
    public String f9870b;
    public String f9871c;
    public int d;
    public UserAddress f9872e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.f9869a);
        g5.l(parcel, 2, this.f9870b);
        g5.l(parcel, 3, this.f9871c);
        int i11 = this.d;
        g5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g5.k(parcel, 5, this.f9872e, i10);
        g5.r(parcel, q10);
    }
}
