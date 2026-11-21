package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new j7.b(25);
    public final List f17345a;
    public final boolean f17346b;
    public final boolean f17347c;

    public c(ArrayList arrayList, boolean z10, boolean z11) {
        this.f17345a = arrayList;
        this.f17346b = z10;
        this.f17347c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.p(parcel, 1, DesugarCollections.unmodifiableList(this.f17345a));
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f17346b ? 1 : 0);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f17347c ? 1 : 0);
        bc.s(parcel, r10);
    }
}
