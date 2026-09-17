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
    public final List f17008a;
    public final String f17009b;

    public f(String str, ArrayList arrayList) {
        this.f17008a = arrayList;
        this.f17009b = str;
    }

    @Override
    public final Status i() {
        if (this.f17009b != null) {
            return Status.f4969e;
        }
        return Status.f4972r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.n(parcel, 1, this.f17008a);
        e0.l(parcel, 2, this.f17009b);
        e0.r(parcel, q6);
    }
}
