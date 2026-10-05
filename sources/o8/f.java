package o8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import java.util.List;
import w7.g0;
public final class f extends o6.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(23);
    public final List f17150a;
    public final String f17151b;

    public f(String str, ArrayList arrayList) {
        this.f17150a = arrayList;
        this.f17151b = str;
    }

    @Override
    public final Status i() {
        if (this.f17151b != null) {
            return Status.f6469e;
        }
        return Status.f6472r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.n(parcel, 1, this.f17150a);
        g0.l(parcel, 2, this.f17151b);
        g0.r(parcel, q6);
    }
}
