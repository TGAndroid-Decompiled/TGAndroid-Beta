package b6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class a extends y5.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(14);
    public final boolean f1543a;
    public final int f1544b;

    public a(int i9, boolean z10) {
        this.f1543a = z10;
        this.f1544b = i9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f1543a ? 1 : 0);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f1544b);
        p8.r(parcel, q10);
    }
}
