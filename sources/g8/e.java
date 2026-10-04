package g8;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import w7.g0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(7);
    public final List f10340a;
    public final boolean f10341b;
    public final boolean f10342c;

    public e(ArrayList arrayList, boolean z10, boolean z11) {
        this.f10340a = arrayList;
        this.f10341b = z10;
        this.f10342c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.p(parcel, 1, DesugarCollections.unmodifiableList(this.f10340a));
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f10341b ? 1 : 0);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f10342c ? 1 : 0);
        g0.r(parcel, q6);
    }
}
