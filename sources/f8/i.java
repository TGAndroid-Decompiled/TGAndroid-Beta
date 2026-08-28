package f8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import g7.p8;
public final class i extends y5.a {
    public static final Parcelable.Creator<i> CREATOR = new c.c(27);
    public String f5944a;
    public b f5945b;
    public UserAddress f5946c;
    public k d;
    public String f5947e;
    public Bundle f5948f;
    public String h;
    public Bundle f5949n;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.f5944a);
        p8.k(parcel, 2, this.f5945b, i9);
        p8.k(parcel, 3, this.f5946c, i9);
        p8.k(parcel, 4, this.d, i9);
        p8.l(parcel, 5, this.f5947e);
        p8.b(parcel, 6, this.f5948f);
        p8.l(parcel, 7, this.h);
        p8.b(parcel, 8, this.f5949n);
        p8.r(parcel, q10);
    }
}
