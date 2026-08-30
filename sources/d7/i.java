package d7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import j7.f5;
import java.util.ArrayList;
public final class i extends c6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new b9.e(11);
    public Status f4237a;
    public ArrayList f4238b;
    public String[] f4239c;

    @Override
    public final Status i() {
        return this.f4237a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.f4237a, i10);
        f5.p(parcel, 2, this.f4238b);
        f5.m(parcel, 3, this.f4239c);
        f5.r(parcel, q10);
    }
}
