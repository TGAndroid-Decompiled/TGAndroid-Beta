package g8;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import w7.d0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(7);
    public final List f10412a;
    public final boolean f10413b;
    public final boolean f10414c;

    public e(ArrayList arrayList, boolean z10, boolean z11) {
        this.f10412a = arrayList;
        this.f10413b = z10;
        this.f10414c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.p(parcel, 1, DesugarCollections.unmodifiableList(this.f10412a));
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f10413b ? 1 : 0);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f10414c ? 1 : 0);
        d0.r(parcel, q6);
    }
}
