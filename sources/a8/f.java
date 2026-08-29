package a8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.internal.cast.o;
import java.util.ArrayList;
import java.util.List;
public final class f extends a6.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new w.a(2);
    public final List f219a;
    public final String f220b;

    public f(String str, ArrayList arrayList) {
        this.f219a = arrayList;
        this.f220b = str;
    }

    @Override
    public final Status i() {
        if (this.f220b != null) {
            return Status.f3751e;
        }
        return Status.f3754r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.n(parcel, 1, this.f219a);
        o.l(parcel, 2, this.f220b);
        o.r(parcel, q6);
    }
}
