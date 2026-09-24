package o8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import w7.f0;
public final class b extends o6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new m8.h(22);
    public final int f15659a;
    public final int f15660b;
    public final Intent f15661c;

    public b(int i10, int i11, Intent intent) {
        this.f15659a = i10;
        this.f15660b = i11;
        this.f15661c = intent;
    }

    @Override
    public final Status i() {
        if (this.f15660b == 0) {
            return Status.e;
        }
        return Status.f6004r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f15659a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f15660b);
        f0.k(parcel, 3, this.f15661c, i10);
        f0.r(parcel, q6);
    }
}
