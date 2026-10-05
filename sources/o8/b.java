package o8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import w7.g0;
public final class b extends o6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new m8.h(22);
    public final int f17147a;
    public final int f17148b;
    public final Intent f17149c;

    public b(int i10, int i11, Intent intent) {
        this.f17147a = i10;
        this.f17148b = i11;
        this.f17149c = intent;
    }

    @Override
    public final Status i() {
        if (this.f17148b == 0) {
            return Status.f6469e;
        }
        return Status.f6472r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f17147a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f17148b);
        g0.k(parcel, 3, this.f17149c, i10);
        g0.r(parcel, q6);
    }
}
