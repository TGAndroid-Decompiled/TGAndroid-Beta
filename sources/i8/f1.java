package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
import java.util.List;
public final class f1 extends y5.a {
    public static final Parcelable.Creator<f1> CREATOR = new p0(11);
    public final int f10982a;
    public final List f10983b;
    public final c1 f10984c;

    public f1(int i9, ArrayList arrayList, c1 c1Var) {
        this.f10982a = i9;
        this.f10983b = arrayList;
        this.f10984c = c1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f10982a);
        p8.p(parcel, 2, this.f10983b);
        p8.k(parcel, 3, this.f10984c, i9);
        p8.r(parcel, q10);
    }
}
