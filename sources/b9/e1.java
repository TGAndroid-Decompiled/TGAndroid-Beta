package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
import java.util.List;
public final class e1 extends r6.a {
    public static final Parcelable.Creator<e1> CREATOR = new o0(11);
    public final int f2966a;
    public final List f2967b;
    public final b1 f2968c;

    public e1(int i7, ArrayList arrayList, b1 b1Var) {
        this.f2966a = i7;
        this.f2967b = arrayList;
        this.f2968c = b1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f2966a);
        cc.p(parcel, 2, this.f2967b);
        cc.k(parcel, 3, this.f2968c, i7);
        cc.s(parcel, r10);
    }
}
