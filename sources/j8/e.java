package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new t(6);
    public ArrayList f9879a;
    public String f9880b;
    public String f9881c;
    public ArrayList d;
    public boolean f9882e;
    public String f9883f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.h(parcel, 2, this.f9879a);
        g5.l(parcel, 4, this.f9880b);
        g5.l(parcel, 5, this.f9881c);
        g5.h(parcel, 6, this.d);
        boolean z4 = this.f9882e;
        g5.s(parcel, 7, 4);
        parcel.writeInt(z4 ? 1 : 0);
        g5.l(parcel, 8, this.f9883f);
        g5.r(parcel, q10);
    }
}
