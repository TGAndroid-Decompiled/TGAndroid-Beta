package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class jkd extends c4 {
    public static final Parcelable.Creator<jkd> CREATOR = new ced((byte) 27);
    public final int a;

    public jkd(int i) {
        this.a = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.s(parcel, r);
    }
}
