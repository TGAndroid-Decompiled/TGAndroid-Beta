package defpackage;

import android.os.Parcel;
public final class m7f extends ezc {
    public final yi5 Z(bo7 bo7Var, String str, int i) {
        Parcel R = R();
        mgd.b(R, bo7Var);
        R.writeString(str);
        R.writeInt(i);
        Parcel P = P(R, 2);
        yi5 T = bo7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }

    public final yi5 a0(bo7 bo7Var, String str, int i) {
        Parcel R = R();
        mgd.b(R, bo7Var);
        R.writeString(str);
        R.writeInt(i);
        Parcel P = P(R, 4);
        yi5 T = bo7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }

    public final yi5 b0(bo7 bo7Var, String str, boolean z, long j) {
        Parcel R = R();
        mgd.b(R, bo7Var);
        R.writeString(str);
        R.writeInt(z ? 1 : 0);
        R.writeLong(j);
        Parcel P = P(R, 7);
        yi5 T = bo7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }

    public final yi5 c0(bo7 bo7Var, String str, int i, bo7 bo7Var2) {
        Parcel R = R();
        mgd.b(R, bo7Var);
        R.writeString(str);
        R.writeInt(i);
        mgd.b(R, bo7Var2);
        Parcel P = P(R, 8);
        yi5 T = bo7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }
}
