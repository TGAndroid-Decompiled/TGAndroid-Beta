package g8;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import w7.c0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(7);
    public final List f10411a;
    public final boolean f10412b;
    public final boolean f10413c;

    public e(ArrayList arrayList, boolean z10, boolean z11) {
        this.f10411a = arrayList;
        this.f10412b = z10;
        this.f10413c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.p(parcel, 1, DesugarCollections.unmodifiableList(this.f10411a));
        c0.s(parcel, 2, 4);
        parcel.writeInt(this.f10412b ? 1 : 0);
        c0.s(parcel, 3, 4);
        parcel.writeInt(this.f10413c ? 1 : 0);
        c0.r(parcel, q6);
    }
}
