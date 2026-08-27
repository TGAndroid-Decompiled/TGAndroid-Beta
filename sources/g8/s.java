package g8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class s extends z5.a {
    public static final Parcelable.Creator<s> CREATOR = new f4.e(17);

    public String f6782a;

    public Bundle f6783b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f6782a);
        r8.b(parcel, 3, this.f6783b);
        r8.r(parcel, iQ);
    }
}
