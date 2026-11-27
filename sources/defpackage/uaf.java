package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class uaf extends c4 {
    public static final Parcelable.Creator<uaf> CREATOR = new t4f((byte) 10);
    public final String a;
    public final float b;
    public final String c;
    public final int d;

    public uaf(float f, int i, String str, String str2) {
        this.a = str;
        this.b = f;
        this.c = str2;
        this.d = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.q(parcel, 2, 4);
        parcel.writeFloat(this.b);
        bye.l(parcel, 3, this.c);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bye.s(parcel, r);
    }
}
