package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class c2d extends b4 {
    public static final Parcelable.Creator<c2d> CREATOR = new hx6((byte) 22);
    public final int a;
    public final String b;
    public final int c;

    public c2d(int i, int i2, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.l(parcel, 2, this.b);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        mve.s(parcel, r);
    }
}
