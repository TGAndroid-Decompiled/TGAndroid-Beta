package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class g1e extends c4 {
    public static final Parcelable.Creator<g1e> CREATOR = new hud((byte) 27);
    public final int a;
    public final qde b;

    public g1e(int i, qde qdeVar) {
        this.a = i;
        this.b = qdeVar;
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
