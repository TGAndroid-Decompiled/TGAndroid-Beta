package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class qwe extends c4 {
    public static final Parcelable.Creator<qwe> CREATOR = new ime((byte) 5);
    public int a;
    public boolean b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.b;
        bye.q(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        bye.s(parcel, r);
    }
}
