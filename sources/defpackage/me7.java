package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class me7 extends b4 {
    public static final Parcelable.Creator<me7> CREATOR = new hv6((byte) 29);
    public final boolean a;
    public final int b;

    public me7(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.s(parcel, r);
    }
}
