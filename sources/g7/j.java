package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new e6.i(21);
    public final Bundle f10402a;

    public j(Bundle responseBundle) {
        kotlin.jvm.internal.i.e(responseBundle, "responseBundle");
        this.f10402a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = c0.q(dest, 20293);
        c0.b(dest, 1, this.f10402a);
        c0.r(dest, q6);
    }
}
