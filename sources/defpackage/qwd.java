package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class qwd extends b4 {
    public static final Parcelable.Creator<qwd> CREATOR = new rpd((byte) 27);
    public final int a;
    public final a9e b;

    public qwd(int i, a9e a9eVar) {
        this.a = i;
        this.b = a9eVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.k(parcel, 3, this.b, i);
        jte.s(parcel, r);
    }
}
