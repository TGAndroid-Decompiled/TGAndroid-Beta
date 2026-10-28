package o6;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class f0 extends p6.a {
    public static final Parcelable.Creator<f0> CREATOR = new n4.x(17);
    public Bundle f19119a;
    public l6.c[] f19120b;
    public int f19121c;
    public e d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.b(parcel, 1, this.f19119a);
        df.o(parcel, 2, this.f19120b, i10);
        int i11 = this.f19121c;
        df.s(parcel, 3, 4);
        parcel.writeInt(i11);
        df.k(parcel, 4, this.d, i10);
        df.r(parcel, q5);
    }
}
