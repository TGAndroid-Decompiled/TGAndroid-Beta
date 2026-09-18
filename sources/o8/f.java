package o8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import java.util.List;
import w7.f0;
public final class f extends o6.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(23);
    public final List f15634a;
    public final String f15635b;

    public f(String str, ArrayList arrayList) {
        this.f15634a = arrayList;
        this.f15635b = str;
    }

    @Override
    public final Status i() {
        if (this.f15635b != null) {
            return Status.e;
        }
        return Status.f6021r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.n(parcel, 1, this.f15634a);
        f0.l(parcel, 2, this.f15635b);
        f0.r(parcel, q6);
    }
}
