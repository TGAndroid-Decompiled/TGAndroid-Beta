package e6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import d7.r0;
public final class b0 extends p6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(27);
    public final int f9801a;

    public b0(int i10) {
        this.f9801a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f9801a);
        df.r(parcel, q5);
    }
}
