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
    public final List f17180a;
    public final String f17181b;

    public f(String str, ArrayList arrayList) {
        this.f17180a = arrayList;
        this.f17181b = str;
    }

    @Override
    public final Status i() {
        if (this.f17181b != null) {
            return Status.f6520e;
        }
        return Status.f6523r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.n(parcel, 1, this.f17180a);
        d0.l(parcel, 2, this.f17181b);
        d0.r(parcel, q6);
    }
}
