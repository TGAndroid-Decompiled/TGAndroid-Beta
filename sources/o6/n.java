package o6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class n extends p6.a {
    public static final Parcelable.Creator<n> CREATOR = new n4.x(15);
    public final int f19163a;
    public final boolean f19164b;
    public final boolean f19165c;
    public final int d;
    public final int e;

    public n(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f19163a = i10;
        this.f19164b = z10;
        this.f19165c = z11;
        this.d = i11;
        this.e = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f19163a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f19164b ? 1 : 0);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f19165c ? 1 : 0);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        df.r(parcel, q5);
    }
}
