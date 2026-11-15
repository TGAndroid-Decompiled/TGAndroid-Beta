package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new j7.b(25);
    public final List f16938a;
    public final boolean f16939b;
    public final boolean f16940c;

    public c(ArrayList arrayList, boolean z10, boolean z11) {
        this.f16938a = arrayList;
        this.f16939b = z10;
        this.f16940c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.p(parcel, 1, DesugarCollections.unmodifiableList(this.f16938a));
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f16939b ? 1 : 0);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f16940c ? 1 : 0);
        yb.s(parcel, r10);
    }
}
