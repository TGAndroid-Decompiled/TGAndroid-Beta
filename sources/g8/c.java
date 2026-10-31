package g8;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import w7.h0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g(6);
    public final List f7450a;
    public final boolean f7451b;
    public final boolean f7452c;

    public c(ArrayList arrayList, boolean z10, boolean z11) {
        this.f7450a = arrayList;
        this.f7451b = z10;
        this.f7452c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.p(parcel, 1, DesugarCollections.unmodifiableList(this.f7450a));
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f7451b ? 1 : 0);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.f7452c ? 1 : 0);
        h0.r(parcel, q6);
    }
}
