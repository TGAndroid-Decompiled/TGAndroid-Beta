package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ty5 extends b4 {
    public static final Parcelable.Creator<ty5> CREATOR = new jid((byte) 22);
    public String a;
    public String b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
