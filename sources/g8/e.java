package g8;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(7);
    public final List f10926a;
    public final boolean f10927b;
    public final boolean f10928c;

    public e(ArrayList arrayList, boolean z10, boolean z11) {
        this.f10926a = arrayList;
        this.f10927b = z10;
        this.f10928c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.p(parcel, 1, DesugarCollections.unmodifiableList(this.f10926a));
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f10927b ? 1 : 0);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f10928c ? 1 : 0);
        f0.r(parcel, q6);
    }
}
