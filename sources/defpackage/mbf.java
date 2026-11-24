package defpackage;

import android.os.Parcel;
public final class mbf extends f1d {
    public final xk5 Z(eq7 eq7Var, String str, int i, eq7 eq7Var2) {
        Parcel R = R();
        nid.b(R, eq7Var);
        R.writeString(str);
        R.writeInt(i);
        nid.b(R, eq7Var2);
        Parcel P = P(R, 2);
        xk5 T = eq7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }

    public final xk5 a0(eq7 eq7Var, String str, int i, eq7 eq7Var2) {
        Parcel R = R();
        nid.b(R, eq7Var);
        R.writeString(str);
        R.writeInt(i);
        nid.b(R, eq7Var2);
        Parcel P = P(R, 3);
        xk5 T = eq7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }
}
