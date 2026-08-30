package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
import java.util.List;
public final class e1 extends c6.a {
    public static final Parcelable.Creator<e1> CREATOR = new o0(11);
    public final int f13802a;
    public final List f13803b;
    public final b1 f13804c;

    public e1(int i10, ArrayList arrayList, b1 b1Var) {
        this.f13802a = i10;
        this.f13803b = arrayList;
        this.f13804c = b1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f13802a);
        f5.p(parcel, 2, this.f13803b);
        f5.k(parcel, 3, this.f13804c, i10);
        f5.r(parcel, q10);
    }
}
