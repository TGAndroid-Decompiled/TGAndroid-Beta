package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new b(9);
    public final Bundle f16929a;

    public k(Bundle responseBundle) {
        kotlin.jvm.internal.j.e(responseBundle, "responseBundle");
        this.f16929a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = yb.r(dest, 20293);
        yb.b(dest, 1, this.f16929a);
        yb.s(dest, r10);
    }
}
