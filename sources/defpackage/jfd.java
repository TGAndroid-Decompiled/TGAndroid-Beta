package defpackage;

import android.os.Parcel;
public final class jfd extends e1d {
    public final m8a b;
    public final Class c;

    public jfd(m8a m8aVar) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", (byte) 4);
        this.b = m8aVar;
        this.c = me1.class;
    }

    @Override
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        Class cls = this.c;
        m8a m8aVar = this.b;
        switch (i) {
            case 1:
                eq7 eq7Var = new eq7(m8aVar);
                parcel2.writeNoException();
                kid.d(parcel2, eq7Var);
                return true;
            case 2:
                xk5 T = eq7.T(parcel.readStrongBinder());
                kid.b(parcel);
                f7a f7aVar = (f7a) eq7.U(T);
                if (cls.isInstance(f7aVar) && m8aVar != null) {
                    m8aVar.o((f7a) cls.cast(f7aVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                xk5 T2 = eq7.T(parcel.readStrongBinder());
                String readString = parcel.readString();
                kid.b(parcel);
                f7a f7aVar2 = (f7a) eq7.U(T2);
                if (cls.isInstance(f7aVar2) && m8aVar != null) {
                    m8aVar.R((f7a) cls.cast(f7aVar2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                xk5 T3 = eq7.T(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                kid.b(parcel);
                f7a f7aVar3 = (f7a) eq7.U(T3);
                if (cls.isInstance(f7aVar3) && m8aVar != null) {
                    m8aVar.L((f7a) cls.cast(f7aVar3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                xk5 T4 = eq7.T(parcel.readStrongBinder());
                kid.b(parcel);
                f7a f7aVar4 = (f7a) eq7.U(T4);
                if (cls.isInstance(f7aVar4) && m8aVar != null) {
                    m8aVar.z((f7a) cls.cast(f7aVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                xk5 T5 = eq7.T(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                kid.b(parcel);
                f7a f7aVar5 = (f7a) eq7.U(T5);
                if (cls.isInstance(f7aVar5) && m8aVar != null) {
                    m8aVar.l((f7a) cls.cast(f7aVar5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                xk5 T6 = eq7.T(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                kid.b(parcel);
                f7a f7aVar6 = (f7a) eq7.U(T6);
                if (cls.isInstance(f7aVar6) && m8aVar != null) {
                    m8aVar.P((f7a) cls.cast(f7aVar6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                xk5 T7 = eq7.T(parcel.readStrongBinder());
                int i2 = kid.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                kid.b(parcel);
                f7a f7aVar7 = (f7a) eq7.U(T7);
                if (cls.isInstance(f7aVar7) && m8aVar != null) {
                    m8aVar.B((f7a) cls.cast(f7aVar7), z);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                xk5 T8 = eq7.T(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                kid.b(parcel);
                f7a f7aVar8 = (f7a) eq7.U(T8);
                if (cls.isInstance(f7aVar8) && m8aVar != null) {
                    m8aVar.C((f7a) cls.cast(f7aVar8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                xk5 T9 = eq7.T(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                kid.b(parcel);
                f7a f7aVar9 = (f7a) eq7.U(T9);
                if (cls.isInstance(f7aVar9) && m8aVar != null) {
                    m8aVar.q((f7a) cls.cast(f7aVar9), readInt4);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
    }
}
