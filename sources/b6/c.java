package b6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class c extends y5.a {
    public static final Parcelable.Creator<c> CREATOR = new w.a(16);
    public final int f1546a;
    public final boolean f1547b;

    public c(int i9, boolean z10) {
        this.f1546a = i9;
        this.f1547b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f1546a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f1547b ? 1 : 0);
        p8.r(parcel, q10);
    }
}
