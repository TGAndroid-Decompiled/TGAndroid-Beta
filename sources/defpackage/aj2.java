package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class aj2 extends c4 {
    public static final Parcelable.Creator<aj2> CREATOR = new g31((byte) 9);
    public final boolean a;

    public aj2(boolean z) {
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
