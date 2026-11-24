package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class r08 extends b4 {
    public static final Parcelable.Creator<r08> CREATOR = new v6d((byte) 9);
    public boolean a;
    public boolean b;
    public ce1 c;
    public boolean d;
    public nia e;
    public ArrayList f;
    public z18 h;
    public n0c n;
    public boolean r;
    public String s;
    public Bundle w;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        boolean z = this.a;
        mve.q(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.b;
        mve.q(parcel, 2, 4);
        parcel.writeInt(z2 ? 1 : 0);
        mve.k(parcel, 3, this.c, i);
        boolean z3 = this.d;
        mve.q(parcel, 4, 4);
        parcel.writeInt(z3 ? 1 : 0);
        mve.k(parcel, 5, this.e, i);
        mve.h(parcel, 6, this.f);
        mve.k(parcel, 7, this.h, i);
        mve.k(parcel, 8, this.n, i);
        boolean z4 = this.r;
        mve.q(parcel, 9, 4);
        parcel.writeInt(z4 ? 1 : 0);
        mve.l(parcel, 10, this.s);
        mve.b(parcel, 11, this.w);
        mve.s(parcel, r);
    }
}
