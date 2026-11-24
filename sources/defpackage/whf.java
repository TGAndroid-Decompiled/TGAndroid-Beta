package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class whf extends b4 {
    public static final Parcelable.Creator<whf> CREATOR = new yhf((byte) 0);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public whf(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        mve.s(parcel, r);
    }
}
