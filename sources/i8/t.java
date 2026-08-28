package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class t extends y5.a {
    public static final Parcelable.Creator<t> CREATOR = new c(15);
    public final int f11035a;
    public final boolean f11036b;
    public final boolean f11037c;

    public t(int i9, boolean z10, boolean z11) {
        this.f11035a = i9;
        this.f11036b = z10;
        this.f11037c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11035a);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f11036b ? 1 : 0);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.f11037c ? 1 : 0);
        p8.r(parcel, q10);
    }
}
