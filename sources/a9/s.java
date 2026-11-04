package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class s extends q6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(16);
    public final int f246a;
    public final boolean f247b;

    public s(int i3, boolean z10) {
        this.f246a = i3;
        this.f247b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f246a);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f247b ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
