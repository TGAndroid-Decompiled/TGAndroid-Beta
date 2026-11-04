package i7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new c0(21);
    public final String f14679a;
    public final Bundle f14680b;

    public g(String type, Bundle data) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(data, "data");
        this.f14679a = type;
        this.f14680b = data;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i3) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int s6 = j8.a.s(dest, 20293);
        j8.a.m(dest, 1, this.f14679a);
        j8.a.c(dest, 2, this.f14680b);
        j8.a.t(dest, s6);
    }
}
