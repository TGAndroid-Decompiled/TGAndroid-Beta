package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
public final class u2d extends b4 implements ua9 {
    public static final Parcelable.Creator<u2d> CREATOR = new b1d((byte) 10);
    public final ArrayList a;
    public final String b;

    public u2d(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override
    public final Status a() {
        if (this.b != null) {
            return Status.e;
        }
        return Status.r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.n(parcel, 1, this.a);
        jte.l(parcel, 2, this.b);
        jte.s(parcel, r);
    }
}
