package h8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;

public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new h5.h(8);

    public String f8596a;

    public String f8597b;

    public ArrayList f8598c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f8596a);
        r8.l(parcel, 3, this.f8597b);
        r8.p(parcel, 4, this.f8598c);
        r8.r(parcel, iQ);
    }
}
