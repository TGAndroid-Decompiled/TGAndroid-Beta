package g8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class l extends z5.a {
    public static final Parcelable.Creator<l> CREATOR = new f4.e(13);

    public int f6761a;

    public Bundle f6762b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        int i11 = this.f6761a;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        r8.b(parcel, 3, this.f6762b);
        r8.r(parcel, iQ);
    }
}
