package h8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class c extends a6.a {
    public static final Parcelable.Creator<c> CREATOR = new g8.b(19);
    public ArrayList f7866a;
    public boolean f7867b;
    public boolean f7868c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.h(parcel, 1, this.f7866a);
        boolean z10 = this.f7867b;
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f7868c;
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i11 = this.d;
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
