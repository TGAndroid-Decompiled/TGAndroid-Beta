package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class owd extends b4 {
    public static final Parcelable.Creator<owd> CREATOR = new urd((byte) 21);
    public final int a;
    public final ConnectionConfiguration b;

    public owd(int i, ConnectionConfiguration connectionConfiguration) {
        this.a = i;
        this.b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.k(parcel, 3, this.b, i);
        mve.s(parcel, r);
    }
}
