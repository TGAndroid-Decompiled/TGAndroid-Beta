package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class mt5 extends b4 {
    public static final Parcelable.Creator<mt5> CREATOR = new e2f((byte) 16);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.h(parcel, 2, this.a);
        mve.l(parcel, 4, this.b);
        mve.l(parcel, 5, this.c);
        mve.h(parcel, 6, this.d);
        boolean z = this.e;
        mve.q(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        mve.l(parcel, 8, this.f);
        mve.s(parcel, r);
    }
}
