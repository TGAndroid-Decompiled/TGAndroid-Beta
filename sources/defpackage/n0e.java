package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class n0e extends c4 {
    public static final Parcelable.Creator<n0e> CREATOR = new hud((byte) 25);
    public final int a;
    public final String b;

    public n0e(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.l(parcel, 3, this.b);
        bye.s(parcel, r);
    }
}
