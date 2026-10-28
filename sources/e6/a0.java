package e6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import d7.r0;
public final class a0 extends p6.a {
    public static final Parcelable.Creator<a0> CREATOR = new r0(26);
    public final boolean f9790a;

    public a0(boolean z10) {
        this.f9790a = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f9790a ? 1 : 0);
        df.r(parcel, q5);
    }
}
