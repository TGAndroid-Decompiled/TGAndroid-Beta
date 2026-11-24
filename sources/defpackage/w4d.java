package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
public final class w4d extends b4 implements uc9 {
    public static final Parcelable.Creator<w4d> CREATOR = new d3d((byte) 10);
    public final ArrayList a;
    public final String b;

    public w4d(String str, ArrayList arrayList) {
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
        int r = mve.r(parcel, 20293);
        mve.n(parcel, 1, this.a);
        mve.l(parcel, 2, this.b);
        mve.s(parcel, r);
    }
}
