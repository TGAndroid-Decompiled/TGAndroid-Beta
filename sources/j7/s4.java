package j7;

import android.os.Parcel;
import android.os.Parcelable;
public final class s4 extends a6.a {
    public static final Parcelable.Creator<s4> CREATOR = new t5(0);
    public final String f11172a;
    public final String f11173b;
    public final float f11174c;
    public final int d;

    public s4(float f9, int i10, String str, String str2) {
        this.f11173b = str2;
        this.f11174c = f9;
        this.f11172a = str;
        this.d = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f11173b);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeFloat(this.f11174c);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.f11172a);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
