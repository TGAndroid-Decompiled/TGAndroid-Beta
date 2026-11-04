package i7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
public final class k extends q6.a {
    public static final Parcelable.Creator<k> CREATOR = new c0(26);
    public final Bundle f14688a;

    public k(Bundle responseBundle) {
        kotlin.jvm.internal.j.e(responseBundle, "responseBundle");
        this.f14688a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i3) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int s6 = j8.a.s(dest, 20293);
        j8.a.c(dest, 1, this.f14688a);
        j8.a.t(dest, s6);
    }
}
