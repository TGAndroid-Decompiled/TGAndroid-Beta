package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new h(0);
    public final String f16031a;

    public g(String str) {
        this.f16031a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f16031a);
        c0.r(parcel, q6);
    }
}
