package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class f8f extends b4 {
    public static final Parcelable.Creator<f8f> CREATOR = new e2f((byte) 10);
    public final String a;
    public final float b;
    public final String c;
    public final int d;

    public f8f(float f, int i, String str, String str2) {
        this.a = str;
        this.b = f;
        this.c = str2;
        this.d = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.q(parcel, 2, 4);
        parcel.writeFloat(this.b);
        mve.l(parcel, 3, this.c);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        mve.s(parcel, r);
    }
}
