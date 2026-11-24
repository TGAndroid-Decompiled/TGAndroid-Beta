package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class be1 extends b4 {
    public static final Parcelable.Creator<be1> CREATOR = new urd((byte) 18);
    public String a;
    public String b;
    public String c;
    public int d;
    public UserAddress e;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.l(parcel, 2, this.b);
        mve.l(parcel, 3, this.c);
        int i2 = this.d;
        mve.q(parcel, 4, 4);
        parcel.writeInt(i2);
        mve.k(parcel, 5, this.e, i);
        mve.s(parcel, r);
    }
}
