package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new t(3);
    public ArrayList f9873a;
    public boolean f9874b;
    public boolean f9875c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.h(parcel, 1, this.f9873a);
        boolean z4 = this.f9874b;
        g5.s(parcel, 2, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.f9875c;
        g5.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.d;
        g5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g5.r(parcel, q10);
    }
}
