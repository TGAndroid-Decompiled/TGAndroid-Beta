package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.List;
public final class p extends c6.a {
    public static final Parcelable.Creator<p> CREATOR = new w.a(20);
    public final int f1644a;
    public List f1645b;

    public p(int i10, List list) {
        this.f1644a = i10;
        this.f1645b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f1644a);
        f5.p(parcel, 2, this.f1645b);
        f5.r(parcel, q10);
    }
}
