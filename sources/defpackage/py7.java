package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class py7 extends b4 {
    public static final Parcelable.Creator<py7> CREATOR = new t4d((byte) 9);
    public boolean a;
    public boolean b;
    public uc1 c;
    public boolean d;
    public lga e;
    public ArrayList f;
    public wz7 h;
    public myb n;
    public boolean r;
    public String s;
    public Bundle w;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        boolean z = this.a;
        jte.q(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.b;
        jte.q(parcel, 2, 4);
        parcel.writeInt(z2 ? 1 : 0);
        jte.k(parcel, 3, this.c, i);
        boolean z3 = this.d;
        jte.q(parcel, 4, 4);
        parcel.writeInt(z3 ? 1 : 0);
        jte.k(parcel, 5, this.e, i);
        jte.h(parcel, 6, this.f);
        jte.k(parcel, 7, this.h, i);
        jte.k(parcel, 8, this.n, i);
        boolean z4 = this.r;
        jte.q(parcel, 9, 4);
        parcel.writeInt(z4 ? 1 : 0);
        jte.l(parcel, 10, this.s);
        jte.b(parcel, 11, this.w);
        jte.s(parcel, r);
    }
}
