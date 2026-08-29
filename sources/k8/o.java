package k8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class o extends a6.a {
    public static final Parcelable.Creator<o> CREATOR = new c(10);
    public final int f13538a;
    public final List f13539b;

    public o(int i10, ArrayList arrayList) {
        this.f13538a = i10;
        this.f13539b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13538a);
        com.google.android.gms.internal.cast.o.p(parcel, 3, this.f13539b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
