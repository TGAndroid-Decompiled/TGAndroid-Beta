package d6;

import android.os.Parcel;
public final class z extends b8.b {
    public final h f6329b;
    public final Class f6330c;

    public z(h hVar) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 1);
        this.f6329b = hVar;
        this.f6330c = c.class;
    }

    @Override
    public final boolean J0(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10 = false;
        Class cls = this.f6330c;
        h hVar = this.f6329b;
        switch (i10) {
            case 1:
                x6.b bVar = new x6.b(hVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.v.d(parcel2, bVar);
                return true;
            case 2:
                x6.a L0 = x6.b.L0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar = (f) x6.b.M0(L0);
                if (cls.isInstance(fVar) && hVar != null) {
                    hVar.r((f) cls.cast(fVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                x6.a L02 = x6.b.L0(parcel.readStrongBinder());
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar2 = (f) x6.b.M0(L02);
                if (cls.isInstance(fVar2) && hVar != null) {
                    hVar.A((f) cls.cast(fVar2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                x6.a L03 = x6.b.L0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar3 = (f) x6.b.M0(L03);
                if (cls.isInstance(fVar3) && hVar != null) {
                    hVar.c((f) cls.cast(fVar3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                x6.a L04 = x6.b.L0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar4 = (f) x6.b.M0(L04);
                if (cls.isInstance(fVar4) && hVar != null) {
                    hVar.z((f) cls.cast(fVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                x6.a L05 = x6.b.L0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar5 = (f) x6.b.M0(L05);
                if (cls.isInstance(fVar5) && hVar != null) {
                    hVar.p((f) cls.cast(fVar5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                x6.a L06 = x6.b.L0(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar6 = (f) x6.b.M0(L06);
                if (cls.isInstance(fVar6) && hVar != null) {
                    hVar.b((f) cls.cast(fVar6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                x6.a L07 = x6.b.L0(parcel.readStrongBinder());
                int i11 = com.google.android.gms.internal.cast.v.f5290a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar7 = (f) x6.b.M0(L07);
                if (cls.isInstance(fVar7) && hVar != null) {
                    hVar.d((f) cls.cast(fVar7), z10);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                x6.a L08 = x6.b.L0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar8 = (f) x6.b.M0(L08);
                if (cls.isInstance(fVar8) && hVar != null) {
                    hVar.v((f) cls.cast(fVar8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                x6.a L09 = x6.b.L0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar9 = (f) x6.b.M0(L09);
                if (cls.isInstance(fVar9) && hVar != null) {
                    hVar.B((f) cls.cast(fVar9), readInt4);
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
