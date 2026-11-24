package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class q08 extends b4 {
    public static final Parcelable.Creator<q08> CREATOR = new v6d((byte) 4);
    public String a;
    public be1 b;
    public UserAddress c;
    public y18 d;
    public String e;
    public Bundle f;
    public String h;
    public Bundle n;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.k(parcel, 2, this.b, i);
        mve.k(parcel, 3, this.c, i);
        mve.k(parcel, 4, this.d, i);
        mve.l(parcel, 5, this.e);
        mve.b(parcel, 6, this.f);
        mve.l(parcel, 7, this.h);
        mve.b(parcel, 8, this.n);
        mve.s(parcel, r);
    }
}
