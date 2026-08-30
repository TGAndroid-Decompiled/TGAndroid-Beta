package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new t(3);
    public ArrayList f9247a;
    public boolean f9248b;
    public boolean f9249c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.h(parcel, 1, this.f9247a);
        boolean z4 = this.f9248b;
        f5.s(parcel, 2, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.f9249c;
        f5.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.d;
        f5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f5.r(parcel, q10);
    }
}
