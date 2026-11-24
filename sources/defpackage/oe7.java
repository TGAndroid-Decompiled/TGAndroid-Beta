package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class oe7 extends b4 {
    public static final Parcelable.Creator<oe7> CREATOR = new b1d((byte) 5);
    public final int a;
    public final boolean b;

    public oe7(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        jte.s(parcel, r);
    }
}
