package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new t(6);
    public ArrayList f9253a;
    public String f9254b;
    public String f9255c;
    public ArrayList d;
    public boolean e;
    public String f9256f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.h(parcel, 2, this.f9253a);
        f5.l(parcel, 4, this.f9254b);
        f5.l(parcel, 5, this.f9255c);
        f5.h(parcel, 6, this.d);
        boolean z4 = this.e;
        f5.s(parcel, 7, 4);
        parcel.writeInt(z4 ? 1 : 0);
        f5.l(parcel, 8, this.f9256f);
        f5.r(parcel, q10);
    }
}
