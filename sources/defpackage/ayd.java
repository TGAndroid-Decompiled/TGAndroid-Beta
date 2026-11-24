package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ayd extends b4 {
    public static final Parcelable.Creator<ayd> CREATOR = new urd((byte) 25);
    public final int a;
    public final String b;

    public ayd(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.l(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
