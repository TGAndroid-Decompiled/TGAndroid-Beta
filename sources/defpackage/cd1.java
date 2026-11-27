package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class cd1 extends c4 {
    public static final Parcelable.Creator<cd1> CREATOR = new g3e((byte) 10);
    public ArrayList a;
    public boolean b;
    public boolean c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.h(parcel, 1, this.a);
        boolean z = this.b;
        bye.q(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.c;
        bye.q(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i2 = this.d;
        bye.q(parcel, 4, 4);
        parcel.writeInt(i2);
        bye.s(parcel, r);
    }
}
