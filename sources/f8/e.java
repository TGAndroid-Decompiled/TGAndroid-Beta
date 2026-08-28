package f8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new r(10);
    public ArrayList f5924a;
    public String f5925b;
    public String f5926c;
    public ArrayList d;
    public boolean f5927e;
    public String f5928f;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.h(parcel, 2, this.f5924a);
        p8.l(parcel, 4, this.f5925b);
        p8.l(parcel, 5, this.f5926c);
        p8.h(parcel, 6, this.d);
        boolean z10 = this.f5927e;
        p8.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p8.l(parcel, 8, this.f5928f);
        p8.r(parcel, q10);
    }
}
