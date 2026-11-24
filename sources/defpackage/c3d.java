package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
public final class c3d extends b4 implements uc9 {
    public static final Parcelable.Creator<c3d> CREATOR = new d3d((byte) 2);
    public final int a;
    public final int b;
    public final Intent c;

    public c3d(int i, int i2, Intent intent) {
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
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        mve.k(parcel, 3, this.c, i);
        mve.s(parcel, r);
    }
}
