package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class yh2 extends b4 {
    public static final Parcelable.Creator<yh2> CREATOR = new x21((byte) 8);
    public final boolean a;

    public yh2(boolean z) {
        this.a = z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        jte.s(parcel, r);
    }
}
