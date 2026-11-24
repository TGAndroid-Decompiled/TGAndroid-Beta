package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class g9f extends b4 {
    public static final Parcelable.Creator<g9f> CREATOR = new c0f((byte) 18);
    public final int a;
    public final ArrayList b;
    public final zle c;

    public g9f(int i, ArrayList arrayList, zle zleVar) {
        this.a = i;
        this.b = arrayList;
        this.c = zleVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.p(parcel, 2, this.b);
        jte.k(parcel, 3, this.c, i);
        jte.s(parcel, r);
    }
}
