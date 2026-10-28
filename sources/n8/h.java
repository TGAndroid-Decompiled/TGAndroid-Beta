package n8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import n4.x;
public final class h extends p6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(8);
    public final int f18739a;
    public final boolean f18740b;

    public h(int i10, boolean z10) {
        this.f18739a = i10;
        this.f18740b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f18739a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f18740b ? 1 : 0);
        df.r(parcel, q5);
    }
}
