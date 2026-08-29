package h8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class i extends a6.a {
    public static final Parcelable.Creator<i> CREATOR = new g8.b(9);
    public String f7892a;
    public b f7893b;
    public UserAddress f7894c;
    public k d;
    public String f7895e;
    public Bundle f7896f;
    public String h;
    public Bundle f7897n;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 1, this.f7892a);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.f7893b, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f7894c, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 4, this.d, i10);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.f7895e);
        com.google.android.gms.internal.cast.o.b(parcel, 6, this.f7896f);
        com.google.android.gms.internal.cast.o.l(parcel, 7, this.h);
        com.google.android.gms.internal.cast.o.b(parcel, 8, this.f7897n);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
