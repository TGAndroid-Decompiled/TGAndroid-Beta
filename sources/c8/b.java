package c8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import j7.f5;
public final class b extends c6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new b9.e(2);
    public final int f2133a;
    public final int f2134b;
    public final Intent f2135c;

    public b(int i10, int i11, Intent intent) {
        this.f2133a = i10;
        this.f2134b = i11;
        this.f2135c = intent;
    }

    @Override
    public final Status i() {
        if (this.f2134b == 0) {
            return Status.e;
        }
        return Status.f2717r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f2133a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f2134b);
        f5.k(parcel, 3, this.f2135c, i10);
        f5.r(parcel, q10);
    }
}
