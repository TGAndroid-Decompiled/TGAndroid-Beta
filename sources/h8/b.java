package h8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new g8.b(18);
    public String f7862a;
    public String f7863b;
    public String f7864c;
    public int d;
    public UserAddress f7865e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 1, this.f7862a);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f7863b);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f7864c);
        int i11 = this.d;
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.k(parcel, 5, this.f7865e, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
