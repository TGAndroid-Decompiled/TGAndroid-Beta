package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class fvd extends b4 {
    public static final Parcelable.Creator<fvd> CREATOR = new rpd((byte) 23);
    public final int a;
    public final ArrayList b;

    public fvd(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.p(parcel, 3, this.b);
        jte.s(parcel, r);
    }
}
