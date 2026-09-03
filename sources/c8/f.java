package c8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import j7.f5;
import java.util.ArrayList;
import java.util.List;
public final class f extends c6.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new b9.e(3);
    public final List f2159a;
    public final String f2160b;

    public f(String str, ArrayList arrayList) {
        this.f2159a = arrayList;
        this.f2160b = str;
    }

    @Override
    public final Status i() {
        if (this.f2160b != null) {
            return Status.e;
        }
        return Status.f2700r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.n(parcel, 1, this.f2159a);
        f5.l(parcel, 2, this.f2160b);
        f5.r(parcel, q10);
    }
}
