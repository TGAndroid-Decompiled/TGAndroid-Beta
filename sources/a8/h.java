package a8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new w.a(5);
    public final String f138a;

    public h(String str) {
        this.f138a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f138a);
        f5.r(parcel, q10);
    }
}
