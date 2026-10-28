package o6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class n extends p6.a {
    public static final Parcelable.Creator<n> CREATOR = new n4.x(15);
    public final int f19162a;
    public final boolean f19163b;
    public final boolean f19164c;
    public final int d;
    public final int e;

    public n(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f19162a = i10;
        this.f19163b = z10;
        this.f19164c = z11;
        this.d = i11;
        this.e = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f19162a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f19163b ? 1 : 0);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f19164c ? 1 : 0);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        df.r(parcel, q5);
    }
}
