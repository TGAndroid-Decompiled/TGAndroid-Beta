package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class p13 extends b4 {
    public static final Parcelable.Creator<p13> CREATOR = new f41((byte) 10);
    public final PendingIntent a;
    public final v13 b;

    public p13(PendingIntent pendingIntent, v13 v13Var) {
        this.a = pendingIntent;
        this.b = v13Var;
        if (pendingIntent == null && v13Var == null) {
            u36.j("pendingIntent or createCredentialResponse must be specified.");
            throw null;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.k(parcel, 2, this.b, i);
        mve.s(parcel, r);
    }
}
