package h8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class e extends a6.a {
    public static final Parcelable.Creator<e> CREATOR = new g8.b(22);
    public ArrayList f7872a;
    public String f7873b;
    public String f7874c;
    public ArrayList d;
    public boolean f7875e;
    public String f7876f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.h(parcel, 2, this.f7872a);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.f7873b);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.f7874c);
        com.google.android.gms.internal.cast.o.h(parcel, 6, this.d);
        boolean z10 = this.f7875e;
        com.google.android.gms.internal.cast.o.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.cast.o.l(parcel, 8, this.f7876f);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
