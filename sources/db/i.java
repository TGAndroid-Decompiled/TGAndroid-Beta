package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new k(0);
    public final int f8250a;
    public final String f8251b;
    public final int f8252c;

    public i(int i7, int i10, String simOperatorName) {
        kotlin.jvm.internal.j.e(simOperatorName, "simOperatorName");
        this.f8250a = i7;
        this.f8251b = simOperatorName;
        this.f8252c = i10;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.q(dest, 1, 4);
        dest.writeInt(this.f8250a);
        bc.l(dest, 2, this.f8251b);
        bc.q(dest, 3, 4);
        dest.writeInt(this.f8252c);
        bc.s(dest, r10);
    }
}
