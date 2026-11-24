package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class bne extends b4 {
    public static final Parcelable.Creator<bne> CREATOR = new rhe((byte) 19);
    public final boolean a;

    public bne(boolean z) {
        this.a = z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        jte.s(parcel, r);
    }
}
