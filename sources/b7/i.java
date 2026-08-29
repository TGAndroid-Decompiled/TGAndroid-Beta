package b7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.internal.cast.o;
import java.util.ArrayList;
public final class i extends a6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new w.a(20);
    public Status f1955a;
    public ArrayList f1956b;
    public String[] f1957c;

    @Override
    public final Status i() {
        return this.f1955a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.k(parcel, 1, this.f1955a, i10);
        o.p(parcel, 2, this.f1956b);
        o.m(parcel, 3, this.f1957c);
        o.r(parcel, q6);
    }
}
