package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class xdf extends c4 {
    public static final Parcelable.Creator<xdf> CREATOR = new t4f((byte) 18);
    public final int a;
    public final ArrayList b;
    public final qqe c;

    public xdf(int i, ArrayList arrayList, qqe qqeVar) {
        this.a = i;
        this.b = arrayList;
        this.c = qqeVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.p(parcel, 2, this.b);
        bye.k(parcel, 3, this.c, i);
        bye.s(parcel, r);
    }
}
