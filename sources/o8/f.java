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
    public final List f16981a;
    public final String f16982b;

    public f(String str, ArrayList arrayList) {
        this.f16981a = arrayList;
        this.f16982b = str;
    }

    @Override
    public final Status i() {
        if (this.f16982b != null) {
            return Status.f4942e;
        }
        return Status.f4945r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.n(parcel, 1, this.f16981a);
        e0.l(parcel, 2, this.f16982b);
        e0.r(parcel, q6);
    }
}
