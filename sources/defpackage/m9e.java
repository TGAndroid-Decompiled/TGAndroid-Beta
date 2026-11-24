package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class m9e extends b4 {
    public static final Parcelable.Creator<m9e> CREATOR = new qyd((byte) 14);
    public final int a;
    public final oed b;

    public m9e(int i, oed oedVar) {
        this.a = i;
        this.b = oedVar;
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
