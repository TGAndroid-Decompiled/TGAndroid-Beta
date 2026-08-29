package h8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class m extends a6.a {
    public static final Parcelable.Creator<m> CREATOR = new g8.b(14);
    public ArrayList f7910a;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.n(parcel, 1, this.f7910a);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
