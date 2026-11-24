package defpackage;

import android.os.Parcel;
public final class hdd extends dzc {
    public final k6a b;
    public final Class c;

    public hdd(k6a k6aVar) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", (byte) 4);
        this.b = k6aVar;
        this.c = ed1.class;
    }

    @Override
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        Class cls = this.c;
        k6a k6aVar = this.b;
        switch (i) {
            case 1:
                bo7 bo7Var = new bo7(k6aVar);
                parcel2.writeNoException();
                jgd.d(parcel2, bo7Var);
                return true;
            case 2:
                yi5 T = bo7.T(parcel.readStrongBinder());
                jgd.b(parcel);
                d5a d5aVar = (d5a) bo7.U(T);
                if (cls.isInstance(d5aVar) && k6aVar != null) {
                    k6aVar.p((d5a) cls.cast(d5aVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                yi5 T2 = bo7.T(parcel.readStrongBinder());
                String readString = parcel.readString();
                jgd.b(parcel);
                d5a d5aVar2 = (d5a) bo7.U(T2);
                if (cls.isInstance(d5aVar2) && k6aVar != null) {
                    k6aVar.T((d5a) cls.cast(d5aVar2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                yi5 T3 = bo7.T(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                jgd.b(parcel);
                d5a d5aVar3 = (d5a) bo7.U(T3);
                if (cls.isInstance(d5aVar3) && k6aVar != null) {
                    k6aVar.K((d5a) cls.cast(d5aVar3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                yi5 T4 = bo7.T(parcel.readStrongBinder());
                jgd.b(parcel);
                d5a d5aVar4 = (d5a) bo7.U(T4);
                if (cls.isInstance(d5aVar4) && k6aVar != null) {
                    k6aVar.z((d5a) cls.cast(d5aVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                yi5 T5 = bo7.T(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                jgd.b(parcel);
                d5a d5aVar5 = (d5a) bo7.U(T5);
                if (cls.isInstance(d5aVar5) && k6aVar != null) {
                    k6aVar.n((d5a) cls.cast(d5aVar5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                yi5 T6 = bo7.T(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                jgd.b(parcel);
                d5a d5aVar6 = (d5a) bo7.U(T6);
                if (cls.isInstance(d5aVar6) && k6aVar != null) {
                    k6aVar.R((d5a) cls.cast(d5aVar6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                yi5 T7 = bo7.T(parcel.readStrongBinder());
                int i2 = jgd.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                jgd.b(parcel);
                d5a d5aVar7 = (d5a) bo7.U(T7);
                if (cls.isInstance(d5aVar7) && k6aVar != null) {
                    k6aVar.E((d5a) cls.cast(d5aVar7), z);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                yi5 T8 = bo7.T(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                jgd.b(parcel);
                d5a d5aVar8 = (d5a) bo7.U(T8);
                if (cls.isInstance(d5aVar8) && k6aVar != null) {
                    k6aVar.F((d5a) cls.cast(d5aVar8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                yi5 T9 = bo7.T(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                jgd.b(parcel);
                d5a d5aVar9 = (d5a) bo7.U(T9);
                if (cls.isInstance(d5aVar9) && k6aVar != null) {
                    k6aVar.q((d5a) cls.cast(d5aVar9), readInt4);
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
