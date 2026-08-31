package d7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import j7.g5;
import java.util.ArrayList;
public final class i extends c6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new b9.e(11);
    public Status f4310a;
    public ArrayList f4311b;
    public String[] f4312c;

    @Override
    public final Status i() {
        return this.f4310a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.f4310a, i10);
        g5.p(parcel, 2, this.f4311b);
        g5.m(parcel, 3, this.f4312c);
        g5.r(parcel, q10);
    }
}
