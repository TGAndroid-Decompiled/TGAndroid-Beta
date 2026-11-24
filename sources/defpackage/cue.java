package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class cue extends b4 {
    public static final Parcelable.Creator<cue> CREATOR = new sje((byte) 5);
    public int a;
    public boolean b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.b;
        mve.q(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        mve.s(parcel, r);
    }
}
