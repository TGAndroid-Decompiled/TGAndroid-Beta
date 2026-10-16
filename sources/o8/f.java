package o8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import java.util.List;
import w7.f0;
public final class f extends o6.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(21);
    public final List f16307a;
    public final String f16308b;

    public f(String str, ArrayList arrayList) {
        this.f16307a = arrayList;
        this.f16308b = str;
    }

    @Override
    public final Status h() {
        if (this.f16308b != null) {
            return Status.e;
        }
        return Status.f4887r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.n(parcel, 1, this.f16307a);
        f0.l(parcel, 2, this.f16308b);
        f0.r(parcel, q6);
    }
}
