package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class u18 extends c4 {
    public static final Parcelable.Creator<u18> CREATOR = new m9d((byte) 4);
    public String a;
    public bd1 b;
    public UserAddress c;
    public b38 d;
    public String e;
    public Bundle f;
    public String h;
    public Bundle n;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.k(parcel, 2, this.b, i);
        bye.k(parcel, 3, this.c, i);
        bye.k(parcel, 4, this.d, i);
        bye.l(parcel, 5, this.e);
        bye.b(parcel, 6, this.f);
        bye.l(parcel, 7, this.h);
        bye.b(parcel, 8, this.n);
        bye.s(parcel, r);
    }
}
