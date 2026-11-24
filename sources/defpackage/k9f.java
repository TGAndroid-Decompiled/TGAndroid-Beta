package defpackage;

import android.os.Parcel;
public final class k9f extends ezc {
    public final yi5 Z(bo7 bo7Var, String str, int i, bo7 bo7Var2) {
        Parcel R = R();
        mgd.b(R, bo7Var);
        R.writeString(str);
        R.writeInt(i);
        mgd.b(R, bo7Var2);
        Parcel P = P(R, 2);
        yi5 T = bo7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }

    public final yi5 a0(bo7 bo7Var, String str, int i, bo7 bo7Var2) {
        Parcel R = R();
        mgd.b(R, bo7Var);
        R.writeString(str);
        R.writeInt(i);
        mgd.b(R, bo7Var2);
        Parcel P = P(R, 3);
        yi5 T = bo7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }
}
