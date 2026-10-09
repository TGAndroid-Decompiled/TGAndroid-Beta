package d6;

import android.os.Parcel;
public final class z extends b8.b {
    public final h f8204b;
    public final Class f8205c;

    public z(h hVar) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 1);
        this.f8204b = hVar;
        this.f8205c = c.class;
    }

    @Override
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10 = false;
        Class cls = this.f8205c;
        h hVar = this.f8204b;
        switch (i10) {
            case 1:
                x6.b bVar = new x6.b(hVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.v.d(parcel2, bVar);
                return true;
            case 2:
                x6.a K0 = x6.b.K0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar = (f) x6.b.L0(K0);
                if (cls.isInstance(fVar) && hVar != null) {
                    hVar.o((f) cls.cast(fVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                x6.a K02 = x6.b.K0(parcel.readStrongBinder());
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar2 = (f) x6.b.L0(K02);
                if (cls.isInstance(fVar2) && hVar != null) {
                    hVar.x((f) cls.cast(fVar2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                x6.a K03 = x6.b.K0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar3 = (f) x6.b.L0(K03);
                if (cls.isInstance(fVar3) && hVar != null) {
                    hVar.g((f) cls.cast(fVar3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                x6.a K04 = x6.b.K0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar4 = (f) x6.b.L0(K04);
                if (cls.isInstance(fVar4) && hVar != null) {
                    hVar.v((f) cls.cast(fVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                x6.a K05 = x6.b.K0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar5 = (f) x6.b.L0(K05);
                if (cls.isInstance(fVar5) && hVar != null) {
                    hVar.j((f) cls.cast(fVar5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                x6.a K06 = x6.b.K0(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar6 = (f) x6.b.L0(K06);
                if (cls.isInstance(fVar6) && hVar != null) {
                    hVar.d((f) cls.cast(fVar6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                x6.a K07 = x6.b.K0(parcel.readStrongBinder());
                int i11 = com.google.android.gms.internal.cast.v.f7022a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar7 = (f) x6.b.L0(K07);
                if (cls.isInstance(fVar7) && hVar != null) {
                    hVar.h((f) cls.cast(fVar7), z10);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                x6.a K08 = x6.b.K0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar8 = (f) x6.b.L0(K08);
                if (cls.isInstance(fVar8) && hVar != null) {
                    hVar.u((f) cls.cast(fVar8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                x6.a K09 = x6.b.K0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.cast.v.b(parcel);
                f fVar9 = (f) x6.b.L0(K09);
                if (cls.isInstance(fVar9) && hVar != null) {
                    hVar.y((f) cls.cast(fVar9), readInt4);
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
