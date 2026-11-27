package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class v18 extends c4 {
    public static final Parcelable.Creator<v18> CREATOR = new m9d((byte) 9);
    public boolean a;
    public boolean b;
    public cd1 c;
    public boolean d;
    public eka e;
    public ArrayList f;
    public c38 h;
    public m2c n;
    public boolean r;
    public String s;
    public Bundle w;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        boolean z = this.a;
        bye.q(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.b;
        bye.q(parcel, 2, 4);
        parcel.writeInt(z2 ? 1 : 0);
        bye.k(parcel, 3, this.c, i);
        boolean z3 = this.d;
        bye.q(parcel, 4, 4);
        parcel.writeInt(z3 ? 1 : 0);
        bye.k(parcel, 5, this.e, i);
        bye.h(parcel, 6, this.f);
        bye.k(parcel, 7, this.h, i);
        bye.k(parcel, 8, this.n, i);
        boolean z4 = this.r;
        bye.q(parcel, 9, 4);
        parcel.writeInt(z4 ? 1 : 0);
        bye.l(parcel, 10, this.s);
        bye.b(parcel, 11, this.w);
        bye.s(parcel, r);
    }
}
