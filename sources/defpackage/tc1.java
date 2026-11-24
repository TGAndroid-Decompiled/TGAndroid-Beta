package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class tc1 extends b4 {
    public static final Parcelable.Creator<tc1> CREATOR = new rpd((byte) 18);
    public String a;
    public String b;
    public String c;
    public int d;
    public UserAddress e;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.l(parcel, 2, this.b);
        jte.l(parcel, 3, this.c);
        int i2 = this.d;
        jte.q(parcel, 4, 4);
        parcel.writeInt(i2);
        jte.k(parcel, 5, this.e, i);
        jte.s(parcel, r);
    }
}
