package o8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import java.util.List;
import m8.i;
import w7.h0;
public final class f extends o6.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new i(20);
    public final List f14106a;
    public final String f14107b;

    public f(String str, ArrayList arrayList) {
        this.f14106a = arrayList;
        this.f14107b = str;
    }

    @Override
    public final Status a() {
        if (this.f14107b != null) {
            return Status.e;
        }
        return Status.f4333r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.n(parcel, 1, this.f14106a);
        h0.l(parcel, 2, this.f14107b);
        h0.r(parcel, q6);
    }
}
