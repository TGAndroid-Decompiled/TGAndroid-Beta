package a8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.internal.cast.o;
public final class b extends a6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new w.a(1);
    public final int f216a;
    public final int f217b;
    public final Intent f218c;

    public b(int i10, int i11, Intent intent) {
        this.f216a = i10;
        this.f217b = i11;
        this.f218c = intent;
    }

    @Override
    public final Status i() {
        if (this.f217b == 0) {
            return Status.f3751e;
        }
        return Status.f3754r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.f216a);
        o.s(parcel, 2, 4);
        parcel.writeInt(this.f217b);
        o.k(parcel, 3, this.f218c, i10);
        o.r(parcel, q6);
    }
}
