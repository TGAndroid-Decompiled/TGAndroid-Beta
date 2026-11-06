package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new j7.b(25);
    public final List f16582a;
    public final boolean f16583b;
    public final boolean f16584c;

    public c(ArrayList arrayList, boolean z9, boolean z10) {
        this.f16582a = arrayList;
        this.f16583b = z9;
        this.f16584c = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.p(parcel, 1, DesugarCollections.unmodifiableList(this.f16582a));
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f16583b ? 1 : 0);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f16584c ? 1 : 0);
        xb.s(parcel, r10);
    }
}
