package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new e6.i(18);
    public final String f9480a;
    public final Bundle f9481b;

    public g(String type, Bundle data) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(data, "data");
        this.f9480a = type;
        this.f9481b = data;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = f0.q(dest, 20293);
        f0.l(dest, 1, this.f9480a);
        f0.b(dest, 2, this.f9481b);
        f0.r(dest, q6);
    }
}
