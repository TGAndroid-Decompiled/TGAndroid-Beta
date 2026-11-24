package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
public final class lud extends b4 {
    public static final Parcelable.Creator<lud> CREATOR = new rpd((byte) 21);
    public final int a;
    public final ConnectionConfiguration b;

    public lud(int i, ConnectionConfiguration connectionConfiguration) {
        this.a = i;
        this.b = connectionConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.k(parcel, 3, this.b, i);
        jte.s(parcel, r);
    }
}
