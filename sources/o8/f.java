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
    public final List f15495a;
    public final String f15496b;

    public f(String str, ArrayList arrayList) {
        this.f15495a = arrayList;
        this.f15496b = str;
    }

    @Override
    public final Status i() {
        if (this.f15496b != null) {
            return Status.e;
        }
        return Status.f6016r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.n(parcel, 1, this.f15495a);
        e0.l(parcel, 2, this.f15496b);
        e0.r(parcel, q6);
    }
}
