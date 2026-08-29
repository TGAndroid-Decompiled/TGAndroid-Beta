package i8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.ArrayList;
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new i4.g(4);
    public String f8560a;
    public String f8561b;
    public ArrayList f8562c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.f8560a);
        o.l(parcel, 3, this.f8561b);
        o.p(parcel, 4, this.f8562c);
        o.r(parcel, q6);
    }
}
