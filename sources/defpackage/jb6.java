package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
public final class jb6 extends b4 {
    public static final Parcelable.Creator<jb6> CREATOR = new xff((byte) 15);
    public final ArrayList a;
    public final boolean b;
    public final boolean c;

    public jb6(ArrayList arrayList, boolean z, boolean z2) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.p(parcel, 1, DesugarCollections.unmodifiableList(this.a));
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        jte.s(parcel, r);
    }
}
