package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class uy5 extends b4 {
    public static final Parcelable.Creator<uy5> CREATOR = new t0e((byte) 3);
    public String a;
    public String b;
    public ArrayList c;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.p(parcel, 4, this.c);
        mve.s(parcel, r);
    }
}
