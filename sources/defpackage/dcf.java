package defpackage;

import android.os.Parcel;
public final class dcf extends v3d {
    public final al5 Z(br7 br7Var, String str, int i) {
        Parcel R = R();
        dld.b(R, br7Var);
        R.writeString(str);
        R.writeInt(i);
        Parcel P = P(R, 2);
        al5 T = br7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }

    public final al5 a0(br7 br7Var, String str, int i) {
        Parcel R = R();
        dld.b(R, br7Var);
        R.writeString(str);
        R.writeInt(i);
        Parcel P = P(R, 4);
        al5 T = br7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }

    public final al5 b0(br7 br7Var, String str, boolean z, long j) {
        Parcel R = R();
        dld.b(R, br7Var);
        R.writeString(str);
        R.writeInt(z ? 1 : 0);
        R.writeLong(j);
        Parcel P = P(R, 7);
        al5 T = br7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }

    public final al5 c0(br7 br7Var, String str, int i, br7 br7Var2) {
        Parcel R = R();
        dld.b(R, br7Var);
        R.writeString(str);
        R.writeInt(i);
        dld.b(R, br7Var2);
        Parcel P = P(R, 8);
        al5 T = br7.T(P.readStrongBinder());
        P.recycle();
        return T;
    }
}
