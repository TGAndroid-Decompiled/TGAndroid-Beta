package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new b(6);
    public final String f17331a;
    public final Bundle f17332b;

    public h(String type, Bundle data) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(data, "data");
        this.f17331a = type;
        this.f17332b = data;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.l(dest, 1, this.f17331a);
        bc.b(dest, 2, this.f17332b);
        bc.s(dest, r10);
    }
}
