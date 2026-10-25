package k8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import h8.j;
import o6.l;
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(14);
    public final String f16442a;

    public e(String str) {
        l.i(str, "json must not be null");
        this.f16442a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f16442a);
        df.r(parcel, q5);
    }
}
