package g8;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import w7.g0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(7);
    public final List f10339a;
    public final boolean f10340b;
    public final boolean f10341c;

    public e(ArrayList arrayList, boolean z10, boolean z11) {
        this.f10339a = arrayList;
        this.f10340b = z10;
        this.f10341c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.p(parcel, 1, DesugarCollections.unmodifiableList(this.f10339a));
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f10340b ? 1 : 0);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f10341c ? 1 : 0);
        g0.r(parcel, q6);
    }
}
