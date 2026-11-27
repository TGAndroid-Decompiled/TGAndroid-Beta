package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class mfe extends c4 {
    public static final Parcelable.Creator<mfe> CREATOR = new g3e((byte) 17);
    public final int a;
    public final aud b;

    public mfe(int i, aud audVar) {
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
