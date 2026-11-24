package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class az4 extends b4 {
    public static final Parcelable.Creator<az4> CREATOR = new hv6((byte) 27);
    public final int a;
    public final int b;
    public final Bundle c;

    public az4(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.b(parcel, 3, this.c);
        jte.s(parcel, r);
    }
}
