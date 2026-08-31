package j8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import j7.g5;
public final class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new f8.o(23);
    public String f9899a;
    public b f9900b;
    public UserAddress f9901c;
    public k d;
    public String f9902e;
    public Bundle f9903f;
    public String h;
    public Bundle f9904n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.f9899a);
        g5.k(parcel, 2, this.f9900b, i10);
        g5.k(parcel, 3, this.f9901c, i10);
        g5.k(parcel, 4, this.d, i10);
        g5.l(parcel, 5, this.f9902e);
        g5.b(parcel, 6, this.f9903f);
        g5.l(parcel, 7, this.h);
        g5.b(parcel, 8, this.f9904n);
        g5.r(parcel, q10);
    }
}
