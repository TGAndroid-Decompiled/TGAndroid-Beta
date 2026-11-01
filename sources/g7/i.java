package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new e6.p(19);
    public final Bundle f7442a;

    public i(Bundle responseBundle) {
        kotlin.jvm.internal.i.e(responseBundle, "responseBundle");
        this.f7442a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = h0.q(dest, 20293);
        h0.b(dest, 1, this.f7442a);
        h0.r(dest, q6);
    }
}
