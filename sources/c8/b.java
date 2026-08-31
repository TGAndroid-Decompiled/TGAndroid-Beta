package c8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import j7.g5;
public final class b extends c6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new b9.e(2);
    public final int f2320a;
    public final int f2321b;
    public final Intent f2322c;

    public b(int i10, int i11, Intent intent) {
        this.f2320a = i10;
        this.f2321b = i11;
        this.f2322c = intent;
    }

    @Override
    public final Status i() {
        if (this.f2321b == 0) {
            return Status.f2642e;
        }
        return Status.f2645r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f2320a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f2321b);
        g5.k(parcel, 3, this.f2322c, i10);
        g5.r(parcel, q10);
    }
}
