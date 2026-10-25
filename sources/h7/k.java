package h7;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class k extends p6.a {
    public static final Parcelable.Creator<k> CREATOR = new f6.i(23);
    public final Bundle f12697a;

    public k(Bundle responseBundle) {
        kotlin.jvm.internal.i.e(responseBundle, "responseBundle");
        this.f12697a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q5 = df.q(dest, 20293);
        df.b(dest, 1, this.f12697a);
        df.r(dest, q5);
    }
}
