package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.List;
public final class p extends c6.a {
    public static final Parcelable.Creator<p> CREATOR = new w.a(20);
    public final int f1767a;
    public List f1768b;

    public p(int i10, List list) {
        this.f1767a = i10;
        this.f1768b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f1767a);
        g5.p(parcel, 2, this.f1768b);
        g5.r(parcel, q10);
    }
}
