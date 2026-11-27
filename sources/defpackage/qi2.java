package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class qi2 extends c4 {
    public static final Parcelable.Creator<qi2> CREATOR = new g31((byte) 6);
    public final boolean a;

    public qi2(boolean z) {
        this.a = z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bye.s(parcel, r);
    }
}
