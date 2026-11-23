package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new b(6);
    public final String f17397a;
    public final Bundle f17398b;

    public h(String type, Bundle data) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(data, "data");
        this.f17397a = type;
        this.f17398b = data;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = cc.r(dest, 20293);
        cc.l(dest, 1, this.f17397a);
        cc.b(dest, 2, this.f17398b);
        cc.s(dest, r10);
    }
}
