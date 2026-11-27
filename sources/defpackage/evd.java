package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class evd extends c4 {
    public static final Parcelable.Creator<evd> CREATOR = new hud((byte) 2);
    public final int a;
    public final ArrayList b;

    public evd(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.p(parcel, 3, this.b);
        bye.s(parcel, r);
    }
}
