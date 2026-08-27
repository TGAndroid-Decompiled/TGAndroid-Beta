package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;
import java.util.List;

public final class e1 extends z5.a {
    public static final Parcelable.Creator<e1> CREATOR = new o0(11);

    public final int f12777a;

    public final List f12778b;

    public final b1 f12779c;

    public e1(int i10, ArrayList arrayList, b1 b1Var) {
        this.f12777a = i10;
        this.f12778b = arrayList;
        this.f12779c = b1Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f12777a);
        r8.p(parcel, 2, this.f12778b);
        r8.k(parcel, 3, this.f12779c, i10);
        r8.r(parcel, iQ);
    }
}
