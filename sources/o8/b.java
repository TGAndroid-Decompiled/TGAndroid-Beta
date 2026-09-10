package o8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import w7.e0;
public final class b extends o6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new m8.h(22);
    public final int f14275a;
    public final int f14276b;
    public final Intent f14277c;

    public b(int i10, int i11, Intent intent) {
        this.f14275a = i10;
        this.f14276b = i11;
        this.f14277c = intent;
    }

    @Override
    public final Status i() {
        if (this.f14276b == 0) {
            return Status.e;
        }
        return Status.f4795r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f14275a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f14276b);
        e0.k(parcel, 3, this.f14277c, i10);
        e0.r(parcel, q6);
    }
}
