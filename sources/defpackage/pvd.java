package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class pvd extends c4 {
    public static final Parcelable.Creator<pvd> CREATOR = new hud((byte) 3);
    public final int a;
    public final idd b;

    public pvd(int i, idd iddVar) {
        this.a = i;
        this.b = iddVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.k(parcel, 3, this.b, i);
        bye.s(parcel, r);
    }
}
