package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class bd1 extends c4 {
    public static final Parcelable.Creator<bd1> CREATOR = new hud((byte) 18);
    public String a;
    public String b;
    public String c;
    public int d;
    public UserAddress e;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.l(parcel, 2, this.b);
        bye.l(parcel, 3, this.c);
        int i2 = this.d;
        bye.q(parcel, 4, 4);
        parcel.writeInt(i2);
        bye.k(parcel, 5, this.e, i);
        bye.s(parcel, r);
    }
}
