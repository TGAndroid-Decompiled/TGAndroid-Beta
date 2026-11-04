package f6;

import android.os.Parcel;
public final class z extends com.google.android.gms.internal.cast.o {
    public final h f11494b;
    public final Class f11495c;

    public z(h hVar) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 0);
        this.f11494b = hVar;
        this.f11495c = c.class;
    }

    @Override
    public final boolean K0(int i3, Parcel parcel, Parcel parcel2) {
        boolean z10 = false;
        Class cls = this.f11495c;
        h hVar = this.f11494b;
        switch (i3) {
            case 1:
                z6.b bVar = new z6.b(hVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.u.d(parcel2, bVar);
                return true;
            case 2:
                z6.a M0 = z6.b.M0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar = (f) z6.b.N0(M0);
                if (cls.isInstance(fVar) && hVar != null) {
                    hVar.g((f) cls.cast(fVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                z6.a M02 = z6.b.M0(parcel.readStrongBinder());
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar2 = (f) z6.b.N0(M02);
                if (cls.isInstance(fVar2) && hVar != null) {
                    hVar.f((f) cls.cast(fVar2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                z6.a M03 = z6.b.M0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar3 = (f) z6.b.N0(M03);
                if (cls.isInstance(fVar3) && hVar != null) {
                    hVar.n((f) cls.cast(fVar3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                z6.a M04 = z6.b.M0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar4 = (f) z6.b.N0(M04);
                if (cls.isInstance(fVar4) && hVar != null) {
                    hVar.h((f) cls.cast(fVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                z6.a M05 = z6.b.M0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar5 = (f) z6.b.N0(M05);
                if (cls.isInstance(fVar5) && hVar != null) {
                    hVar.a((f) cls.cast(fVar5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                z6.a M06 = z6.b.M0(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar6 = (f) z6.b.N0(M06);
                if (cls.isInstance(fVar6) && hVar != null) {
                    hVar.j((f) cls.cast(fVar6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                z6.a M07 = z6.b.M0(parcel.readStrongBinder());
                int i10 = com.google.android.gms.internal.cast.u.f7057a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar7 = (f) z6.b.N0(M07);
                if (cls.isInstance(fVar7) && hVar != null) {
                    hVar.l((f) cls.cast(fVar7), z10);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                z6.a M08 = z6.b.M0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar8 = (f) z6.b.N0(M08);
                if (cls.isInstance(fVar8) && hVar != null) {
                    hVar.m((f) cls.cast(fVar8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                z6.a M09 = z6.b.M0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                f fVar9 = (f) z6.b.N0(M09);
                if (cls.isInstance(fVar9) && hVar != null) {
                    hVar.d((f) cls.cast(fVar9), readInt4);
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
