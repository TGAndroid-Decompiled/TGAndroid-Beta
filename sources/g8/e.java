package g8;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(7);
    public final List f9495a;
    public final boolean f9496b;
    public final boolean f9497c;

    public e(ArrayList arrayList, boolean z10, boolean z11) {
        this.f9495a = arrayList;
        this.f9496b = z10;
        this.f9497c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.p(parcel, 1, DesugarCollections.unmodifiableList(this.f9495a));
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f9496b ? 1 : 0);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f9497c ? 1 : 0);
        f0.r(parcel, q6);
    }
}
