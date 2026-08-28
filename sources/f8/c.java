package f8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
public final class c extends y5.a {
    public static final Parcelable.Creator<c> CREATOR = new r(7);
    public ArrayList f5918a;
    public boolean f5919b;
    public boolean f5920c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.h(parcel, 1, this.f5918a);
        boolean z10 = this.f5919b;
        p8.s(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f5920c;
        p8.s(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i10 = this.d;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i10);
        p8.r(parcel, q10);
    }
}
