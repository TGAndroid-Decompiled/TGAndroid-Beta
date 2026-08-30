package j8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import j7.f5;
public final class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new f8.o(23);
    public String f9271a;
    public b f9272b;
    public UserAddress f9273c;
    public k d;
    public String e;
    public Bundle f9274f;
    public String h;
    public Bundle f9275n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f9271a);
        f5.k(parcel, 2, this.f9272b, i10);
        f5.k(parcel, 3, this.f9273c, i10);
        f5.k(parcel, 4, this.d, i10);
        f5.l(parcel, 5, this.e);
        f5.b(parcel, 6, this.f9274f);
        f5.l(parcel, 7, this.h);
        f5.b(parcel, 8, this.f9275n);
        f5.r(parcel, q10);
    }
}
