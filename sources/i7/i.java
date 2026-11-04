package i7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
public final class i extends q6.a {
    public static final Parcelable.Creator<i> CREATOR = new c0(23);
    public final Bundle f14686a;

    public i(Bundle responseBundle) {
        kotlin.jvm.internal.j.e(responseBundle, "responseBundle");
        this.f14686a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i3) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int s6 = j8.a.s(dest, 20293);
        j8.a.c(dest, 1, this.f14686a);
        j8.a.t(dest, s6);
    }
}
