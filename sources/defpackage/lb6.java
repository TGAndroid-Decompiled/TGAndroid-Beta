package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
public final class lb6 extends b4 implements ua9 {
    public static final Parcelable.Creator<lb6> CREATOR = new t4d((byte) 3);
    public final Status a;
    public final mb6 b;

    public lb6(Status status, mb6 mb6Var) {
        this.a = status;
        this.b = mb6Var;
    }

    @Override
    public final Status a() {
        return this.a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.k(parcel, 2, this.b, i);
        jte.s(parcel, r);
    }
}
