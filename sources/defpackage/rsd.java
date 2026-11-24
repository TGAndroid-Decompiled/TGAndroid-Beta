package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class rsd extends b4 {
    public static final Parcelable.Creator<rsd> CREATOR = new urd((byte) 2);
    public final int a;
    public final ArrayList b;

    public rsd(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.p(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
