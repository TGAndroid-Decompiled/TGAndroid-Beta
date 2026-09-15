package g8;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(7);
    public final List f9508a;
    public final boolean f9509b;
    public final boolean f9510c;

    public e(ArrayList arrayList, boolean z10, boolean z11) {
        this.f9508a = arrayList;
        this.f9509b = z10;
        this.f9510c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.p(parcel, 1, DesugarCollections.unmodifiableList(this.f9508a));
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f9509b ? 1 : 0);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f9510c ? 1 : 0);
        e0.r(parcel, q6);
    }
}
