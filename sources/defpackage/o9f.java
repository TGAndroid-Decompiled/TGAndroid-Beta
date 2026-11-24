package defpackage;

import android.os.Parcel;
public final class o9f extends f1d {
    public final xk5 Z(eq7 eq7Var, String str, int i) {
        Parcel R = R();
        nid.b(R, eq7Var);
        R.writeString(str);
        R.writeInt(i);
        Parcel P = P(R, 2);
        xk5 T = eq7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }

    public final xk5 a0(eq7 eq7Var, String str, int i) {
        Parcel R = R();
        nid.b(R, eq7Var);
        R.writeString(str);
        R.writeInt(i);
        Parcel P = P(R, 4);
        xk5 T = eq7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }

    public final xk5 b0(eq7 eq7Var, String str, boolean z, long j) {
        Parcel R = R();
        nid.b(R, eq7Var);
        R.writeString(str);
        R.writeInt(z ? 1 : 0);
        R.writeLong(j);
        Parcel P = P(R, 7);
        xk5 T = eq7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }

    public final xk5 c0(eq7 eq7Var, String str, int i, eq7 eq7Var2) {
        Parcel R = R();
        nid.b(R, eq7Var);
        R.writeString(str);
        R.writeInt(i);
        nid.b(R, eq7Var2);
        Parcel P = P(R, 8);
        xk5 T = eq7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }
}
