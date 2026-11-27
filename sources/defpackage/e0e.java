package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class e0e extends c4 {
    public static final Parcelable.Creator<e0e> CREATOR = new hud((byte) 24);
    public final int a;
    public final aud b;

    public e0e(int i, aud audVar) {
        this.a = i;
        this.b = audVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.k(parcel, 3, this.b, i);
        bye.s(parcel, r);
    }
}
