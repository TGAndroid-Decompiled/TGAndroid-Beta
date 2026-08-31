package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import j8.t;
import java.util.ArrayList;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new t(18);
    public String f10780a;
    public String f10781b;
    public ArrayList f10782c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f10780a);
        g5.l(parcel, 3, this.f10781b);
        g5.p(parcel, 4, this.f10782c);
        g5.r(parcel, q10);
    }
}
