package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class did extends b4 {
    public static final Parcelable.Creator<did> CREATOR = new jid((byte) 0);
    public final int a;

    public did(int i) {
        this.a = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.s(parcel, r);
    }
}
