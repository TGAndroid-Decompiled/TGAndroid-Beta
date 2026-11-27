package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class j3e extends c4 {
    public static final Parcelable.Creator<j3e> CREATOR = new g3e((byte) 11);
    public final int a;

    public j3e(int i) {
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
