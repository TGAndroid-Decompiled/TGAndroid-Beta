package l8;

import android.os.Parcel;
import android.os.Parcelable;
import i7.p;
import p6.m;
public final class e extends q6.a {
    public static final Parcelable.Creator<e> CREATOR = new p(20);
    public final String f18109a;

    public e(String str) {
        m.h(str, "json must not be null");
        this.f18109a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f18109a);
        j8.a.t(parcel, s6);
    }
}
