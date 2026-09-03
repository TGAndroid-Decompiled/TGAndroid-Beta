package c8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import j7.f5;
public final class b extends c6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new b9.e(2);
    public final int f2156a;
    public final int f2157b;
    public final Intent f2158c;

    public b(int i10, int i11, Intent intent) {
        this.f2156a = i10;
        this.f2157b = i11;
        this.f2158c = intent;
    }

    @Override
    public final Status i() {
        if (this.f2157b == 0) {
            return Status.e;
        }
        return Status.f2700r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f2156a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f2157b);
        f5.k(parcel, 3, this.f2158c, i10);
        f5.r(parcel, q10);
    }
}
