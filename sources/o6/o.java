package o6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class o extends p6.a {
    public static final Parcelable.Creator<o> CREATOR = new n4.x(11);
    public final int f19165a;
    public List f19166b;

    public o(int i10, List list) {
        this.f19165a = i10;
        this.f19166b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f19165a);
        df.p(parcel, 2, this.f19166b);
        df.r(parcel, q5);
    }
}
