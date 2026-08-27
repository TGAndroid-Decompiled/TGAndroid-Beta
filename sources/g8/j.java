package g8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;

public final class j extends z5.a {
    public static final Parcelable.Creator<j> CREATOR = new f4.e(11);

    public boolean f6751a;

    public boolean f6752b;

    public c f6753c;
    public boolean d;

    public m f6754e;

    public ArrayList f6755f;
    public l h;

    public n f6756n;

    public boolean f6757r;

    public String f6758s;
    public Bundle v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        boolean z10 = this.f6751a;
        r8.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f6752b;
        r8.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        r8.k(parcel, 3, this.f6753c, i10);
        boolean z12 = this.d;
        r8.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        r8.k(parcel, 5, this.f6754e, i10);
        r8.h(parcel, 6, this.f6755f);
        r8.k(parcel, 7, this.h, i10);
        r8.k(parcel, 8, this.f6756n, i10);
        boolean z13 = this.f6757r;
        r8.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        r8.l(parcel, 10, this.f6758s);
        r8.b(parcel, 11, this.v);
        r8.r(parcel, iQ);
    }
}
