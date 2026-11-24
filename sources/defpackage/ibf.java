package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class ibf extends b4 {
    public static final Parcelable.Creator<ibf> CREATOR = new e2f((byte) 18);
    public final int a;
    public final ArrayList b;
    public final boe c;

    public ibf(int i, ArrayList arrayList, boe boeVar) {
        this.a = i;
        this.b = arrayList;
        this.c = boeVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.p(parcel, 2, this.b);
        mve.k(parcel, 3, this.c, i);
        mve.s(parcel, r);
    }
}
