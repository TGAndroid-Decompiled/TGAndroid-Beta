package h7;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class g extends p6.a {
    public static final Parcelable.Creator<g> CREATOR = new f6.i(18);
    public final String f12689a;
    public final Bundle f12690b;

    public g(String type, Bundle data) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(data, "data");
        this.f12689a = type;
        this.f12690b = data;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q5 = df.q(dest, 20293);
        df.l(dest, 1, this.f12689a);
        df.b(dest, 2, this.f12690b);
        df.r(dest, q5);
    }
}
