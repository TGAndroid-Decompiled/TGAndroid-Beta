package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new b(6);
    public final String f16921a;
    public final Bundle f16922b;

    public h(String type, Bundle data) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(data, "data");
        this.f16921a = type;
        this.f16922b = data;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = yb.r(dest, 20293);
        yb.l(dest, 1, this.f16921a);
        yb.b(dest, 2, this.f16922b);
        yb.s(dest, r10);
    }
}
