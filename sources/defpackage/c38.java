package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class c38 extends c4 {
    public static final Parcelable.Creator<c38> CREATOR = new m9d((byte) 15);
    public int a;
    public Bundle b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 2, 4);
        parcel.writeInt(i2);
        bye.b(parcel, 3, this.b);
        bye.s(parcel, r);
    }
}
