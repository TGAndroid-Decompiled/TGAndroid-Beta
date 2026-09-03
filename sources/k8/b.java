package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import j8.t;
import java.util.ArrayList;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new t(18);
    public String f10026a;
    public String f10027b;
    public ArrayList f10028c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f10026a);
        f5.l(parcel, 3, this.f10027b);
        f5.p(parcel, 4, this.f10028c);
        f5.r(parcel, q10);
    }
}
