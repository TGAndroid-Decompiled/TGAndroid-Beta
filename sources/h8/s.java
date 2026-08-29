package h8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class s extends a6.a {
    public static final Parcelable.Creator<s> CREATOR = new g8.b(16);
    public String f7929a;
    public Bundle f7930b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f7929a);
        com.google.android.gms.internal.cast.o.b(parcel, 3, this.f7930b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
