package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new j7.b(25);
    public final List f17323a;
    public final boolean f17324b;
    public final boolean f17325c;

    public c(ArrayList arrayList, boolean z10, boolean z11) {
        this.f17323a = arrayList;
        this.f17324b = z10;
        this.f17325c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.p(parcel, 1, DesugarCollections.unmodifiableList(this.f17323a));
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f17324b ? 1 : 0);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f17325c ? 1 : 0);
        bc.s(parcel, r10);
    }
}
