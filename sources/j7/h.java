package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new b(6);
    public final String f16568a;
    public final Bundle f16569b;

    public h(String type, Bundle data) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(data, "data");
        this.f16568a = type;
        this.f16569b = data;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.l(dest, 1, this.f16568a);
        xb.b(dest, 2, this.f16569b);
        xb.s(dest, r10);
    }
}
