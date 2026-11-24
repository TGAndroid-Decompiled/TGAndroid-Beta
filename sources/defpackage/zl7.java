package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class zl7 extends b4 {
    public static final Parcelable.Creator<zl7> CREATOR = new yhf((byte) 9);
    public final String a;
    public final int b;
    public final String c;

    public zl7(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        mve.l(parcel, 4, this.c);
        mve.s(parcel, r);
    }
}
