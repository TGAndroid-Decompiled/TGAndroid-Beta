package f6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new i(1);
    public final int f10187a;
    public final int f10188b;
    public final int f10189c;

    public b(int i10, int i11, int i12) {
        this.f10187a = i10;
        this.f10188b = i11;
        this.f10189c = i12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f10187a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f10188b);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.f10189c);
        df.r(parcel, q5);
    }
}
