package a8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new w.a(5);
    public final String f151a;

    public h(String str) {
        this.f151a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f151a);
        g5.r(parcel, q10);
    }
}
