package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
public final class id6 extends b4 {
    public static final Parcelable.Creator<id6> CREATOR = new yhf((byte) 15);
    public final ArrayList a;
    public final boolean b;
    public final boolean c;

    public id6(ArrayList arrayList, boolean z, boolean z2) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.p(parcel, 1, DesugarCollections.unmodifiableList(this.a));
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        mve.s(parcel, r);
    }
}
