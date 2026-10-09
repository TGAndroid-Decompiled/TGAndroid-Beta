package o8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import w7.d0;
public final class b extends o6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new m8.h(22);
    public final int f17091a;
    public final int f17092b;
    public final Intent f17093c;

    public b(int i10, int i11, Intent intent) {
        this.f17091a = i10;
        this.f17092b = i11;
        this.f17093c = intent;
    }

    @Override
    public final Status i() {
        if (this.f17092b == 0) {
            return Status.f6521e;
        }
        return Status.f6524r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f17091a);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f17092b);
        d0.k(parcel, 3, this.f17093c, i10);
        d0.r(parcel, q6);
    }
}
