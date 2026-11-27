package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
public final class r5d extends c4 implements ie9 {
    public static final Parcelable.Creator<r5d> CREATOR = new s5d((byte) 2);
    public final int a;
    public final int b;
    public final Intent c;

    public r5d(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override
    public final Status a() {
        if (this.b == 0) {
            return Status.e;
        }
        return Status.r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bye.k(parcel, 3, this.c, i);
        bye.s(parcel, r);
    }
}
