package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class e03 extends b4 {
    public static final Parcelable.Creator<e03> CREATOR = new x21((byte) 10);
    public final PendingIntent a;
    public final j03 b;

    public e03(PendingIntent pendingIntent, j03 j03Var) {
        this.a = pendingIntent;
        this.b = j03Var;
        if (pendingIntent == null && j03Var == null) {
            w26.j("pendingIntent or createCredentialResponse must be specified.");
            throw null;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.k(parcel, 2, this.b, i);
        jte.s(parcel, r);
    }
}
