package j8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class s extends c6.a {
    public static final Parcelable.Creator<s> CREATOR = new t(0);
    public String f9305a;
    public Bundle f9306b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f9305a);
        f5.b(parcel, 3, this.f9306b);
        f5.r(parcel, q10);
    }
}
