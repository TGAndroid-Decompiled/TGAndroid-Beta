package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class s4d extends c4 {
    public static final Parcelable.Creator<s4d> CREATOR = new mx6((byte) 22);
    public final int a;
    public final String b;
    public final int c;

    public s4d(int i, int i2, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.l(parcel, 2, this.b);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        bye.s(parcel, r);
    }
}
