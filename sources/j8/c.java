package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new j7.b(25);
    public final List f17414a;
    public final boolean f17415b;
    public final boolean f17416c;

    public c(ArrayList arrayList, boolean z10, boolean z11) {
        this.f17414a = arrayList;
        this.f17415b = z10;
        this.f17416c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.p(parcel, 1, DesugarCollections.unmodifiableList(this.f17414a));
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f17415b ? 1 : 0);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f17416c ? 1 : 0);
        cc.s(parcel, r10);
    }
}
