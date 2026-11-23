package m6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new j7.b(29);
    public final Intent f20837a;

    public a(Intent intent) {
        this.f20837a = intent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 1, this.f20837a, i7);
        cc.s(parcel, r10);
    }
}
