package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class mgb extends b4 {
    public static final Parcelable.Creator<mgb> CREATOR = new b1d((byte) 0);
    public final int a;
    public List b;

    public mgb(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.p(parcel, 2, this.b);
        jte.s(parcel, r);
    }
}
