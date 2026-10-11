package o8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import java.util.List;
import w7.d0;
public final class f extends o6.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(23);
    public final List f17144a;
    public final String f17145b;

    public f(String str, ArrayList arrayList) {
        this.f17144a = arrayList;
        this.f17145b = str;
    }

    @Override
    public final Status i() {
        if (this.f17145b != null) {
            return Status.f6520e;
        }
        return Status.f6523r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.n(parcel, 1, this.f17144a);
        d0.l(parcel, 2, this.f17145b);
        d0.r(parcel, q6);
    }
}
