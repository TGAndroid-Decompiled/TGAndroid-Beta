package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class ore extends c4 {
    public static final Parcelable.Creator<ore> CREATOR = new ime((byte) 17);
    public Bundle a;
    public a94[] b;
    public int c;
    public ys2 d;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.b(parcel, 1, this.a);
        bye.o(parcel, 2, this.b, i);
        int i2 = this.c;
        bye.q(parcel, 3, 4);
        parcel.writeInt(i2);
        bye.k(parcel, 4, this.d, i);
        bye.s(parcel, r);
    }
}
