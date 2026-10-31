package o8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import m8.i;
import w7.h0;
public final class b extends o6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new i(19);
    public final int f14102a;
    public final int f14103b;
    public final Intent f14104c;

    public b(int i10, int i11, Intent intent) {
        this.f14102a = i10;
        this.f14103b = i11;
        this.f14104c = intent;
    }

    @Override
    public final Status a() {
        if (this.f14103b == 0) {
            return Status.e;
        }
        return Status.f4333r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f14102a);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f14103b);
        h0.k(parcel, 3, this.f14104c, i10);
        h0.r(parcel, q6);
    }
}
