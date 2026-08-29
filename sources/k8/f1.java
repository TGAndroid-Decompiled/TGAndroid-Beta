package k8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class f1 extends a6.a {
    public static final Parcelable.Creator<f1> CREATOR = new p0(11);
    public final int f13505a;
    public final List f13506b;
    public final c1 f13507c;

    public f1(int i10, ArrayList arrayList, c1 c1Var) {
        this.f13505a = i10;
        this.f13506b = arrayList;
        this.f13507c = c1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f13505a);
        com.google.android.gms.internal.cast.o.p(parcel, 2, this.f13506b);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f13507c, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
