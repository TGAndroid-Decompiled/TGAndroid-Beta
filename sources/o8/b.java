package o8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import w7.c0;
public final class b extends o6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new m8.h(22);
    public final int f16844a;
    public final int f16845b;
    public final Intent f16846c;

    public b(int i10, int i11, Intent intent) {
        this.f16844a = i10;
        this.f16845b = i11;
        this.f16846c = intent;
    }

    @Override
    public final Status i() {
        if (this.f16845b == 0) {
            return Status.f6519e;
        }
        return Status.f6522r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f16844a);
        c0.s(parcel, 2, 4);
        parcel.writeInt(this.f16845b);
        c0.k(parcel, 3, this.f16846c, i10);
        c0.r(parcel, q6);
    }
}
