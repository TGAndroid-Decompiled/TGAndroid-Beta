package c8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import j7.g5;
import java.util.ArrayList;
import java.util.List;
public final class f extends c6.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new b9.e(3);
    public final List f2323a;
    public final String f2324b;

    public f(String str, ArrayList arrayList) {
        this.f2323a = arrayList;
        this.f2324b = str;
    }

    @Override
    public final Status i() {
        if (this.f2324b != null) {
            return Status.f2642e;
        }
        return Status.f2645r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.n(parcel, 1, this.f2323a);
        g5.l(parcel, 2, this.f2324b);
        g5.r(parcel, q10);
    }
}
