package h8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class l extends a6.a {
    public static final Parcelable.Creator<l> CREATOR = new g8.b(12);
    public int f7908a;
    public Bundle f7909b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        int i11 = this.f7908a;
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.b(parcel, 3, this.f7909b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
