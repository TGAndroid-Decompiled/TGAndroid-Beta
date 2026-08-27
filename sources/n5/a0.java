package n5;

import android.os.Parcel;

public final class a0 extends b7.a {

    public final i f18288b;

    public final Class f18289c;

    public a0(i iVar) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 2);
        this.f18288b = iVar;
        this.f18289c = c.class;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        Class cls = this.f18289c;
        i iVar = this.f18288b;
        switch (i10) {
            case 1:
                i6.b bVar = new i6.b(iVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.t.d(parcel2, bVar);
                return true;
            case 2:
                i6.a aVarJ0 = i6.b.J0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar = (g) i6.b.K0(aVarJ0);
                if (cls.isInstance(gVar) && iVar != null) {
                    iVar.d((g) cls.cast(gVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                i6.a aVarJ1 = i6.b.J0(parcel.readStrongBinder());
                String string = parcel.readString();
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar2 = (g) i6.b.K0(aVarJ1);
                if (cls.isInstance(gVar2) && iVar != null) {
                    iVar.i((g) cls.cast(gVar2), string);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                i6.a aVarJ2 = i6.b.J0(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar3 = (g) i6.b.K0(aVarJ2);
                if (cls.isInstance(gVar3) && iVar != null) {
                    iVar.h((g) cls.cast(gVar3), i11);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                i6.a aVarJ3 = i6.b.J0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar4 = (g) i6.b.K0(aVarJ3);
                if (cls.isInstance(gVar4) && iVar != null) {
                    iVar.a((g) cls.cast(gVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                i6.a aVarJ4 = i6.b.J0(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar5 = (g) i6.b.K0(aVarJ4);
                if (cls.isInstance(gVar5) && iVar != null) {
                    iVar.c((g) cls.cast(gVar5), i12);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                i6.a aVarJ5 = i6.b.J0(parcel.readStrongBinder());
                String string2 = parcel.readString();
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar6 = (g) i6.b.K0(aVarJ5);
                if (cls.isInstance(gVar6) && iVar != null) {
                    iVar.j((g) cls.cast(gVar6), string2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                i6.a aVarJ6 = i6.b.J0(parcel.readStrongBinder());
                int i13 = com.google.android.gms.internal.cast.t.f3660a;
                boolean z10 = parcel.readInt() != 0;
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar7 = (g) i6.b.K0(aVarJ6);
                if (cls.isInstance(gVar7) && iVar != null) {
                    iVar.e((g) cls.cast(gVar7), z10);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                i6.a aVarJ7 = i6.b.J0(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar8 = (g) i6.b.K0(aVarJ7);
                if (cls.isInstance(gVar8) && iVar != null) {
                    iVar.b((g) cls.cast(gVar8), i14);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                i6.a aVarJ8 = i6.b.J0(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar9 = (g) i6.b.K0(aVarJ8);
                if (cls.isInstance(gVar9) && iVar != null) {
                    iVar.f((g) cls.cast(gVar9), i15);
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
