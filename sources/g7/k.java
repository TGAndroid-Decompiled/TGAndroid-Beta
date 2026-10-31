package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new e6.p(22);
    public final Bundle f7443a;

    public k(Bundle responseBundle) {
        kotlin.jvm.internal.i.e(responseBundle, "responseBundle");
        this.f7443a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = h0.q(dest, 20293);
        h0.b(dest, 1, this.f7443a);
        h0.r(dest, q6);
    }
}
