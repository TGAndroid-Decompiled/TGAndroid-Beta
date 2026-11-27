package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class e15 extends c4 {
    public static final Parcelable.Creator<e15> CREATOR = new mx6((byte) 27);
    public final int a;
    public final int b;
    public final Bundle c;

    public e15(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bye.b(parcel, 3, this.c);
        bye.s(parcel, r);
    }
}
