package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class kge extends c4 {
    public static final Parcelable.Creator<kge> CREATOR = new g3e((byte) 18);
    public final int a;

    public kge(int i) {
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
