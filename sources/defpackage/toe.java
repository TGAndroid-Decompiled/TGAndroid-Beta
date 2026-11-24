package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class toe extends b4 {
    public static final Parcelable.Creator<toe> CREATOR = new sje((byte) 14);
    public final int a;
    public final float b;
    public final int c;

    public toe(int i, int i2, float f, int i3) {
        if (i == 1) {
            this.a = i2;
            this.b = f;
            this.c = i3;
            return;
        }
        u36.j("Unknown language.");
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(1);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 4, 4);
        parcel.writeFloat(this.b);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.c);
        mve.s(parcel, r);
    }
}
