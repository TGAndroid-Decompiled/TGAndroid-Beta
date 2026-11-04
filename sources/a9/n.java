package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class n extends q6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(11);
    public final int f226a;
    public final b f227b;

    public n(int i3, b bVar) {
        this.f226a = i3;
        this.f227b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f226a);
        j8.a.l(parcel, 3, this.f227b, i3);
        j8.a.t(parcel, s6);
    }
}
