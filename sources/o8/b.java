package o8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import w7.g0;
public final class b extends o6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new m8.h(20);
    public final int f16611a;
    public final int f16612b;
    public final Intent f16613c;

    public b(int i10, int i11, Intent intent) {
        this.f16611a = i10;
        this.f16612b = i11;
        this.f16613c = intent;
    }

    @Override
    public final Status h() {
        if (this.f16612b == 0) {
            return Status.e;
        }
        return Status.f4884r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f16611a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f16612b);
        g0.k(parcel, 3, this.f16613c, i10);
        g0.r(parcel, q6);
    }
}
