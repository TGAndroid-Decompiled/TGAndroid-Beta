package o8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import w7.e0;
public final class b extends o6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new m8.h(22);
    public final int f15492a;
    public final int f15493b;
    public final Intent f15494c;

    public b(int i10, int i11, Intent intent) {
        this.f15492a = i10;
        this.f15493b = i11;
        this.f15494c = intent;
    }

    @Override
    public final Status i() {
        if (this.f15493b == 0) {
            return Status.e;
        }
        return Status.f6016r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f15492a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f15493b);
        e0.k(parcel, 3, this.f15494c, i10);
        e0.r(parcel, q6);
    }
}
