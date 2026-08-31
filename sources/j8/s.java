package j8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class s extends c6.a {
    public static final Parcelable.Creator<s> CREATOR = new t(0);
    public String f9936a;
    public Bundle f9937b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f9936a);
        g5.b(parcel, 3, this.f9937b);
        g5.r(parcel, q10);
    }
}
