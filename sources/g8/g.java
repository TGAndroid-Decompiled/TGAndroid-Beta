package g8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import w7.f0;
public final class g extends o6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<g> CREATOR = new j(0);
    public final Status f10931a;
    public final h f10932b;

    public g(Status status, h hVar) {
        this.f10931a = status;
        this.f10932b = hVar;
    }

    @Override
    public final Status h() {
        return this.f10931a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f10931a, i10);
        f0.k(parcel, 2, this.f10932b, i10);
        f0.r(parcel, q6);
    }
}
