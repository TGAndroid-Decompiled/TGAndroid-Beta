package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class z05 extends b4 {
    public static final Parcelable.Creator<z05> CREATOR = new hx6((byte) 27);
    public final int a;
    public final int b;
    public final Bundle c;

    public z05(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        mve.b(parcel, 3, this.c);
        mve.s(parcel, r);
    }
}
