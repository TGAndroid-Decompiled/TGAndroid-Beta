package j8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;
public final class j extends c6.a {
    public static final Parcelable.Creator<j> CREATOR = new f8.o(24);
    public boolean f9905a;
    public boolean f9906b;
    public c f9907c;
    public boolean d;
    public m f9908e;
    public ArrayList f9909f;
    public l h;
    public n f9910n;
    public boolean f9911r;
    public String f9912s;
    public Bundle v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        boolean z4 = this.f9905a;
        g5.s(parcel, 1, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.f9906b;
        g5.s(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g5.k(parcel, 3, this.f9907c, i10);
        boolean z11 = this.d;
        g5.s(parcel, 4, 4);
        parcel.writeInt(z11 ? 1 : 0);
        g5.k(parcel, 5, this.f9908e, i10);
        g5.h(parcel, 6, this.f9909f);
        g5.k(parcel, 7, this.h, i10);
        g5.k(parcel, 8, this.f9910n, i10);
        boolean z12 = this.f9911r;
        g5.s(parcel, 9, 4);
        parcel.writeInt(z12 ? 1 : 0);
        g5.l(parcel, 10, this.f9912s);
        g5.b(parcel, 11, this.v);
        g5.r(parcel, q10);
    }
}
