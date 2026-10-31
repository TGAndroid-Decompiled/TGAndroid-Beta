package d6;

import android.os.Parcel;
public final class z extends b8.b {
    public final h f5788b;
    public final Class f5789c;

    public z(h hVar) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 1);
        this.f5788b = hVar;
        this.f5789c = c.class;
    }

    @Override
    public final boolean K0(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10 = false;
        Class cls = this.f5789c;
        h hVar = this.f5788b;
        switch (i10) {
            case 1:
                x6.b bVar = new x6.b(hVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.u.d(parcel2, bVar);
                return true;
            case 2:
                x6.a M0 = x6.b.M0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar = (f) x6.b.N0(M0);
                if (cls.isInstance(fVar) && hVar != null) {
                    hVar.t((f) cls.cast(fVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                x6.a M02 = x6.b.M0(parcel.readStrongBinder());
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar2 = (f) x6.b.N0(M02);
                if (cls.isInstance(fVar2) && hVar != null) {
                    hVar.F((f) cls.cast(fVar2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                x6.a M03 = x6.b.M0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar3 = (f) x6.b.N0(M03);
                if (cls.isInstance(fVar3) && hVar != null) {
                    hVar.k((f) cls.cast(fVar3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                x6.a M04 = x6.b.M0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar4 = (f) x6.b.N0(M04);
                if (cls.isInstance(fVar4) && hVar != null) {
                    hVar.A((f) cls.cast(fVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                x6.a M05 = x6.b.M0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar5 = (f) x6.b.N0(M05);
                if (cls.isInstance(fVar5) && hVar != null) {
                    hVar.q((f) cls.cast(fVar5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                x6.a M06 = x6.b.M0(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar6 = (f) x6.b.N0(M06);
                if (cls.isInstance(fVar6) && hVar != null) {
                    hVar.j((f) cls.cast(fVar6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                x6.a M07 = x6.b.M0(parcel.readStrongBinder());
                int i11 = com.google.android.gms.internal.cast.u.f4789a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar7 = (f) x6.b.N0(M07);
                if (cls.isInstance(fVar7) && hVar != null) {
                    hVar.o((f) cls.cast(fVar7), z10);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                x6.a M08 = x6.b.M0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar8 = (f) x6.b.N0(M08);
                if (cls.isInstance(fVar8) && hVar != null) {
                    hVar.u((f) cls.cast(fVar8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                x6.a M09 = x6.b.M0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar9 = (f) x6.b.N0(M09);
                if (cls.isInstance(fVar9) && hVar != null) {
                    hVar.G((f) cls.cast(fVar9), readInt4);
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
