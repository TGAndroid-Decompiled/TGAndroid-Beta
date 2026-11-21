package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
import java.util.List;
public final class e1 extends r6.a {
    public static final Parcelable.Creator<e1> CREATOR = new o0(11);
    public final int f3008a;
    public final List f3009b;
    public final b1 f3010c;

    public e1(int i7, ArrayList arrayList, b1 b1Var) {
        this.f3008a = i7;
        this.f3009b = arrayList;
        this.f3010c = b1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f3008a);
        bc.p(parcel, 2, this.f3009b);
        bc.k(parcel, 3, this.f3010c, i7);
        bc.s(parcel, r10);
    }
}
