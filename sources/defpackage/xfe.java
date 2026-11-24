package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class xfe extends b4 {
    public static final Parcelable.Creator<xfe> CREATOR = new t0e((byte) 28);
    public final int a;
    public final long b;
    public final ArrayList c;

    public xfe(int i, long j, ArrayList arrayList) {
        this.a = i;
        this.b = j;
        this.c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        mve.p(parcel, 4, this.c);
        mve.s(parcel, r);
    }
}
