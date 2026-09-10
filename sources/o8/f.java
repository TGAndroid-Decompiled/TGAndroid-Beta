package o8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import java.util.List;
import w7.e0;
public final class f extends o6.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(23);
    public final List f14278a;
    public final String f14279b;

    public f(String str, ArrayList arrayList) {
        this.f14278a = arrayList;
        this.f14279b = str;
    }

    @Override
    public final Status i() {
        if (this.f14279b != null) {
            return Status.e;
        }
        return Status.f4795r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.n(parcel, 1, this.f14278a);
        e0.l(parcel, 2, this.f14279b);
        e0.r(parcel, q6);
    }
}
