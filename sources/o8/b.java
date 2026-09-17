package o8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import w7.e0;
public final class b extends o6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new m8.h(22);
    public final int f17005a;
    public final int f17006b;
    public final Intent f17007c;

    public b(int i10, int i11, Intent intent) {
        this.f17005a = i10;
        this.f17006b = i11;
        this.f17007c = intent;
    }

    @Override
    public final Status i() {
        if (this.f17006b == 0) {
            return Status.f4969e;
        }
        return Status.f4972r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f17005a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f17006b);
        e0.k(parcel, 3, this.f17007c, i10);
        e0.r(parcel, q6);
    }
}
