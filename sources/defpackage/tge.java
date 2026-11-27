package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class tge extends c4 {
    public static final Parcelable.Creator<tge> CREATOR = new g3e((byte) 29);
    public final String a;
    public final String b;
    public final float c;
    public final int d;

    public tge(float f, int i, String str, String str2) {
        this.b = str2;
        this.c = f;
        this.a = str;
        this.d = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.b);
        bye.q(parcel, 3, 4);
        parcel.writeFloat(this.c);
        bye.l(parcel, 4, this.a);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        bye.s(parcel, r);
    }
}
