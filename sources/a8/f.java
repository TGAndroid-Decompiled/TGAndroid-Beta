package a8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new w.a(2);
    public final String f134a;

    public f(String str) {
        this.f134a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f134a);
        f5.r(parcel, q10);
    }
}
