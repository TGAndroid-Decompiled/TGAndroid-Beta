package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new e6.p(17);
    public final String f7436a;
    public final Bundle f7437b;

    public g(String type, Bundle data) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(data, "data");
        this.f7436a = type;
        this.f7437b = data;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = h0.q(dest, 20293);
        h0.l(dest, 1, this.f7436a);
        h0.b(dest, 2, this.f7437b);
        h0.r(dest, q6);
    }
}
