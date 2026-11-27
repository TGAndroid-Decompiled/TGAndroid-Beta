package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class an9 extends c4 {
    public static final Parcelable.Creator<an9> CREATOR = new m9d((byte) 17);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public an9(int i, int i2, int i3, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        bye.s(parcel, r);
    }
}
