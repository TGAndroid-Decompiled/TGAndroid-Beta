package g8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;

public final class c extends z5.a {
    public static final Parcelable.Creator<c> CREATOR = new f4.e(20);

    public ArrayList f6719a;

    public boolean f6720b;

    public boolean f6721c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.h(parcel, 1, this.f6719a);
        boolean z10 = this.f6720b;
        r8.s(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f6721c;
        r8.s(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i11 = this.d;
        r8.s(parcel, 4, 4);
        parcel.writeInt(i11);
        r8.r(parcel, iQ);
    }
}
