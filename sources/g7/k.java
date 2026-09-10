package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new e6.i(23);
    public final Bundle f8634a;

    public k(Bundle responseBundle) {
        kotlin.jvm.internal.i.e(responseBundle, "responseBundle");
        this.f8634a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = e0.q(dest, 20293);
        e0.b(dest, 1, this.f8634a);
        e0.r(dest, q6);
    }
}
