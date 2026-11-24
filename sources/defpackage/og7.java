package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class og7 extends b4 {
    public static final Parcelable.Creator<og7> CREATOR = new hx6((byte) 29);
    public final boolean a;
    public final int b;

    public og7(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        mve.s(parcel, r);
    }
}
