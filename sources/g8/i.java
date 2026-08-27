package g8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import h7.r8;

public final class i extends z5.a {
    public static final Parcelable.Creator<i> CREATOR = new f4.e(10);

    public String f6745a;

    public b f6746b;

    public UserAddress f6747c;
    public k d;

    public String f6748e;

    public Bundle f6749f;
    public String h;

    public Bundle f6750n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.f6745a);
        r8.k(parcel, 2, this.f6746b, i10);
        r8.k(parcel, 3, this.f6747c, i10);
        r8.k(parcel, 4, this.d, i10);
        r8.l(parcel, 5, this.f6748e);
        r8.b(parcel, 6, this.f6749f);
        r8.l(parcel, 7, this.h);
        r8.b(parcel, 8, this.f6750n);
        r8.r(parcel, iQ);
    }
}
