package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class nr5 extends b4 {
    public static final Parcelable.Creator<nr5> CREATOR = new c0f((byte) 16);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.h(parcel, 2, this.a);
        jte.l(parcel, 4, this.b);
        jte.l(parcel, 5, this.c);
        jte.h(parcel, 6, this.d);
        boolean z = this.e;
        jte.q(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        jte.l(parcel, 8, this.f);
        jte.s(parcel, r);
    }
}
