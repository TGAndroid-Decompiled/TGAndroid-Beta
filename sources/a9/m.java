package a9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class m extends q6.a {
    public static final Parcelable.Creator<m> CREATOR = new c(10);
    public final int f222a;
    public final List f223b;

    public m(int i3, ArrayList arrayList) {
        this.f222a = i3;
        this.f223b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f222a);
        j8.a.q(parcel, 3, this.f223b);
        j8.a.t(parcel, s6);
    }
}
