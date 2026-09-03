package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class s extends c6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(14);
    public final int f13837a;
    public final boolean f13838b;

    public s(int i10, boolean z4) {
        this.f13837a = i10;
        this.f13838b = z4;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13837a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f13838b ? 1 : 0);
        f5.r(parcel, q10);
    }
}
