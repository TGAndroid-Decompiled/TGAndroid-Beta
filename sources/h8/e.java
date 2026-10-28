package h8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(7);
    public final List f12703a;
    public final boolean f12704b;
    public final boolean f12705c;

    public e(ArrayList arrayList, boolean z10, boolean z11) {
        this.f12703a = arrayList;
        this.f12704b = z10;
        this.f12705c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.p(parcel, 1, DesugarCollections.unmodifiableList(this.f12703a));
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f12704b ? 1 : 0);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f12705c ? 1 : 0);
        df.r(parcel, q5);
    }
}
