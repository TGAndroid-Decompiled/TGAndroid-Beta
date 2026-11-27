package defpackage;

import android.os.Parcel;
public final class aid extends u3d {
    public final caa b;
    public final Class c;

    public aid(caa caaVar) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", (byte) 4);
        this.b = caaVar;
        this.c = md1.class;
    }

    @Override
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        Class cls = this.c;
        caa caaVar = this.b;
        switch (i) {
            case 1:
                br7 br7Var = new br7(caaVar);
                parcel2.writeNoException();
                ald.d(parcel2, br7Var);
                return true;
            case 2:
                al5 T = br7.T(parcel.readStrongBinder());
                ald.b(parcel);
                v8a v8aVar = (v8a) br7.U(T);
                if (cls.isInstance(v8aVar) && caaVar != null) {
                    caaVar.n((v8a) cls.cast(v8aVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                al5 T2 = br7.T(parcel.readStrongBinder());
                String readString = parcel.readString();
                ald.b(parcel);
                v8a v8aVar2 = (v8a) br7.U(T2);
                if (cls.isInstance(v8aVar2) && caaVar != null) {
                    caaVar.P((v8a) cls.cast(v8aVar2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                al5 T3 = br7.T(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                ald.b(parcel);
                v8a v8aVar3 = (v8a) br7.U(T3);
                if (cls.isInstance(v8aVar3) && caaVar != null) {
                    caaVar.J((v8a) cls.cast(v8aVar3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                al5 T4 = br7.T(parcel.readStrongBinder());
                ald.b(parcel);
                v8a v8aVar4 = (v8a) br7.U(T4);
                if (cls.isInstance(v8aVar4) && caaVar != null) {
                    caaVar.B((v8a) cls.cast(v8aVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                al5 T5 = br7.T(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                ald.b(parcel);
                v8a v8aVar5 = (v8a) br7.U(T5);
                if (cls.isInstance(v8aVar5) && caaVar != null) {
                    caaVar.m((v8a) cls.cast(v8aVar5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                al5 T6 = br7.T(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                ald.b(parcel);
                v8a v8aVar6 = (v8a) br7.U(T6);
                if (cls.isInstance(v8aVar6) && caaVar != null) {
                    caaVar.N((v8a) cls.cast(v8aVar6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                al5 T7 = br7.T(parcel.readStrongBinder());
                int i2 = ald.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                ald.b(parcel);
                v8a v8aVar7 = (v8a) br7.U(T7);
                if (cls.isInstance(v8aVar7) && caaVar != null) {
                    caaVar.C((v8a) cls.cast(v8aVar7), z);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                al5 T8 = br7.T(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                ald.b(parcel);
                v8a v8aVar8 = (v8a) br7.U(T8);
                if (cls.isInstance(v8aVar8) && caaVar != null) {
                    caaVar.D((v8a) cls.cast(v8aVar8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                al5 T9 = br7.T(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                ald.b(parcel);
                v8a v8aVar9 = (v8a) br7.U(T9);
                if (cls.isInstance(v8aVar9) && caaVar != null) {
                    caaVar.p((v8a) cls.cast(v8aVar9), readInt4);
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
