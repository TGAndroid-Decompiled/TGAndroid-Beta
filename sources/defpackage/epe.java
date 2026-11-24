package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class epe extends b4 {
    public static final Parcelable.Creator<epe> CREATOR = new sje((byte) 19);
    public final boolean a;

    public epe(boolean z) {
        this.a = z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        mve.s(parcel, r);
    }
}
