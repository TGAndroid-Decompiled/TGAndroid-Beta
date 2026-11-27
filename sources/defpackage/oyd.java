package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class oyd extends c4 {
    public static final Parcelable.Creator<oyd> CREATOR = new hud((byte) 20);
    public final int a;
    public final String b;

    public oyd(int i, String str) {
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
