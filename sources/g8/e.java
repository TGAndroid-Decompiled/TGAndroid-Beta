package g8;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(7);
    public final List f10504a;
    public final boolean f10505b;
    public final boolean f10506c;

    public e(ArrayList arrayList, boolean z10, boolean z11) {
        this.f10504a = arrayList;
        this.f10505b = z10;
        this.f10506c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.p(parcel, 1, DesugarCollections.unmodifiableList(this.f10504a));
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f10505b ? 1 : 0);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f10506c ? 1 : 0);
        e0.r(parcel, q6);
    }
}
