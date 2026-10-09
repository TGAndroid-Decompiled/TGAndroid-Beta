package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new e6.i(20);
    public final Bundle f10403a;

    public i(Bundle responseBundle) {
        kotlin.jvm.internal.i.e(responseBundle, "responseBundle");
        this.f10403a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = d0.q(dest, 20293);
        d0.b(dest, 1, this.f10403a);
        d0.r(dest, q6);
    }
}
