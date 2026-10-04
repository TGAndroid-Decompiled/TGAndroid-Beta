package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new e6.i(18);
    public final String f10323a;
    public final Bundle f10324b;

    public g(String type, Bundle data) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(data, "data");
        this.f10323a = type;
        this.f10324b = data;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = g0.q(dest, 20293);
        g0.l(dest, 1, this.f10323a);
        g0.b(dest, 2, this.f10324b);
        g0.r(dest, q6);
    }
}
