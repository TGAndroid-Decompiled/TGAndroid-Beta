package o8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import w7.f0;
public final class b extends o6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new m8.h(20);
    public final int f17701a;
    public final int f17702b;
    public final Intent f17703c;

    public b(int i10, int i11, Intent intent) {
        this.f17701a = i10;
        this.f17702b = i11;
        this.f17703c = intent;
    }

    @Override
    public final Status h() {
        if (this.f17702b == 0) {
            return Status.e;
        }
        return Status.f6344r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f17701a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f17702b);
        f0.k(parcel, 3, this.f17703c, i10);
        f0.r(parcel, q6);
    }
}
