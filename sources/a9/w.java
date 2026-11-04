package a9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class w extends q6.a {
    public static final Parcelable.Creator<w> CREATOR = new c(20);
    public final int f265a;
    public final List f266b;

    public w(int i3, ArrayList arrayList) {
        this.f265a = i3;
        this.f266b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f265a);
        j8.a.q(parcel, 3, this.f266b);
        j8.a.t(parcel, s6);
    }
}
