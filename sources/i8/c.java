package i8;

import android.os.Parcel;
import android.os.Parcelable;
import i7.p;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class c extends q6.a {
    public static final Parcelable.Creator<c> CREATOR = new p(10);
    public final List f14697a;
    public final boolean f14698b;
    public final boolean f14699c;

    public c(ArrayList arrayList, boolean z10, boolean z11) {
        this.f14697a = arrayList;
        this.f14698b = z10;
        this.f14699c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.q(parcel, 1, DesugarCollections.unmodifiableList(this.f14697a));
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f14698b ? 1 : 0);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f14699c ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
