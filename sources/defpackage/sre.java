package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class sre extends c4 {
    public static final Parcelable.Creator<sre> CREATOR = new ime((byte) 19);
    public final boolean a;

    public sre(boolean z) {
        this.a = z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bye.s(parcel, r);
    }
}
