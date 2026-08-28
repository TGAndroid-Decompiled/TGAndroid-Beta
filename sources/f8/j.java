package f8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
public final class j extends y5.a {
    public static final Parcelable.Creator<j> CREATOR = new c.c(28);
    public boolean f5950a;
    public boolean f5951b;
    public c f5952c;
    public boolean d;
    public m f5953e;
    public ArrayList f5954f;
    public l h;
    public n f5955n;
    public boolean f5956r;
    public String f5957s;
    public Bundle v;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        boolean z10 = this.f5950a;
        p8.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f5951b;
        p8.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        p8.k(parcel, 3, this.f5952c, i9);
        boolean z12 = this.d;
        p8.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        p8.k(parcel, 5, this.f5953e, i9);
        p8.h(parcel, 6, this.f5954f);
        p8.k(parcel, 7, this.h, i9);
        p8.k(parcel, 8, this.f5955n, i9);
        boolean z13 = this.f5956r;
        p8.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        p8.l(parcel, 10, this.f5957s);
        p8.b(parcel, 11, this.v);
        p8.r(parcel, q10);
    }
}
